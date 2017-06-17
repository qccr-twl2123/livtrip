package com.livtrip.web.controller;


import com.livtrip.web.service.AdminUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 管理员控制器
 *
 * @author xierongli
 * @version $$Id: livtripmanager-parent, v 0.1 2016/10/12 17:14 user Exp $$
 */
@Controller
@RequestMapping("/backend/admin")
public class AdminUserController {


    @Resource
    private AdminUserService adminUserService;


    @RequestMapping("/loginProcess")
    public String login(String userName, String password, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response){
//        System.out.println("=========登录==============");
//        boolean result = adminUserService.isAdminUserExist(userName,MD5.GetMD5Code(password));
//        if(result){
//            request.getSession().setAttribute(Constant.SESSION_USER_NAME, userName);
//            modelMap.put("userName", userName);
//            return "/main";
//        }else{
//            modelMap.addAttribute("error", "无效的用户或密码");
//          return "/login";
//        }

        return "";
    }

    @RequestMapping("/loginout")
    public String loginout(HttpServletRequest request, HttpServletResponse response){
        request.getSession().invalidate();
        return "/login";
    }
    @RequestMapping("/loginPage")
    public  String gotoLoginPage(){
        return "/login";
    }




}
