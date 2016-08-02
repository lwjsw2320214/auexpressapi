package com.auexpress.controller;

import com.auexpress.entity.AjaxJson;
import com.auexpress.entity.SmsBatch;
import com.auexpress.service.RecPreInputService;
import com.auexpress.service.SmsBatchService;
import com.auexpress.service.UserLoginServer;
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

    @Autowired
    UserLoginServer userLoginServer;
    @Autowired
    RecPreInputService  recPreInputService;

    //每页展示数量
    private final  Integer rowCount=15;


    @RequestMapping(value = "getList",method = RequestMethod.POST)
    @ResponseBody
    public AjaxJson getList(HttpServletRequest request,HttpServletResponse response,String username,String token){
        AjaxJson ajaxJson=new AjaxJson();
        boolean v = this.userLoginServer.userVerification(username, token);
        if (v) {
            try {
                String paricid = request.getParameter("icid");
                Integer icid = Integer.parseInt(paricid);
                String parpage = request.getParameter("page");
                Integer page = Integer.parseInt(parpage);
                List<SmsBatch> list = service.getPageList(icid, page, rowCount);
                ajaxJson.setResult(true);
                ajaxJson.setPageCount(service.getPageCount(icid, rowCount));
                ajaxJson.setPage(page);
                ajaxJson.setObj(list);
            } catch (Exception e) {

            }
        }
        return ajaxJson;
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public  AjaxJson add(SmsBatch smsBatch,HttpServletRequest request,HttpServletResponse response,String username,String token){
        AjaxJson ajaxJson=new AjaxJson();
        boolean v = this.userLoginServer.userVerification(username, token);
        if (v) {
            try {
                Integer i = service.add(smsBatch);
                ajaxJson.setResult(true);
                ajaxJson.setObj(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return  ajaxJson;
    }

    /**
     * 删除批次号
     * */
    @RequestMapping(value = "delete",method = RequestMethod.POST)
    @ResponseBody
    public AjaxJson delete(Integer id,String username,String token){
        AjaxJson ajaxJson=new AjaxJson();
        boolean v = this.userLoginServer.userVerification(username, token);
        if (v){
            Integer count=0;
            try {
                Integer i=   recPreInputService.getBatcrRecCount(id);
                if (i==0){
                    count=service.delete(id);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            ajaxJson.setResult(true);
            ajaxJson.setObj(count);
        }
        return ajaxJson;
    }

}
