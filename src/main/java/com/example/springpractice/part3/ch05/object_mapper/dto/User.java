package com.example.springpractice.part3.ch05.object_mapper.dto;

import lombok.Data;

import java.util.List;

@Data
public class User {

    private String name;
    private int age;
    private List<Car> cars;

}
