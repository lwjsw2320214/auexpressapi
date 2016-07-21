package com.auexpress.controller;

import com.auexpress.entity.AjaxJson;
import com.auexpress.entity.RecPreInput;
import com.auexpress.service.RecPreInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by 缁村啗 on 2016/07/16.
 */

@Controller
@RequestMapping(value = "/recPreInput")
public class RecPreInputController {
    @Autowired
    RecPreInputService service;


    /**
     * 获取分页数据
     * */
    @RequestMapping(value = {"list", ""},method = RequestMethod.POST)
    @ResponseBody
    public Object getRecPreInput(HttpServletRequest request,HttpServletResponse response){
        AjaxJson ajaxJson=new AjaxJson();
        try{
        String paricid=request.getParameter("icid");
        Integer icid= Integer.parseInt(paricid);
        String paririd=request.getParameter("irid");
        Integer irid=Integer.parseInt(paririd);
        String parpage=request.getParameter("page");
        Integer page= Integer.parseInt(parpage);
        List<RecPreInput> list=service.getPageList(icid,irid,page,5);
        ajaxJson.setResult(true);
        ajaxJson.setPageCount(service.getPageCount(icid,irid,5));
        ajaxJson.setPage(page);
        ajaxJson.setObj(list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return ajaxJson;
    }
}
