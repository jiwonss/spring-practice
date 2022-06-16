package com.example.springpractice.part3.ch04.get.controller;

import com.example.springpractice.part3.ch04.get.dto.GetRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello")
    public String Hello() {
        return "Hello";
    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    public String hi() {
        return "Hi";
    }

    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String pathName) {
        return pathName;
    }

    @GetMapping("/query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {
        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach( entry -> {
            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });

        return sb.toString();
    }

    @GetMapping("/query-param02")
    public String queryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ) {
        return name + " " + email + " " + age;
    }

    @GetMapping("/query-param03")
    public String queryParam03(GetRequestDto getRequestDto) {
        return getRequestDto.toString();
    }


}
