package com.livtrip.web.model.query;

/**
 * Created by xierongli on 17/5/21.
 */
public class DestQuery  extends PageQuery{

    private String cityName;
    private String state;
    private Integer destinationId;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Integer destinationId) {
        this.destinationId = destinationId;
    }
}
