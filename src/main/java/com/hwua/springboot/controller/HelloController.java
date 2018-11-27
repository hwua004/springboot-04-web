package com.hwua.springboot.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello1")
    public String hello1(){
        JSONObject obj= new JSONObject();
        obj.put("info","hello1");
        return obj.toJSONString();
    }

    @RequestMapping("/hello2")
    public String hello2(){
        JSONObject obj= new JSONObject();
        obj.put("info","hello2");
        return obj.toJSONString();
    }

    @RequestMapping("/hello3")
    public String hello3(){
        JSONObject obj= new JSONObject();
        obj.put("info","hello3");
        return obj.toJSONString();
    }

}
