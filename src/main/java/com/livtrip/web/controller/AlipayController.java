package com.livtrip.web.controller;

import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.livtrip.web.pay.AliPayApi;
import com.livtrip.web.pay.AliPayApiConfig;
import com.livtrip.web.util.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

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

    @RequestMapping("notify")
    public void notifyMessage(){

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
        String notifyUrl = notify_domain + "/alipay/notify_url";

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















}
