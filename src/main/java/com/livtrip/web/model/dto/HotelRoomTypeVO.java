package com.livtrip.web.model.dto;

/**
 * 酒店房型数据列表
 * Created by mark1xie on 17/4/30.
 */
public class HotelRoomTypeVO {

    /**房型名称*/
    private String name;
    /**每晚均价(原价)*/
    private Double originalPrice;

    /**每晚均价(销售价)*/
    private Double saleAvgPrice;
    /**几晚*/
    private Integer nights;
    /**手续费*/
    private double commission;
    /**总原价*/
    private Double totalOriginalPrice;
    /**销售总价*/
    private Double totalSalePrice;
    /**利润*/
    private Double profit;
    /**入住日期*/
    private String checkIn;
    /**退房日期*/
    private String checkOut;


    public Double getSaleAvgPrice() {
        return saleAvgPrice;
    }

    public void setSaleAvgPrice(Double saleAvgPrice) {
        this.saleAvgPrice = saleAvgPrice;
    }

    public Double getTotalOriginalPrice() {
        return totalOriginalPrice;
    }

    public void setTotalOriginalPrice(Double totalOriginalPrice) {
        this.totalOriginalPrice = totalOriginalPrice;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }



    public Integer getNights() {
        return nights;
    }

    public void setNights(Integer nights) {
        this.nights = nights;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public Double getTotalSalePrice() {
        return totalSalePrice;
    }

    public void setTotalSalePrice(Double totalSalePrice) {
        this.totalSalePrice = totalSalePrice;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }
}
