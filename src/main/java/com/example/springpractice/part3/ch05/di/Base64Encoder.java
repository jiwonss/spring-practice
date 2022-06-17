package com.example.springpractice.part3.ch05.di;

import java.util.Base64;

public class Base64Encoder implements IEncoder{

    public String encode(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }

}
