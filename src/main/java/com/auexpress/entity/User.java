package com.auexpress.entity;

/**
 * Created by 维军 on 2016/07/18.
 */
public class User {

    /**
     * 用户id
     * */
    private Integer icid;
    /**
     * 名称
     * */
    private String mcaccount;
    /**
     * 密码
     * */
    private String clientpassword;

    /**
     * 登录令牌
     * */
    private String token;

    /**
     * 姓名
     * */
    private  String csender;
    /**
     * 单位
     * */
    private  String cunitname;

    /**
     * 电话
     * */
    private  String cphone;

    /**
     * 详细地址
     * */
    private String caddr;

    /**
     * 邮编
     * */
    private  String cpostcode;

    /**
     * 国家
     * */
    private  String ccountry;

    /**
     * 省/州
     * */
    private  String cprovince;

    /**
     * 城市
     * */
    private String ccity;

    public Integer getIcid()
    {
        return this.icid;
    }

    public void setIcid(Integer icid)
    {
        this.icid = icid;
    }

    public String getMcaccount()
    {
        return this.mcaccount;
    }

    public void setMcaccount(String mcaccount)
    {
        this.mcaccount = mcaccount;
    }

    public String getClientpassword()
    {
        return this.clientpassword;
    }

    public void setClientpassword(String clientpassword)
    {
        this.clientpassword = clientpassword;
    }

    public String getToken()
    {
        return this.token;
    }

    public void setToken(String token)
    {
        this.token = token;
    }

    public String getCsender() {
        return csender;
    }

    public void setCsender(String csender) {
        this.csender = csender;
    }

    public String getCunitname() {
        return cunitname;
    }

    public void setCunitname(String cunitname) {
        this.cunitname = cunitname;
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

    public String getCpostcode() {
        return cpostcode;
    }

    public void setCpostcode(String cpostcode) {
        this.cpostcode = cpostcode;
    }

    public String getCcountry() {
        return ccountry;
    }

    public void setCcountry(String ccountry) {
        this.ccountry = ccountry;
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
}
