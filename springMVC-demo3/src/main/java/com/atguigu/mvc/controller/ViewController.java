package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/21 18:33
 * @Version 1.0
 */
@Controller
public class ViewController {
    @RequestMapping("/testThymeleafView")
    public String testThymeleafView() {
        return "success";
    }

    @RequestMapping("/testForward")
    public String testForward() {
        return "forward:/testThymeleafView";
    }

    @RequestMapping("/testRedirect")
    public String testRedirect() {
        return "redirect:/testThymeleafView";
    }
}
