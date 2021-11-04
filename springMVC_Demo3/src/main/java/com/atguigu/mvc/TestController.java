package com.atguigu.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author CJYong
 * @create 2021-08-17 16:16
 */

@Controller
public class TestController {

//    @RequestMapping("/")
//    public String index(){
//        return "index";
//    }

    @RequestMapping("/test_View")
    public String testView(){
        return "test_View";
    }

}
