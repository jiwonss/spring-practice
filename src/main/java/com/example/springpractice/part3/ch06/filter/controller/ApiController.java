package com.example.springpractice.part3.ch06.filter.controller;

import com.example.springpractice.part3.ch06.filter.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("part3.ch06.filter.controller.ApiController")
@RequestMapping("/filter/api/user")
public class ApiController {

    @PostMapping("")
    public User user(@RequestBody User user) {
        log.info("User : {}", user);
        return user;
    }

}
