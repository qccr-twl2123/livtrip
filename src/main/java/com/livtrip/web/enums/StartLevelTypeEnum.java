package com.livtrip.web.enums;

/**
 * 星级类型枚举
 * @author xierongli
 * @version $Id:.java v 0.1 2017年01月09日 19:45 xierongli
 */
public enum StartLevelTypeEnum {
    FULL_STAR(0, "<i class='fa  fa-star'></i>", "一颗星"),
    HALF_STAR(0, "<i class='fa  fa-star-half-full'></i>", "半颗星");

    private Integer code;
    private String description;
    private String value;

    private StartLevelTypeEnum(Integer code, String value, String description){
        this.code = code;
        this.description = description;
        this.value = value;
    }



    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
