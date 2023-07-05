package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/11 22:39
 * @Version 1.0
 */
@Controller
public class HelloController {
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget() {
        return "target";
    }
}
