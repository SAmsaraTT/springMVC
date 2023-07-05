package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/21 23:24
 * @Version 1.0
 */
@Controller
public class JspController {
    @RequestMapping("/success")
    public String success() {
        return "success";
    }
}
