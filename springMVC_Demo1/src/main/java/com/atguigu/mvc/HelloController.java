package com.atguigu.mvc;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author CJYong
 * @create 2021-08-16 10:15
 */

@Controller
public class HelloController {

    //处理请求和控制器方法之间的映射关系
    @RequestMapping(value = "/")
    public String index(){
        //返回视图名称
        return "index";
    }

    @RequestMapping(value = "/target")
    public String toTarget(){
        return "target";
    }


}
