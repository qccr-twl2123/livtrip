package com.livtrip.web.model.query;

import java.util.List;

/**
 * 产品查询Query
 * @author xierongli
 * @version $Id:ProductQuery.java v 0.1 2017年01月10日 11:52 xierongli
 */
public class ProductQuery  extends PageQuery{

    private Integer productId;
    /**城市name*/
    private String destination;
    /**城市ID*/
    private Integer destinationId;
    /**入住日期*/
    private String checkIn;
    /**退房日期*/
    private String checkOut;
    /**人数*/
    private String peopleNum;
    /**hotelIds*/
    private List<Integer> hotelIds;

    public Integer getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Integer destinationId) {
        this.destinationId = destinationId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
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

    public List<Integer> getHotelIds() {
        return hotelIds;
    }

    public void setHotelIds(List<Integer> hotelIds) {
        this.hotelIds = hotelIds;
    }

    public String getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(String peopleNum) {
        this.peopleNum = peopleNum;
    }
}
