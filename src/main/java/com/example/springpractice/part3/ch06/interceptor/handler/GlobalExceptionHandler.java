package com.example.springpractice.part3.ch06.interceptor.handler;

import com.example.springpractice.part3.ch06.interceptor.exception.AuthException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AuthException.class)
    public ResponseEntity autoException() {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }

}
