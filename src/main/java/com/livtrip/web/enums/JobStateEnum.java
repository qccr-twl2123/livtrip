package com.livtrip.web.enums;

/**
 * 定时任务枚举
 * @author xierongli
 * @version : livtripmanager-parent, v 0.1 2017/4/16 14:12 Exp $$
 */
public enum JobStateEnum {
    USE("U", "使用中"),
    OVER("O", "已结束");

    private String state;
    private String descripton;

    JobStateEnum(String state, String descripton) {
        this.state = state;
        this.descripton = descripton;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }
}
