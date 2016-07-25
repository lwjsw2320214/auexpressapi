package com.auexpress.controller;

import com.auexpress.entity.AjaxJson;
import com.auexpress.entity.Express;
import com.auexpress.service.ExpressService;
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


    /**
     * 获取到
     * */
    @RequestMapping(value="getExpressTypeList", method= RequestMethod.POST)
    @ResponseBody
    public AjaxJson getExpressTypeList(){
        AjaxJson ajaxJson=new AjaxJson();
        List<Express> list=expressService.getList();
        ajaxJson.setResult(true);
        ajaxJson.setObj(list);
        return ajaxJson;
    }

}
