package com.example.springpractice.part3.ch04.put.dto;

import com.example.springpractice.part3.ch04.put.dto.CarDto;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

@Data
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PutRequestDto {

    private String name;
    private int age;
    private List<CarDto> carList;

}
