package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author CJYong
 * @create 2021-08-18 18:46
 */
@Controller
public class JspController {

    @RequestMapping("/success")
    public String success(){
        return "success";
    }
}
