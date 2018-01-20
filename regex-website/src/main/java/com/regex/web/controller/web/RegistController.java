package com.regex.web.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("regist")
public class RegistController {
    
    @RequestMapping("")
    public String regist() {
        return "web/regist/regist";
    }

}
