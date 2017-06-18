package com.livtrip.web.enums;

/**
 * 任务日志状态
 * @author xierongli
 * @version : livtripmanager-parent, v 0.1 2017/4/16 19:14 Exp $$
 */
public enum JobTaskLogStateEnum {

    OVER("O", "已结束"),
    RUN("R", "运行中"),
    EXCEPTION("E", "异常");

    private String state;
    private String descripton;

    JobTaskLogStateEnum(String state, String descripton) {
        this.state = state;
        this.descripton = descripton;
    }

    public static  String getNameByCode(String code){
        for(JobTaskLogStateEnum jobTaskLogStateEnum : JobTaskLogStateEnum.values()){
            if(jobTaskLogStateEnum.getState().equals(code)){
                return jobTaskLogStateEnum.getDescripton();
            }
        }
        return "";
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
