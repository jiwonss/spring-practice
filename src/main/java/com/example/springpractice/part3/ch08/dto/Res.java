package com.example.springpractice.part3.ch08.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Res {

    private int result;
    private Body response;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Body {
        private String resultCode = "OK";
    }

}
