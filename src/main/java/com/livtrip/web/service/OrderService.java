package com.livtrip.web.service;


import com.livtrip.web.domain.Order;
import com.livtrip.web.domain.PaySerial;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by xierongli on 17/8/1.
 */
public interface OrderService {

    void createOrder(HttpServletResponse response,Order order);
}
