package com.atguigu.mvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Description
 * @Author hliu
 * @Date 2023/7/4 18:18
 * @Version 1.0
 */
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = {ArithmeticException.class, NullPointerException.class})
    public String testException(Exception ex, Model model) {
        model.addAttribute("ex", ex);
        return "error";
    }
}
