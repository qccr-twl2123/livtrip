package com.livtrip.web.service.impl;

import com.livtrip.web.domain.Order;
import com.livtrip.web.domain.PaySerial;
import com.livtrip.web.mapper.OrderMapper;
import com.livtrip.web.mapper.PaySerialMapper;
import com.livtrip.web.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by xierongli on 17/8/1.
 */
@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private PaySerialMapper paySerialMapper;

    @Transactional
    public Boolean createOrder(Order order, PaySerial paySerial) {
        orderMapper.insertSelective(order);
        paySerialMapper.insertSelective(paySerial);

        return null;
    }


}
