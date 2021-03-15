package com.hitachi.hitachi.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@MapperScan("com.hitachi.hitachi")
public class helloController {
    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }
}
