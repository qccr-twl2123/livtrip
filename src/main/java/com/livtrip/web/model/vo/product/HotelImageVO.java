package com.livtrip.web.model.vo.product;

/**
 * @author xierongli
 * @version $$Id: livtripmanager-parent, v 0.1 2017/2/18 17:09 user Exp $$
 * @name 酒店图片VO
 */

public class HotelImageVO {

    /**图片类型*/
    private Integer type;
    /**图片路径*/
    private String path;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
