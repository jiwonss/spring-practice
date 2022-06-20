package com.example.springpractice.part3.ch06.exception.dto;

import lombok.Data;

@Data
public class Error {

    private String field;
    private String message;
    private String invalidValue;

}
