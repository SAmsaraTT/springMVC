package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/12 19:37
 * @Version 1.0
 */
@Controller
public class TestController {
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping("/param")
    public String param() {
        return "test_param";
    }


}
