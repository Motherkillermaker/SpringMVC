package com.atguigu.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author CJYong
 * @create 2021-08-18 15:41
 */
@Controller
public class ViewController {
    //ThymeleafView
    @RequestMapping("/testThymeleafView")
    public String testThymeleafView(){
        return "success";
    }

    //转发视图
    @RequestMapping("/testForward")
    public String testForward(){
        return "forward:/testThymeleafView";
    }

    //重定向视图
    @RequestMapping("/testRedirect")
    public String testRedirect(){
        return "redirect:/testThymeleafView";
    }


}
