package com.auexpress.entity;

import com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBaseIterators;

/**
 * Created by 维军 on 2016/07/20.
 */
public class SmsBatch {

    /**
     * id
     * */
    private Integer id;

    /**
     * 批次号
     * */
    private String batchNumber;

    /**
     * 创建用户
     * */
    private  Integer createUser;

    /**
     * 创建日期
     * */
    private  String createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
