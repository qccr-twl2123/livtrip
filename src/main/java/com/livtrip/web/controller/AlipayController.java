package com.livtrip.web.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.domain.AlipayDataDataserviceBillDownloadurlQueryModel;
import com.alipay.api.domain.AlipayTradePayModel;
import com.alipay.api.domain.AlipayTradeRefundModel;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.livtrip.web.model.request.RefundReq;
import com.livtrip.web.pay.AliPayApi;
import com.livtrip.web.pay.AliPayApiConfig;
import com.livtrip.web.util.StringUtils;
import com.livtrip.web.validator.ValidatorUtils;
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
     * Wap支付
     */
    @RequestMapping("wapPay")
    public void wapPay(HttpServletResponse response) {
        String body = "我是测试数据-By Javen";
        String subject = "Javen Wap支付测试";
        String totalAmount = "1";
        String passbackParams = "1";
        String returnUrl = notify_domain + "/alipay/return_url";
        String notifyUrl = notify_domain + "/alipay/notify.do";

        AlipayTradeWapPayModel model = new AlipayTradeWapPayModel();
        model.setBody(body);
        model.setSubject(subject);
        model.setTotalAmount(totalAmount);
        model.setPassbackParams(passbackParams);
        String outTradeNo = StringUtils.getOutTradeNo();
        System.out.println("wap outTradeNo>"+outTradeNo);
        model.setOutTradeNo(outTradeNo);
        model.setProductCode("QUICK_WAP_PAY");

        try {
            AliPayApi.wapPay(getApiConfig(),response, model, returnUrl, notifyUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * PC支付
     */
    @RequestMapping("pc")
    public void pcPay(HttpServletResponse response){
        try {
            String totalAmount = "1";
            String outTradeNo =StringUtils.getOutTradeNo();

            String returnUrl = notify_domain + "/alipay/return_url";
            String notifyUrl = notify_domain + "/alipay/notify_url";
            AlipayTradePayModel model = new AlipayTradePayModel();

            model.setOutTradeNo(outTradeNo);
            model.setProductCode("FAST_INSTANT_TRADE_PAY");
            model.setTotalAmount(totalAmount);
            model.setSubject("Javen PC支付测试");
            model.setBody("Javen IJPay PC支付测试");

            AliPayApi.tradePage(getApiConfig(),response,model , notifyUrl, returnUrl);
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
            // 切记alipaypublickey是支付宝的公钥，请去open.alipay.com对应应用下查看。
            // boolean AlipaySignature.rsaCheckV1(Map<String, String> params,
            // String publicKey, String charset, String sign_type)
            boolean flag = AlipaySignature.rsaCheckV1(params, alipayPublicKey, charset,
                    signType);
            if (flag) {
                // TODO
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





}
