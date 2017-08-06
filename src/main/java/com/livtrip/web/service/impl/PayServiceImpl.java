package com.livtrip.web.service.impl;

import com.alipay.api.AlipayApiException;
import com.alipay.api.domain.AlipayTradePayModel;
import com.alipay.api.domain.AlipayTradeRefundModel;
import com.livtrip.web.pay.AliPayApi;
import com.livtrip.web.pay.AliPayApiConfig;
import com.livtrip.web.service.PayService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by xierongli on 17/8/3.
 */
@Service
public class PayServiceImpl implements PayService {

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


    @Override
    public void pcPay(HttpServletResponse response, AlipayTradePayModel model, String returnUrl, String notifyUrl) {
        try {
            AliPayApi.tradePage(getApiConfig(),response, model , notifyUrl, returnUrl);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @Override
    public String refund(AlipayTradeRefundModel alipayTradeRefundModel) {
        try {
           return  AliPayApi.tradeRefund(getApiConfig(),alipayTradeRefundModel);
        } catch (AlipayApiException e) {
            e.printStackTrace();
            return "";
        }
    }
}
