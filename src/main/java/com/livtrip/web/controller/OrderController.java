package com.livtrip.web.controller;

import com.alipay.api.domain.AlipayTradePayModel;
import com.alipay.api.domain.AlipayTradeRefundModel;
import com.livtrip.web.constant.Constant;
import com.livtrip.web.domain.Order;
import com.livtrip.web.domain.PaySerial;
import com.livtrip.web.enums.OrderStatusEnum;
import com.livtrip.web.model.Result;
import com.livtrip.web.model.Results;
import com.livtrip.web.model.request.OrderRefundReq;
import com.livtrip.web.model.request.OrderReq;
import com.livtrip.web.service.OrderService;
import com.livtrip.web.service.PayService;
import com.livtrip.web.util.ObjectConvert;
import com.livtrip.web.util.StringUtils;
import com.livtrip.web.validator.Assert;
import com.livtrip.web.validator.ValidatorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
         //生成外部交易号
         String outTradeNo = StringUtils.getOutTradeNo();
         Order order = ObjectConvert.convertObject(orderReq,Order.class);
         order.setIp(getIRealIPAddr(request));
         order.setOutTradeNo(outTradeNo);
         //调用支付宝接口
         AlipayTradePayModel alipayTradePayModel = orderService.generateAlipayTradePayModel(order);
         payService.pcPay(response,alipayTradePayModel, Constant.RETURN_URL,Constant.NOTIFY_URL);

         //构建支付流水模型
         PaySerial paySerial = new PaySerial();
         paySerial.setOutTradeNo(outTradeNo);
         paySerial.setAmount(order.getReceiptAmount());
         paySerial.setReturnUrl(Constant.RETURN_URL);
         paySerial.setNotifyUrl(Constant.NOTIFY_URL);
         paySerial.setSubject(alipayTradePayModel.getSubject());
         paySerial.setBody(alipayTradePayModel.getBody());
         orderService.createOrder(response,order,paySerial);
     }



     @RequestMapping("refund")
     public Result<String> refund(OrderRefundReq orderRefundReq){
         ValidatorUtils.validateEntity(orderRefundReq);
         //根据orderSn构建退款参数
         Order order = orderService.queryByOrderSn(orderRefundReq.getOrderSn());
         Assert.isNull(order,"订单编号不合法");
         AlipayTradeRefundModel model = new AlipayTradeRefundModel();
         model.setOutTradeNo(order.getOutTradeNo());
         model.setTradeNo(order.getTradeNo());
         model.setRefundAmount(orderRefundReq.getRefundAmount());
         model.setRefundReason("正常退款");
         String resultStr = payService.refund(model);
         Assert.isBlank(resultStr,"退款操作失败");
         //修改订单状态＝>退款状态
         int updateNum = orderService.updateOrderStatus(order.getId(), OrderStatusEnum.REFUND.getCode());
         Assert.isTrue(updateNum<0,"订单退款状态更新失败");
         return Results.newSuccessResult(resultStr);
     }





}
