package com.livtrip.web.query;

/**
 * 城市Query
 * @author xierongli
 * @version : livtripmanager-parent, v 0.1 2017/4/4 15:28 Exp $$
 */
public class CityQuery extends PageQuery{

    private String cityName;
    private String stateName;
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
