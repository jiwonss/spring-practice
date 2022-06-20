package com.example.springpractice.part3.ch06.exception.controller;

import com.example.springpractice.part3.ch06.exception.dto.User;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@RestController("part3.ch06.exception.controller.ApiController")
@RequestMapping("/exception/api/user")
@Validated
public class ApiController {

    @GetMapping("")
    public User get(
            @Size(min = 2)
            @RequestParam String name,

            @NonNull
            @Min(1)
            @RequestParam Integer age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);

        int a = 10 + age;

        return user;
    }

    @PostMapping("")
    public User post(@Valid @RequestBody User user) {
        System.out.println(user);
        return user;
    }

}
