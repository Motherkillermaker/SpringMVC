package com.atguigu.mvc;

import com.atguigu.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

/**
 * @author CJYong
 * @create 2021-08-17 10:17
 */
@Controller
public class ParmController {

    @RequestMapping("/testServletAPI")
    //形参位置的request表示当前请求
    public String testServletAPI(HttpServletRequest request){
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:"+username+",password:"+password);

        return "RequestMapping";
    }

    @RequestMapping("/testParm")
    public String testParm(
                           //require表示该参数是否必须传输（默认为true）, defaultValue表示该参数的默认值(没有传参或者为空)
                           @RequestParam(value = "user_name", required = false, defaultValue = "hehe") String username,
                           String password,
                           String[] hobby,
                           @RequestHeader("Host") String host,
                           @CookieValue("JSESSIONID") String JSESSIONID)
    {
        //必须使方法的请求参数和发送的请求参数一致
        //若请求参数中出现多个同名的请求参数，可以在控制器方法的形参位置设置字符串类型或字符串数组来接受此请求参数
        //若使用字符串类型的形参，最终结果为请求参数的每一个值之间使用逗号进行拼接
        System.out.println("username:"+username+",password:"+password + ",hoyyb:" + Arrays.toString(hobby));

        System.out.println("Host:" + host);

        System.out.println("JSESSIONID:" + JSESSIONID);

        return "RequestMapping";
    }

    @RequestMapping("/testBean")
    public String testBean(User user){

        System.out.println(user);

        return "RequestMapping";
    }


}
