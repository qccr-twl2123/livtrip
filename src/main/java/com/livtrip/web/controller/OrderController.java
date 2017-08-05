package com.livtrip.web.controller;

import com.alipay.api.domain.AlipayTradePayModel;
import com.livtrip.web.constant.Constant;
import com.livtrip.web.domain.Order;
import com.livtrip.web.domain.PaySerial;
import com.livtrip.web.domain.Product;
import com.livtrip.web.domain.ProductCriteria;
import com.livtrip.web.mapper.ProductMapper;
import com.livtrip.web.model.request.OrderReq;
import com.livtrip.web.service.OrderService;
import com.livtrip.web.service.PayService;
import com.livtrip.web.util.ObjectConvert;
import com.livtrip.web.util.StringUtils;
import com.livtrip.web.validator.Assert;
import com.livtrip.web.validator.ValidatorUtils;
import com.xiaoleilu.hutool.convert.Convert;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by xierongli on 17/8/1.
 */
@RestController
@RequestMapping("order")
public class OrderController  extends  BaseController{

    @Autowired
    private OrderService orderService;
    @Autowired
    private PayService payService;

     @RequestMapping("create")
     public void  createOrder(HttpServletRequest request,HttpServletResponse response, OrderReq orderReq){
         ValidatorUtils.validateEntity(orderReq);
         Order order = ObjectConvert.convertObject(orderReq,Order.class);
         order.setIp(getIRealIPAddr(request));
         String paySerialNo = StringUtils.getUUID();

         //调用支付宝接口
         AlipayTradePayModel alipayTradePayModel = orderService.generateAlipayTradePayModel(order);

         payService.pcPay(response,alipayTradePayModel, Constant.RETURN_URL,Constant.NOTIFY_URL);

         //构建支付流水模型
         PaySerial paySerial = new PaySerial();
         paySerial.setSerialNo(paySerialNo);
         paySerial.setBillNo(StringUtils.getOutTradeNo());
         paySerial.setAmount(order.getReceiptAmount());
         paySerial.setReturnUrl(Constant.RETURN_URL);
         paySerial.setNotifyUrl(Constant.NOTIFY_URL);
         paySerial.setSubject(alipayTradePayModel.getSubject());
         paySerial.setBody(alipayTradePayModel.getBody());

         orderService.createOrder(response,order,paySerial);
     }





}
