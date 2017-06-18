package com.livtrip.web.vo.destination;

/**
 *
 * @name  城市数据VO
 * @author xierongli
 * @version $$Id: livtripmanager-parent, v 0.1 2017/2/18 14:54 user Exp $$
 */

public class CityVO {

    /**城市Id*/
    private Integer id;
    /**城市名称-英文*/
    private String  enName;
    /**城市名称-中文*/
    private String cnName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }
}
