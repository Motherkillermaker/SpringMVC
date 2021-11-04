package com.atguigu.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author CJYong
 * @create 2021-08-16 15:31
 */

@Controller
public class TestController {

    @RequestMapping("/")
    //匹配上下文路径的请求处理
    public String index(){
        return "index";
    }

    @RequestMapping("/parm")
    public String parm(){
        return "testParm";
    }

}
