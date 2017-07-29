package com.livtrip.web.event;

/**
 * 日志事件
 * Created by xierongli on 17/7/29.
 */
public class LogEvent {

    /**耗时*/
    private Integer cost;
    /**类and方法*/
    private String classExpression;
    /**参数*/
    private String params;
    /**IP地址*/
    private String ip;
    /**url*/
    private String url;

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getClassExpression() {
        return classExpression;
    }

    public void setClassExpression(String classExpression) {
        this.classExpression = classExpression;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
