package com.auexpress.controller;

import com.auexpress.entity.AjaxJson;
import com.auexpress.entity.SmsBatch;
import com.auexpress.service.SmsBatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by 维军 on 2016/07/20.
 */

@Controller
@RequestMapping(value = "/smsBatch")
public class SmsBatchController {

    @Autowired
    SmsBatchService service;


    @RequestMapping(value = "getList",method = RequestMethod.POST)
    @ResponseBody
    public AjaxJson getList(HttpServletRequest request,HttpServletResponse response){
        AjaxJson ajaxJson=new AjaxJson();
        try {
            String paricid=request.getParameter("icid");
            Integer icid= Integer.parseInt(paricid);
            String parpage=request.getParameter("page");
            Integer page= Integer.parseInt(parpage);
            List<SmsBatch> list = service.getPageList(icid,page,10);
            ajaxJson.setResult(true);
            ajaxJson.setPageCount(service.getPageCount(icid, 10));
            ajaxJson.setPage(page);
            ajaxJson.setObj(list);
        }catch (Exception e){

        }
        return ajaxJson;
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public  AjaxJson add(SmsBatch smsBatch,HttpServletRequest request,HttpServletResponse response){
        AjaxJson ajaxJson=new AjaxJson();
        try {
            Integer i= service.add(smsBatch);
            ajaxJson.setResult(true);
            ajaxJson.setObj(i);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  ajaxJson;
    }

}
