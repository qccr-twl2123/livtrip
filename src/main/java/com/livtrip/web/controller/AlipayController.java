package com.livtrip.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 支付宝支付控制器
 * Created by xierongli on 17/6/29.
 */
@Controller
@RequestMapping("alipay")
public class AlipayController extends BaseController{

    private  String charset = "UTF-8";
    @Value("pay.alipay.privateKey")
    private  String privateKey;
    @Value("pay.alipay.alipayPulicKey")
    private  String alipayPublicKey;
    @Value("pay.alipay.serverUrl")
    private  String serviceUrl;

    @Value("pay.alipay.appId")
    private  String appId ;
    private  String signType = "RSA2";
    @Value("pay.alipay.notifyDomain")
    private  String notifyDomain;











}
