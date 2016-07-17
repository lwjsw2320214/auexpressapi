package com.auexpress.entity;

/**
 * Created by 维军 on 2016/07/18.
 */
public class AjaxJson {
    private Boolean result = Boolean.valueOf(false);
    private Object obj;
    private  Integer pageCount;
    private  Integer page;

    public Boolean getResult()
    {
        return this.result;
    }

    public void setResult(Boolean result)
    {
        result = Boolean.valueOf(true);
        this.result = result;
    }

    public Object getObj()
    {
        return this.obj;
    }

    public void setObj(Object obj)
    {
        this.obj = obj;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }
}
