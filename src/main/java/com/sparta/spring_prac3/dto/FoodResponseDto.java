package com.sparta.spring_prac3.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@NoArgsConstructor
@Getter
public class FoodResponseDto {

    private Long id;
    private String name;
    @Range(min = 100, max = 1000000, message = "100원 ~ 1,000,000원")
    private int price;

    public FoodResponseDto(Long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }

}





