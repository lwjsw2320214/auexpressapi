package com.auexpress.entity;

/**
 * Created by 维军 on 2016/07/18.
 */
public class User {
    private Integer icid;
    private String mcaccount;
    private String clientpassword;
    private String token;

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
}
