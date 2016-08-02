package com.auexpress.controller;

import com.auexpress.entity.ApiAjaxJson;
import com.auexpress.entity.CourierNumber;
import com.auexpress.service.CourierNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 维军 on 2016/07/30.
 */
@Controller
@RequestMapping({"/courierNumber"})
public class CourierNumberController {

    @Autowired
    CourierNumberService service;

//    @RequestMapping(value={"list", ""}, method= RequestMethod.GET)
//    @ResponseBody
//    public ApiAjaxJson getCourierNumber(){
//        ApiAjaxJson apiAjaxJson=new ApiAjaxJson();
//        CourierNumber  courierNumber=service.getCourierNumber();
//        if (courierNumber!=null){
//            apiAjaxJson.setResult(true);
//            apiAjaxJson.setObj(courierNumber);
//        }
//        return apiAjaxJson;
//    }

}
