package com.auexpress.controller;

import com.auexpress.entity.AjaxJson;
import com.auexpress.entity.RecPreInput;
import com.auexpress.service.RecPreInputService;
import com.auexpress.service.UserLoginServer;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
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
    @Autowired
    UserLoginServer userLoginServer;
    //每页展示数量
    private final  Integer rowCount=15;

    @RequestMapping(value = {"list", ""},method = RequestMethod.POST)
    @ResponseBody
    public Object getRecPreInput(HttpServletRequest request,HttpServletResponse response,String username,String token,String cnum){
        AjaxJson ajaxJson=new AjaxJson();
        boolean v = this.userLoginServer.userVerification(username, token);
        if (v){
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
            List<RecPreInput> list=service.getPageList(icid,irid,page,rowCount,batchId,cnum);
            ajaxJson.setResult(true);
            ajaxJson.setPageCount(service.getPageCount(icid,irid,rowCount,batchId,cnum));
            ajaxJson.setPage(page);
            ajaxJson.setObj(list);
        }catch (Exception e){
            e.printStackTrace();
        }
        }
        return ajaxJson;
    }

    /**
     * 获取到单个运单
     * @param iid 运单id
     * @param icid 用户id
     * @param  waybillId 旧运单号id
     * */
    @RequestMapping(value = "getRecPreInput",method = RequestMethod.POST)
    @ResponseBody
    public AjaxJson getRecPreInput(Integer iid,Integer icid,String waybillId,String username,String token,Integer batchId){
        AjaxJson ajaxJson=new AjaxJson();
        boolean v = this.userLoginServer.userVerification(username, token);
        if (v) {
            RecPreInput recPreInput = service.getRecPreInput(iid, icid, waybillId,batchId);
            ajaxJson.setObj(recPreInput);
            if (recPreInput != null) {
                ajaxJson.setResult(true);
            }
        }
        return  ajaxJson;
    }
}
