package com.hwua.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class UserController {
    @RequestMapping("/user/login")
    public String login(String username,String password,HttpSession session,Map map){
        System.out.println(username);
        System.out.println(password);
        if("admin".equals(username) && "123456".equals(password)){
            System.out.println("验证成功！");
            session.setAttribute("username",username);
            return "redirect:/main.html";
        }else{
            map.put("loginInfo","用户名或者密码错误");
            return "login";
        }


    }

}
