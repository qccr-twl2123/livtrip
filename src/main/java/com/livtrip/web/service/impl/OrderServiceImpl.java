package com.livtrip.web.service.impl;

import com.alipay.api.domain.AlipayTradePayModel;
import com.livtrip.web.constant.Constant;
import com.livtrip.web.domain.*;
import com.livtrip.web.mapper.HotelProductMapper;
import com.livtrip.web.mapper.OrderMapper;
import com.livtrip.web.mapper.PaySerialMapper;
import com.livtrip.web.mapper.ProductMapper;
import com.livtrip.web.service.OrderService;
import com.livtrip.web.service.PayService;
import com.livtrip.web.util.Money;
import com.livtrip.web.util.StringUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.UUID;

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

    @Autowired
    private PayService payService;

    @Transactional
    public void createOrder(HttpServletResponse response,Order order) {
        //构建支付流水模型
        String paySerialNo = UUID.randomUUID().toString();
        PaySerial paySerial = new PaySerial();
        paySerial.setSerialNo(paySerialNo);
        paySerial.setAmount(Money.convertYuanToCent(order.getReceiptAmount()).intValue());
        paySerial.setReturnUrl(Constant.RETURN_URL);
        paySerial.setNotifyUrl(Constant.NOTIFY_URL);

        //生成数据
        orderMapper.insertSelective(order);
        paySerialMapper.insertSelective(paySerial);

        //调用支付宝接口
        payService.pcPay(response,generateAlipayTradePayModel(order), Constant.RETURN_URL,Constant.NOTIFY_URL);

    }

    public AlipayTradePayModel generateAlipayTradePayModel(Order order){
        AlipayTradePayModel alipayTradePayModel = null;
        ProductCriteria productCriteria = new ProductCriteria();
        productCriteria.createCriteria().andIdEqualTo(order.getProductId());
        List<Product> productList = productMapper.selectByCriteria(productCriteria);

        if(CollectionUtils.isNotEmpty(productList)){
            Product product = productList.get(0);

            alipayTradePayModel = new AlipayTradePayModel();
            String totalAmount = String.valueOf(order.getReceiptAmount());
            String outTradeNo = StringUtils.getOutTradeNo();
            alipayTradePayModel.setOutTradeNo(outTradeNo);
            alipayTradePayModel.setProductCode("productId-"+order.getProductId()+"-hotelId-"+order.getHotelId());
            alipayTradePayModel.setTotalAmount(totalAmount);
            alipayTradePayModel.setSubject(product.getName());
            alipayTradePayModel.setBody(product.getDescription());
        }
        return alipayTradePayModel;
    }



}
