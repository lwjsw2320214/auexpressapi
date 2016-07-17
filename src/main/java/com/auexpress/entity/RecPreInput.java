package com.auexpress.entity;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.math.BigDecimal;

/**
 * Created by 维军 on 2016/07/18.
 */
public class RecPreInput {

    /// <summary>
    /// 主键id
    /// </summary>
    private Integer iid ;

    /// <summary>
    /// 用户id
    /// </summary>
    private Integer icid ;

    /// <summary>
    /// 发货id
    /// </summary>
    private Integer irid ;

    /// <summary>
    /// 录入日期
    /// </summary>
    private String ddate ;

    /// <summary>
    /// 快递类别
    /// </summary>
    private String cemskind ;

    /// <summary>
    /// 运单号
    /// </summary>
    private String cnum ;

    /// <summary>
    /// 目的地
    /// </summary>
    private String cdes ;

    /// <summary>
    /// 中文品名
    /// </summary>
    private String cgoods ;

    /// <summary>
    /// 产品重量
    /// </summary>
    private BigDecimal fweight ;

    /// <summary>
    /// 收货人
    /// </summary>
    private String creceiver ;

    /// <summary>
    /// 收货电话
    /// </summary>
    private String cphone ;

    /// <summary>
    /// 收货人详细地址
    /// </summary>
    private String caddr ;
    /// <summary>
    /// 收件人省份
    /// </summary>
    private String cprovince ;

    /// <summary>
    /// 收件人城市
    /// </summary>
    private String ccity ;

    /// <summary>
    /// 总价
    /// </summary>
    private BigDecimal total;


    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public Integer getIcid() {
        return icid;
    }

    public void setIcid(Integer icid) {
        this.icid = icid;
    }

    public Integer getIrid() {
        return irid;
    }

    public void setIrid(Integer irid) {
        this.irid = irid;
    }

    public String getDdate() {
        return ddate;
    }

    public void setDdate(String ddate) {
        this.ddate = ddate;
    }

    public String getCemskind() {
        return cemskind;
    }

    public void setCemskind(String cemskind) {
        this.cemskind = cemskind;
    }

    public String getCnum() {
        return cnum;
    }

    public void setCnum(String cnum) {
        this.cnum = cnum;
    }

    public String getCdes() {
        return cdes;
    }

    public void setCdes(String cdes) {
        this.cdes = cdes;
    }

    public String getCgoods() {
        return cgoods;
    }

    public void setCgoods(String cgoods) {
        this.cgoods = cgoods;
    }

    public BigDecimal getFweight() {
        return fweight;
    }

    public void setFweight(BigDecimal fweight) {
        this.fweight = fweight;
    }

    public String getCreceiver() {
        return creceiver;
    }

    public void setCreceiver(String creceiver) {
        this.creceiver = creceiver;
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone;
    }

    public String getCaddr() {
        return caddr;
    }

    public void setCaddr(String caddr) {
        this.caddr = caddr;
    }

    public String getCprovince() {
        return cprovince;
    }

    public void setCprovince(String cprovince) {
        this.cprovince = cprovince;
    }

    public String getCcity() {
        return ccity;
    }

    public void setCcity(String ccity) {
        this.ccity = ccity;
    }

    public BigDecimal getTotal() {
        if(this.total==null){
            return new BigDecimal(0.000);
        }
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
