package com.example.springpractice.part3.ch05.object_mapper.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Car {

    private String name;

    @JsonProperty("car_number")
    private String carNumber;

    @JsonProperty("TYPE")
    private String type;

}
