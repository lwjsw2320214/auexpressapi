package com.auexpress.entity;

/**
 * Created by 维军 on 2016/07/30.
 */
public class CourierNumber {

    /**
     * 快递号
     * */
    private  String mailno;

    /**
     * 原始运单号
     * */
    private  String orderid;

    public String getMailno() {
        return mailno;
    }

    public void setMailno(String mailno) {
        this.mailno = mailno;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }
}
