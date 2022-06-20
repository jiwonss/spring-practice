package com.example.springpractice.part3.ch06.interceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/interceptor/api/public")
public class PublicController {

    @GetMapping("/hello")
    public String hello() {
        return "public hello";
    }

}
