package com.livtrip.web.event;


import com.livtrip.web.webservice.hotel.Hotel;
import com.livtrip.web.webservice.hotel.TWSHotelDetailsV3;

/**
 * 数据事件
 * @author xierongli
 * @version $Id:DataEvent.java v 0.1 2016年12月19日 14:19 xierongli
 */
public class DataEvent {
    /**产品Id*/
    private  Integer productId;
    /**Hotel detail*/
    private TWSHotelDetailsV3.Hotel hotelDetail;
    /**hotel list*/
    private Hotel hotel;

    public DataEvent(Integer productId,TWSHotelDetailsV3.Hotel hotelDetail,Hotel hotel){
        this.productId = productId;
        this.hotelDetail = hotelDetail;
        this.hotel = hotel;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public TWSHotelDetailsV3.Hotel getHotelDetail() {
        return hotelDetail;
    }

    public void setHotelDetail(TWSHotelDetailsV3.Hotel hotelDetail) {
        this.hotelDetail = hotelDetail;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
