package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author hliu
 * @Date 2023/7/4 21:06
 * @Version 1.0
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
