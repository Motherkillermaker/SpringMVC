package com.atguigu.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.security.util.Password;

/**
 * @author CJYong
 * @create 2021-08-16 15:50
 */
@Controller
//@RequestMapping("/hello")
public class RequestMappingController {

    @RequestMapping(
            value = {"/testRequestMapping","/test"},
            method = {RequestMethod.GET,RequestMethod.POST}

    )
    public String RequestMapping(){
        return "RequestMapping";

    }

    @RequestMapping(
            value = "/testParmsAndHeaders",
            params = {"username", "password=123456"},
            headers = {"header"}
    )

    public String testParmsAndHeaders(){
        return "RequestMapping";
    }

    @RequestMapping("/testPath/{id}")
    public String testPath(@PathVariable("id")Integer id){
        System.out.println("id = " + id);
        return "RequestMapping";
    }


}
