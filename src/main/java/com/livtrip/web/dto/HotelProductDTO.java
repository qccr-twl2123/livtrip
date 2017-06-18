package com.livtrip.web.dto;


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 酒店产品结果Ro
 * @author xierongli
 * @version $Id:.java v 0.1 2016年12月28日 15:57 xierongli
 */
public class HotelProductDTO implements Serializable{

    /**产品主键Id*/
    private Integer id;
    /**hotelId*/
    private Integer hotelId;
    /**产品名称*/
    private String name;
    /**关键字描述*/
    private String keywords;
    /**酒店介绍*/
    private String description;
    /**产品封面图*/
    private String thumb;
    /**销售价 分*/
    private Integer salePrice;
    /**市场价 分*/
    private Integer marketPrice;
    /**精品 0 no 1 yes*/
    private Integer isBest;
    /**星级*/
    private Double startLevel;
    /**星级文本htmll*/
    private String starLevelText;
    /**货币单位*/
    private String currency;
    /**品牌名称*/
    private String brandName;

    /**房间数*/
    private Integer rooms;
    /**入住时间*/
    private String checkInTime;
    /**退房时间*/
    private String checkOutTime;
    /**酒店电话*/
    private String hotelPhone;

    /**传真*/
    private String hotelFax;
    /**地理位置*/
    private String country;
    private String state;
    private String city;

    private String address;
    private String zip;
    private String longitude;
    private String latitude;


    private BigDecimal minAvgNightPrice;


    public BigDecimal getMinAvgNightPrice() {
        return minAvgNightPrice;
    }

    public void setMinAvgNightPrice(BigDecimal minAvgNightPrice) {
        this.minAvgNightPrice = minAvgNightPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public String getStarLevelText() {
        return starLevelText;
    }

    public void setStarLevelText(String starLevelText) {
        this.starLevelText = starLevelText;
    }

    public Double getStartLevel() {
        return startLevel;
    }

    public void setStartLevel(Double startLevel) {
        this.startLevel = startLevel;
    }

    public Integer getIsBest() {
        return isBest;
    }

    public void setIsBest(Integer isBest) {
        this.isBest = isBest;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Integer marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public String getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

    public String getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public String getHotelPhone() {
        return hotelPhone;
    }

    public void setHotelPhone(String hotelPhone) {
        this.hotelPhone = hotelPhone;
    }

    public String getHotelFax() {
        return hotelFax;
    }

    public void setHotelFax(String hotelFax) {
        this.hotelFax = hotelFax;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
