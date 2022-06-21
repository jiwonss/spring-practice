package com.example.springpractice.part3.ch08.controller;

import com.example.springpractice.part3.ch08.component.Calculator;
import com.example.springpractice.part3.ch08.dto.Req;
import com.example.springpractice.part3.ch08.dto.Res;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test/api")
@RequiredArgsConstructor
public class CalculatorApiController {

    private final Calculator calculator;

    @GetMapping("/sum")
    public int sum(@RequestParam int x, @RequestParam int y) {
        return calculator.sum(x, y);
    }

    @PostMapping("/minus")
    public Res minus(@RequestBody Req req) {
        int result = calculator.minus(req.getX(), req.getY());

        Res res = new Res();
        res.setResult(result);
        res.setResponse(new Res.Body());
        return res;
    }


}
