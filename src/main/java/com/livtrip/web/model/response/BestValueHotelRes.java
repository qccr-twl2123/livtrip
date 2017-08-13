package com.livtrip.web.model.response;

import com.livtrip.web.webservice.hotel.HotelLocation;

import java.math.BigDecimal;

/**
 * 精选酒店模型
 * Created by xierongli on 17/8/13.
 */
public class BestValueHotelRes {

    /**酒店名称*/
    private String name;
    /**酒店图片*/
    private String thumb;
    /**星级*/
    private BigDecimal starsLevel;

    private Integer hotelId;
    /**地址*/
    private String address;
    /**最低均价*/
    private BigDecimal minAverPrice;
    /**跳转连接*/
    private String renderUrl;

    protected HotelLocation location;

    private String starLevelHtml;


    public String getStarLevelHtml() {
        return starLevelHtml;
    }

    public void setStarLevelHtml(String starLevelHtml) {
        this.starLevelHtml = starLevelHtml;
    }

    public HotelLocation getLocation() {
        return location;
    }

    public void setLocation(HotelLocation location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public BigDecimal getStarsLevel() {
        return starsLevel;
    }

    public void setStarsLevel(BigDecimal starsLevel) {
        this.starsLevel = starsLevel;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getMinAverPrice() {
        return minAverPrice;
    }

    public void setMinAverPrice(BigDecimal minAverPrice) {
        this.minAverPrice = minAverPrice;
    }

    public String getRenderUrl() {
        return renderUrl;
    }

    public void setRenderUrl(String renderUrl) {
        this.renderUrl = renderUrl;
    }
}
