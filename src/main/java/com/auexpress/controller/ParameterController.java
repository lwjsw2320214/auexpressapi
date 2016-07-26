package com.auexpress.controller;

import com.auexpress.entity.AjaxJson;
import com.auexpress.entity.Express;
import com.auexpress.service.ExpressService;
import com.auexpress.service.UserLoginServer;
import com.sun.org.apache.bcel.internal.generic.I2F;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 维军 on 2016/07/18.
 */

@Controller
@RequestMapping({"/parameter"})
public class ParameterController {

    @Autowired
    ExpressService expressService;
    @Autowired
    UserLoginServer userLoginServer;

    /**
     * 获取快递类别
     * */
    @RequestMapping(value="getExpressTypeList", method= RequestMethod.POST)
    @ResponseBody
    public AjaxJson getExpressTypeList(String token,String username){
        AjaxJson ajaxJson=new AjaxJson();
        boolean v = this.userLoginServer.userVerification(username, token);
        if (v){
            List<Express> list=expressService.getList();
            ajaxJson.setResult(true);
            ajaxJson.setObj(list);
        }
        return ajaxJson;
    }

}
