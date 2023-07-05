package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/19 17:02
 * @Version 1.0
 */
@Controller
public class TestController {
//    @RequestMapping("/")
//    public String index() {
//        return "index";
//    }

    @RequestMapping("/test_view")
    public String testView() {
        return "test_view";
    }

    @RequestMapping("/test_rest")
    public String testRest() {
        return "test_rest";
    }

}
