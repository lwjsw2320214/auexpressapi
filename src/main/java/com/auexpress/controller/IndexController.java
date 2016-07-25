package com.auexpress.controller;

import com.auexpress.entity.AjaxJson;
import com.auexpress.entity.User;
import com.auexpress.service.UserLoginServer;
import com.auexpress.util.EncryptionCommen;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.auexpress.util.NetworkLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by on 2016/07/18.
 */
@Controller
@RequestMapping({"/index"})
public class IndexController
{
    @Autowired
    UserLoginServer userLoginServer;

    @RequestMapping(value={"list", ""}, method= RequestMethod.POST)
    @ResponseBody
    public AjaxJson Home(HttpServletResponse response, HttpServletRequest request)
    {
        AjaxJson ajaxJson = new AjaxJson();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String pd = "";
        try
        {
            pd = EncryptionCommen.decryptString(password);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        password = pd;
        password = EncryptionCommen.EncoderByMd5(password);
        User user = this.userLoginServer.login(username);
        if ((user != null) && (password.equals(user.getClientpassword())) && (user.getToken() != null))
        {
            ajaxJson.setResult(Boolean.valueOf(true));
            ajaxJson.setObj(user);
        }
        else
        {
            this.userLoginServer.removeCache(username);
        }
        return ajaxJson;
    }

    @RequestMapping(value={"getList"}, method=RequestMethod.GET)
    @ResponseBody
    public AjaxJson getList(HttpServletResponse response, HttpServletRequest request)
    {
        AjaxJson ajaxJson = new AjaxJson();
        String username = "zmagar";
        String token = "0cc01fde-869e-4c24-8976-d4ad5bb6ed25";
        boolean v = this.userLoginServer.userVerification(username, token);
        if (v) {
            ajaxJson.setResult(Boolean.valueOf(v));
        }
        return ajaxJson;
    }


    @RequestMapping(value={"getPost"}, method=RequestMethod.GET)
    @ResponseBody
    public  AjaxJson  getPost(){
        AjaxJson ajaxJson=new AjaxJson();
        NetworkLibrary networkLibrary=new NetworkLibrary();
        String count= networkLibrary.getPost("Http://www.baidu.com");
        ajaxJson.setObj(count);
        return ajaxJson;
    }

}
