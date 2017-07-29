package com.livtrip.web.model.request;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 退款请求参数
 * Created by xierongli on 17/7/29.
 */
public class RefundReq {

    /**退款交易号*/
    @NotBlank(message = "退款交易号不为空")
    private String outTradeNo;
    /**退款金额*/
    @NotBlank(message = "退款金额不为空")
    private String refundAmount;
    /**退款理由*/
    @NotBlank(message = "退款理由不为空")
    private String refundReason;


    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }
}
