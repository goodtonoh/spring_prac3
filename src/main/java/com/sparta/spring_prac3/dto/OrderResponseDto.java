package com.sparta.spring_prac3.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class OrderResponseDto {

    private String name;
    private int deliveryFee;
    private int totalPrice;
    private List<FoodResponseDto> foods;

    @Builder
    public OrderResponseDto(String name, int deliveryFee, int totalPrice, List<FoodResponseDto> foods) {
        this.name = name;
        this.deliveryFee = deliveryFee;
        this.totalPrice = totalPrice;
        this.foods = foods;
    }
}
