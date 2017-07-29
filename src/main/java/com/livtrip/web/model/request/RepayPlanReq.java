package com.livtrip.web.model.request;

/**
 * 还款计划请求信息
 * Created by xierongli on 17/6/5.
 */
public class RepayPlanReq {

    /**借款金额*/
    private String amount;
    /**年利率*/
    private String yearRate;
    /**借款期限*/
    private Integer term;
    /**手续费*/
    private String commissionCharge;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getYearRate() {
        return yearRate;
    }

    public void setYearRate(String yearRate) {
        this.yearRate = yearRate;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public String getCommissionCharge() {
        return commissionCharge;
    }

    public void setCommissionCharge(String commissionCharge) {
        this.commissionCharge = commissionCharge;
    }
}
