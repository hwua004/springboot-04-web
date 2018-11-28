package com.hwua.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
    @RequestMapping("/hello.html")
    public ModelAndView demo(){
        ModelAndView mv= new ModelAndView();
        mv.addObject("username","admin");
        mv.setViewName("hello");
        return mv;
    }

}
