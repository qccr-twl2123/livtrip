package com.livtrip.web.vo.product;



import com.livtrip.web.vo.HotelRoomTypeVO;
import com.livtrip.web.webservice.hotel.RoomType;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author xierongli
 * @version $$Id: livtripmanager-parent, v 0.1 2017/2/18 17:06 user Exp $$
 * @name 酒店产品详情VO
 */

public class HotelDetailVO {

    /**产品主键Id*/
    private Integer id;
    /**hotelId*/
    private Integer hotelId;
    /**城市名称*/
    private String cityName;
    /**产品名称*/
    private String name;
    /**酒店关键字描述*/
    private String keywords;
    /**酒店描述*/
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

    private String checkIn;
    private String checkOut;


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

    /**酒店图片资源*/
    private List<HotelImageVO> hotelImageVOList;
    /**酒店描述*/
    private List<HotelDescriptionVO> hotelDescriptionVOList;
    /**酒店房型*/
    private List<RoomType> roomTypeList;
    /**最低每晚均价*/
    private BigDecimal minAvgNightPrice;
    /**构建房型结构*/
    private List<HotelRoomTypeVO> hotelRoomTypeVOS;

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

    public List<HotelRoomTypeVO> getHotelRoomTypeVOS() {
        return hotelRoomTypeVOS;
    }

    public void setHotelRoomTypeVOS(List<HotelRoomTypeVO> hotelRoomTypeVOS) {
        this.hotelRoomTypeVOS = hotelRoomTypeVOS;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

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

    public List<RoomType> getRoomTypeList() {
        return roomTypeList;
    }

    public void setRoomTypeList(List<RoomType> roomTypeList) {
        this.roomTypeList = roomTypeList;
    }

    public List<HotelDescriptionVO> getHotelDescriptionVOList() {
        return hotelDescriptionVOList;
    }

    public void setHotelDescriptionVOList(List<HotelDescriptionVO> hotelDescriptionVOList) {
        this.hotelDescriptionVOList = hotelDescriptionVOList;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
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

    public Integer getIsBest() {
        return isBest;
    }

    public void setIsBest(Integer isBest) {
        this.isBest = isBest;
    }

    public Double getStartLevel() {
        return startLevel;
    }

    public void setStartLevel(Double startLevel) {
        this.startLevel = startLevel;
    }

    public String getStarLevelText() {
        return starLevelText;
    }

    public void setStarLevelText(String starLevelText) {
        this.starLevelText = starLevelText;
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

    public List<HotelImageVO> getHotelImageVOList() {
        return hotelImageVOList;
    }

    public void setHotelImageVOList(List<HotelImageVO> hotelImageVOList) {
        this.hotelImageVOList = hotelImageVOList;
    }
}
