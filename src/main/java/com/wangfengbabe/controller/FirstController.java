package com.wangfengbabe.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @RequestMapping("/")
    String home() {
        return "hello world!";
    }

    @RequestMapping("/you")
    String home2() {
        return "hello you";
    }
}
