package com.livtrip.web.query;

/**
 * 后台酒店查询请求模型
 * @author xierongli
 * @version : livtripmanager-parent, v 0.1 2017/3/26 9:47 Exp $$
 */
public class HotelProductQuery extends PageQuery{
    /**酒店名称*/
    private String name;
    /**精品 0 否 1 是*/
    private Integer isBest;
    /**星级*/
    private String starLevel;
    /**城市*/
    private String city;
    /**酒店ID */
    private String hotelId;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsBest() {
        return isBest;
    }

    public void setIsBest(Integer isBest) {
        this.isBest = isBest;
    }

    public String getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(String starLevel) {
        this.starLevel = starLevel;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }
}
