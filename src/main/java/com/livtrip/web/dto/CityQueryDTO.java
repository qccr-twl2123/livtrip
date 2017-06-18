package com.livtrip.web.dto;

/**
 * 城市查询DTO
 * @author xierongli
 * @version : livtripmanager-parent, v 0.1 2017/4/4 15:54 Exp $$
 */
public class CityQueryDTO {

    private String cityName;
    private String stateName;
    private String stateShort;
    private String destinationCode;
    private Integer destinationId;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateShort() {
        return stateShort;
    }

    public void setStateShort(String stateShort) {
        this.stateShort = stateShort;
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }

    public Integer getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Integer destinationId) {
        this.destinationId = destinationId;
    }
}
