package com.wind.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello/api")
public class ApiController {
    @RequestMapping("getAll")
    @ResponseBody
    public String getAll() {
        return "hello world";
    }
}
