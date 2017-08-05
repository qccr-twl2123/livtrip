package com.livtrip.web.model.request;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单请求参数
 * Created by xierongli on 17/8/1.
 */
public class OrderReq {

    @NotNull(message = "productId 不能为空")
    private Integer productId;
    @NotNull(message = "hotelId 不能为空")
    private Integer hotelId;
    @NotNull(message = "入住日期不能为空")
    private Date checkIn;
    @NotNull(message = "退房日期不能为空")
    private Date checkOut;
    @NotBlank(message = "房间信息不能为空")
    private String roomInfo;

    private String userId;
    @NotBlank(message = "email 不能为空")
    private String email;
    private String mobile;

    @NotNull(message = "订单金额不为空")
    private BigDecimal amount;
    @NotNull(message = "实付金额不为空")
    private BigDecimal receiptAmount;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public String getRoomInfo() {
        return roomInfo;
    }

    public void setRoomInfo(String roomInfo) {
        this.roomInfo = roomInfo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getReceiptAmount() {
        return receiptAmount;
    }

    public void setReceiptAmount(BigDecimal receiptAmount) {
        this.receiptAmount = receiptAmount;
    }
}
