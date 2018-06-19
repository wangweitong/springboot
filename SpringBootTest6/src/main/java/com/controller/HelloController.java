package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/employee")
public class HelloController {

    @RequestMapping("/hello")
    public String HelloController()
    {
        return "Hello Controller";
    }
}
