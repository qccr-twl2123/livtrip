package com.livtrip.web.controller;

import com.livtrip.web.constant.Constant;
import com.livtrip.web.domain.Order;
import com.livtrip.web.domain.PaySerial;
import com.livtrip.web.model.request.OrderReq;
import com.livtrip.web.service.OrderService;
import com.livtrip.web.util.Money;
import com.livtrip.web.util.ObjectConvert;
import com.livtrip.web.validator.ValidatorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * Created by xierongli on 17/8/1.
 */
@RestController
@RequestMapping("order")
public class OrderController  extends  BaseController{

     @Autowired
     private OrderService orderService;

     @RequestMapping("create")
     public void  createOrder(HttpServletRequest request,HttpServletResponse response, OrderReq orderReq){
         ValidatorUtils.validateEntity(orderReq);
         Order order = ObjectConvert.convertObject(orderReq, Order.class);
         order.setIp(getIRealIPAddr(request));


     }



}
