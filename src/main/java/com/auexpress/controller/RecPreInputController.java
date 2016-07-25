package com.auexpress.controller;

import com.auexpress.entity.AjaxJson;
import com.auexpress.entity.RecPreInput;
import com.auexpress.service.RecPreInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by on 2016/07/16.
 */

@Controller
@RequestMapping(value = "/recPreInput")
public class RecPreInputController {
    @Autowired
    RecPreInputService service;

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
            String parbatchId=request.getParameter("batchId");
            Integer batchId=null;
            if (!StringUtils.isEmpty(parbatchId)){
                batchId=Integer.parseInt(parbatchId);
            }
            List<RecPreInput> list=service.getPageList(icid,irid,page,5,batchId);
            ajaxJson.setResult(true);
            ajaxJson.setPageCount(service.getPageCount(icid,irid,5,batchId));
            ajaxJson.setPage(page);
            ajaxJson.setObj(list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return ajaxJson;
    }

    /**
     * 获取到单个运单
     * */
    @RequestMapping(value = "getRecPreInput",method = RequestMethod.POST)
    @ResponseBody
    public AjaxJson getRecPreInput(Integer iid,Integer icid,String waybillId){
        AjaxJson ajaxJson=new AjaxJson();
        RecPreInput recPreInput= service.getRecPreInput(iid, icid, waybillId);
        ajaxJson.setObj(recPreInput);
        if(recPreInput!=null){
            ajaxJson.setResult(true);
        }
        return  ajaxJson;
    }
}
