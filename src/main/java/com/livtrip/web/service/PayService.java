package com.livtrip.web.service;

import com.alipay.api.domain.AlipayTradePayModel;
import com.alipay.api.domain.AlipayTradeRefundModel;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by xierongli on 17/8/3.
 */
public interface PayService {

    void pcPay(HttpServletResponse response,AlipayTradePayModel model,String returnUrl,String notifyUrl);

    String refund(AlipayTradeRefundModel alipayTradeRefundModel);

}
