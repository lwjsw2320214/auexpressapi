package com.auexpress.entity;

/**
 * Created by 维军 on 2016/07/30.
 */
public class ApiAjaxJson {
    private Boolean result = Boolean.valueOf(false);
    private Object obj;

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
