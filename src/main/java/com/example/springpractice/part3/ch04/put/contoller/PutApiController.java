package com.example.springpractice.part3.ch04.put.contoller;

import com.example.springpractice.part3.ch04.put.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put/{userId}")
    public PutRequestDto put(@RequestBody PutRequestDto requestDto, @PathVariable Long userId) {
        System.out.println(userId);
        return requestDto;
    }

}
