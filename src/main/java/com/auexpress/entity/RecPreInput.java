package com.auexpress.entity;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.math.BigDecimal;

/**
 * Created by 维军 on 2016/07/18.
 */
public class RecPreInput {

    /**
     * 主键id
     * */
    private Integer iid ;

    /**
     * 用户id
     * */
    private Integer icid ;

    /**
     * 发货id
     * */
    private Integer irid ;

    /**
     * 录入日期
     * */
    private String ddate ;

    /**
     * 快递日期
     * */
    private String dsysdate;

    /**
     * 快递类别
     * */
    private String cemskind ;

    /**
     * 运单号
     * */
    private String cnum ;

    /**
     * 数量
     * */
    private  Integer iitem;

    /**
     * 目的地
     * */
    private String cdes ;

    /**
     * 中文品名
     * */
    private String cgoods ;

    /**
     * 产品重量
     * */
    private BigDecimal fweight ;

    /**
     * 收货人
     * */
    private String creceiver ;


    /**
     * 收货电话
     * */
    private String cphone ;

    /**
     * 收货人详细地址
     * */
    private String caddr ;
    /**
     * 收件人省份
     * */
    private String cprovince ;

    /**
     * 收件人城市
     * */
    private String ccity ;

    /**
     * 总价
     * */
    private BigDecimal total;

    /**
     * 批次号
     * */
    private Integer batchId;

    /**
     * 快递人姓名
     * */
    private String csender;

    /**
     * 快递地址
     * */
     private String csaddr;

    /**
     * 电话
     * */
     private String csphone;

    /**
     * 批次号
     * */
    private  String batchNumber;

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

    public String getDsysdate() {
        return dsysdate;
    }

    public void setDsysdate(String dsysdate) {
        this.dsysdate = dsysdate;
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

    public Integer getIitem() {
        return iitem;
    }

    public void setIitem(Integer iitem) {
        this.iitem = iitem;
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

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getCsender() {
        return csender;
    }

    public void setCsender(String csender) {
        this.csender = csender;
    }

    public String getCsaddr() {
        return csaddr;
    }

    public void setCsaddr(String csaddr) {
        this.csaddr = csaddr;
    }

    public String getCsphone() {
        return csphone;
    }

    public void setCsphone(String csphone) {
        this.csphone = csphone;
    }
}
