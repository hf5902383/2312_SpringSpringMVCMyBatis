package cn.tedu._05mvcboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller注解： 标识为controller类 根据用户请求的url地址接受用户的请求
 */
@Controller
public class UserController {
    @RequestMapping(value = "/v1/users/login")
    @ResponseBody
    public String login(){
        return "登录成功";
    }

}
