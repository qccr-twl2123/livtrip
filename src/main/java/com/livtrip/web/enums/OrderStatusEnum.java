package com.livtrip.web.enums;

/**
 * 订单状态枚举
 * Created by xierongli on 17/8/5.
 */
public enum OrderStatusEnum {

    PENDING(1," 待支付"),
    PAY(2," 已支付"),
    REFUND(3," 退款"),
    CLOSING(4," 关闭");

    private Integer code;
    private String description;

    OrderStatusEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
