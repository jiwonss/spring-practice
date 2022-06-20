package com.example.springpractice.part3.ch06.validation.dto;

import com.example.springpractice.part3.ch06.validation.annotation.YearMonth;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Data
public class User {

    @NotBlank
    private String name;

    @Max(value = 90)
    private int age;

    @Email
    private String email;

    @Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", message = "핸드폰 번호의 양식과 맞지 않습니다. 01x-xxx(x)-xxxx")
    private String phoneNumber;

    @YearMonth
    private String reqYearMonth;

    @Valid
    private List<Car> cars;

//    @AssertTrue(message = "yyyyMM의 형식에 맞지 않습니다.")
//    public boolean isReqYearMonthValidation() {
//        try {
//            LocalDate localDate = LocalDate.parse(getReqYearMonth() + "01", DateTimeFormatter.ofPattern("yyyyMMdd"));
//        } catch (Exception e) {
//            return false;
//        }
//
//        return true;
//    }

}
