package com.livtrip.web.service.impl;

import com.alipay.api.domain.AlipayTradePayModel;
import com.livtrip.web.domain.*;
import com.livtrip.web.mapper.OrderMapper;
import com.livtrip.web.mapper.PaySerialMapper;
import com.livtrip.web.mapper.ProductMapper;
import com.livtrip.web.model.request.AliPayNotifyReq;
import com.livtrip.web.service.OrderService;
import com.livtrip.web.util.StringUtils;
import com.livtrip.web.validator.Assert;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by xierongli on 17/8/1.
 */
@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private PaySerialMapper paySerialMapper;

    @Autowired
    private ProductMapper productMapper;


    @Override
    public AlipayTradePayModel generateAlipayTradePayModel(Order order) {
        AlipayTradePayModel alipayTradePayModel = null;
        ProductCriteria productCriteria = new ProductCriteria();
        productCriteria.createCriteria().andIdEqualTo(order.getProductId());
        List<Product> productList = productMapper.selectByCriteria(productCriteria);

        if(CollectionUtils.isNotEmpty(productList)){
            Product product = productList.get(0);
            alipayTradePayModel = new AlipayTradePayModel();
            String totalAmount = order.getReceiptAmount().toString();
            String outTradeNo = StringUtils.getOutTradeNo();
            alipayTradePayModel.setOutTradeNo(outTradeNo);
            alipayTradePayModel.setProductCode("FAST_INSTANT_TRADE_PAY");
            alipayTradePayModel.setTotalAmount(totalAmount);
            alipayTradePayModel.setSubject(product.getName());
            alipayTradePayModel.setBody(product.getDescription() == null?"description":product.getDescription());
        }
        return alipayTradePayModel;
    }

    @Transactional
    public void createOrder(HttpServletResponse response,Order order,PaySerial paySerial) {
        order.setOrderSn(StringUtils.getOutTradeNo());
        //生成数据
        int orderNum = orderMapper.insertSelective(order);
        Assert.isTrue(orderNum < 0,"订单生成失败");

        int serialNum = paySerialMapper.insertSelective(paySerial);
        Assert.isTrue(serialNum < 0,"支付流水生成失败");
    }

    @Override
    public int update(AliPayNotifyReq aliPayNotifyReq) {
        OrderCriteria orderCriteria = new OrderCriteria();
        orderCriteria.createCriteria().andOutTradeNoEqualTo(aliPayNotifyReq.getOut_trade_no());
        List<Order> orderList = orderMapper.selectByCriteria(orderCriteria);
        if(CollectionUtils.isNotEmpty(orderList)){
            Order order = orderList.get(0);
            order.setStatus(2);
            order.setTradeNo(aliPayNotifyReq.getTrade_no());
            orderMapper.updateByCriteria(order,orderCriteria);
        }
        return 0;
    }

    @Override
    public Order queryByOrderSn(String orderSn) {
        OrderCriteria orderCriteria = new OrderCriteria();
        orderCriteria.createCriteria().andOrderSnEqualTo(orderSn);
        List<Order> orderList = orderMapper.selectByCriteria(orderCriteria);
        if(CollectionUtils.isNotEmpty(orderList)){
            return orderList.get(0);
        }
        return null;
    }


}
