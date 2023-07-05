package com.atguigu.mvc.controller;

import com.atguigu.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/16 0:22
 * @Version 1.0
 */
@Controller
public class ParamController {
    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println(username + ": " + password);
        return "success";
    }

    @RequestMapping("/testParam")
    public String testParam(@RequestParam(value = "user_name", required = false, defaultValue = "hehe") String username, String password, String[] hobby,
                            @RequestHeader(value = "haha", required = true, defaultValue = "hehe") String host,
                            @CookieValue("JSESSIONID") String JSESSIONID) {
        System.out.println(username + ": " + password + ": " + Arrays.toString(hobby));
        System.out.println("host: " + host);
        System.out.println("JSESSIONID: " + JSESSIONID);
        return "success";
    }

    @RequestMapping("/testBean")
    public String testBean(User user) {
        System.out.println(user);
        return "success";
    }
}
