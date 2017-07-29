package com.livtrip.web.model.vo.product;

/**
 * @author xierongli
 * @version $$Id: livtripmanager-parent, v 0.1 2017/2/24 15:57 user Exp $$
 * @name 酒店描述
 */

public class HotelDescriptionVO {
    /**类别*/
    private String category;
    /**值*/
    private String value;
    /**描述*/
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
