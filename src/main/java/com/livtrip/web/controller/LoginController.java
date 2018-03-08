package com.livtrip.web.controller;

import com.livtrip.web.model.Result;
import com.livtrip.web.model.Results;
import com.livtrip.web.service.AdminUserService;
import com.livtrip.web.util.MD5;
import com.livtrip.web.validator.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 登录控制器
 * @author xierongli
 * @version $$Id: livtrip, v 0.1 18/3/5 上午10:35 mark1xie Exp $$
 */
@Controller
@RequestMapping("login")
public class LoginController extends BaseController{

    @Autowired
    private AdminUserService adminUserService;

    @PostMapping("signIn")
    @ResponseBody
    public Result<Boolean> signIn(String userName, String password){
        Assert.isBlank(userName,"用户名不能为空");
        Assert.isBlank(password,"密码不能为空");
        Boolean result = adminUserService.queryAdminUser(userName, MD5.GetMD5Code(password));
        Assert.isTrue(!result,"用户名或密码不合法");
        return Results.newSuccessResult(true);
    }
    @RequestMapping("toMain")
    public String toMain(){
        return  "main";
    }

}
