package com.example.springpractice.part3.ch05.aop.controller;

import com.example.springpractice.part3.ch05.aop.annotation.Decode;
import com.example.springpractice.part3.ch05.aop.annotation.Timer;
import com.example.springpractice.part3.ch05.aop.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aop/api")
public class RestApiController {

    @GetMapping("/get/{id}")
    public String  get(@PathVariable Long id, @RequestParam String name) {
        System.out.println("get method : " + id + " " + name);
        return id + " " + name;
    }

    @PostMapping("/post")
    public User post(@RequestBody User user) {
        System.out.println("post method : " + user);
        return user;
    }

    @Timer
    @DeleteMapping("/delete")
    public void delete() throws InterruptedException {
        // db logic
        Thread.sleep(1000 * 2);
    }

    @Decode
    @PutMapping("/put")
    public User put(@RequestBody User user) {
        System.out.println("put method : " + user);
        return user;
    }

}
