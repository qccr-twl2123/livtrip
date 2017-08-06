package com.livtrip.web.model.request;

/**
 * 返回参数
 * Created by xierongli on 17/8/6.
 */
public class AlipayReturnReq {

    private String total_amount;
    private String trade_no;
    private String out_trade_no;


    public String getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    public String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }
}
