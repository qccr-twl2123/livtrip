package com.livtrip.web.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.domain.AlipayDataDataserviceBillDownloadurlQueryModel;
import com.alipay.api.domain.AlipayTradePayModel;
import com.alipay.api.domain.AlipayTradeRefundModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.livtrip.web.constant.Constant;
import com.livtrip.web.model.request.AliPayNotifyReq;
import com.livtrip.web.model.request.AlipayReturnReq;
import com.livtrip.web.model.request.RefundReq;
import com.livtrip.web.pay.AliPayApi;
import com.livtrip.web.pay.AliPayApiConfig;
import com.livtrip.web.service.OrderService;
import com.livtrip.web.service.PaySerialService;
import com.livtrip.web.service.PayService;
import com.livtrip.web.util.StringUtils;
import com.livtrip.web.validator.ValidatorUtils;
import com.xiaoleilu.hutool.util.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 支付宝支付控制器
 * Created by xierongli on 17/6/29.
 */
@Controller
@RequestMapping("alipay")
public class AlipayController extends BaseController{

    private String notify_domain ="http://www.livtrip.com";

    private  String charset = "UTF-8";
    @Value("${pay.alipay.privateKey}")
    private  String privateKey;
    @Value("${pay.alipay.alipayPulicKey}")
    private  String alipayPublicKey;
    @Value("${pay.alipay.serverUrl}")
    private  String serviceUrl;

    @Value("${pay.alipay.appId}")
    private  String appId ;
    private  String signType = "RSA2";
    @Value("${pay.alipay.notifyDomain}")
    private  String notifyDomain;

    @Autowired
    private PayService payService;

    @Autowired
    private PaySerialService paySerialService;

    @Autowired
    private OrderService orderService;


    public AliPayApiConfig getApiConfig() {
        AliPayApiConfig aliPayApiConfig = AliPayApiConfig.New()
                .setAppId(appId)
                .setAlipayPublicKey(alipayPublicKey)
                .setCharset(charset)
                .setPrivateKey(privateKey)
                .setServiceUrl(serviceUrl)
                .setSignType(signType)
                .build();
        return aliPayApiConfig;
    }



    /**
     * PC支付
     */
    @RequestMapping("pc")
    public void pcPay(HttpServletResponse response){
        try {
            String totalAmount = "1";
            String outTradeNo =StringUtils.getOutTradeNo();
            AlipayTradePayModel model = new AlipayTradePayModel();
            model.setOutTradeNo(outTradeNo);
            model.setProductCode("FAST_INSTANT_TRADE_PAY");
            model.setTotalAmount(totalAmount);
            model.setSubject("Javen PC支付测试");
            model.setBody("Javen IJPay PC支付测试");

            payService.pcPay(response,model, Constant.RETURN_URL, Constant.NOTIFY_URL);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }


    /**
     * 下载对账单
     * @param  billDate 账单日期
     * @return  
     * @author xierongli
     * @date 17/7/29 下午5:12
     */
    @RequestMapping("bill")
    public String dataDataserviceBill(@RequestParam String billDate, ModelMap modelMap) {
        try {
            AlipayDataDataserviceBillDownloadurlQueryModel model = new AlipayDataDataserviceBillDownloadurlQueryModel();
            model.setBillType("trade");
            model.setBillDate(billDate);
            String resultStr = AliPayApi.billDownloadurlQuery(getApiConfig(),model);
            modelMap.put("bill",resultStr);
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        return "bill";
    }

    /**
     * 退款操作
     * @param
     * @return
     * @author xierongli
     * @date 17/7/29 下午5:20
     */
    @RequestMapping("refund")
    public String tradeRefund(RefundReq refundReq,ModelMap modelMap) {
        ValidatorUtils.validateEntity(refundReq);
        try {
            AlipayTradeRefundModel model = new AlipayTradeRefundModel();
            model.setOutTradeNo(refundReq.getOutTradeNo());
            model.setTradeNo(StringUtils.getOutTradeNo());
            model.setRefundAmount(refundReq.getRefundAmount());
            model.setRefundReason(refundReq.getRefundReason());
            String resultStr = AliPayApi.tradeRefund(getApiConfig(),model);
            modelMap.put("refund", resultStr);
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        return "refund";
    }


    /**
     * App支付支付回调通知
     * https://doc.open.alipay.com/docs/doc.htm?treeId=54&articleId=106370&
     * docType=1#s3
     */
    @RequestMapping("notify")
    public void appPayNotify(HttpServletRequest request) {
        try {
            // 获取支付宝POST过来反馈信息
            Map<String, String> params = AliPayApi.toMap(request);
            for (Map.Entry<String, String> entry : params.entrySet()) {
                logger.info("支付宝回调信息message[{}]",entry.getKey() + " = " + entry.getValue());
            }
            //更改订单的状态至支付成功and更新支付流水状态至支付成功
            AliPayNotifyReq aliPayNotifyReq = BeanUtil.mapToBean(params,AliPayNotifyReq.class,true);
            paySerialService.update(aliPayNotifyReq);
            orderService.update(aliPayNotifyReq);

            // 切记alipaypublickey是支付宝的公钥，请去open.alipay.com对应应用下查看。
            // boolean AlipaySignature.rsaCheckV1(Map<String, String> params,
            // String publicKey, String charset, String sign_type)
            boolean flag = AlipaySignature.rsaCheckV1(params, alipayPublicKey, charset,
                    signType);
            if (flag) {


                logger.info("success");
                return;
            } else {
                // TODO
                logger.info("failure");
            }
        } catch (AlipayApiException e) {
            e.printStackTrace();
            logger.info("failure");
        }
    }


    @RequestMapping("return")
    public String returnProcess(AlipayReturnReq alipayReturnReq,ModelMap modelMap){
        modelMap.put("amount", alipayReturnReq.getTotal_amount());
        return "common/return";
    }





}
