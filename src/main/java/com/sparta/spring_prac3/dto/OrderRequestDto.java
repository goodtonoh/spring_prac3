package com.sparta.spring_prac3.dto;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class OrderRequestDto {

    private Long restaurantId;
    private List<FoodRequestDto> foods = new ArrayList<>();

    @Builder
    public OrderRequestDto(Long restaurantId, List<FoodRequestDto> foods) {
        this.restaurantId = restaurantId;
        this.foods = foods;

    }
}
