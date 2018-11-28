package com.hwua.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathController {
    @RequestMapping("/login.html")
    public String login(){
        return "login";

    }

    @RequestMapping("/main.html")
    public String main(){
        return "main";

    }

}
