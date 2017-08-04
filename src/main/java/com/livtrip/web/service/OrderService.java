package com.livtrip.web.service;


import com.livtrip.web.domain.Order;
import com.livtrip.web.domain.PaySerial;

/**
 * Created by xierongli on 17/8/1.
 */
public interface OrderService {

    Boolean createOrder(Order order, PaySerial paySerial);
}
