package com.livtrip.web.model.request;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 订单退款请求参数
 * Created by xierongli on 17/8/6.
 */
public class OrderRefundReq {

    @NotBlank(message = "退款金额不为空")
    private String orderSn;
    /**退款金额*/
    @NotBlank(message = "退款金额不为空")
    private String refundAmount;

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }
}
