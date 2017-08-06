package com.livtrip.web.service;


import com.alipay.api.domain.AlipayTradePayModel;
import com.livtrip.web.domain.Order;
import com.livtrip.web.domain.PaySerial;
import com.livtrip.web.model.request.AliPayNotifyReq;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by xierongli on 17/8/1.
 */
public interface OrderService {

    AlipayTradePayModel generateAlipayTradePayModel(Order order);

    void createOrder(HttpServletResponse response,Order order,PaySerial paySerial);

    int update(AliPayNotifyReq aliPayNotifyReq);

    Order queryByOrderSn(String orderSn);


}
