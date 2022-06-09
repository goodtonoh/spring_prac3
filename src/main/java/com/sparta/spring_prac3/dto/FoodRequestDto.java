package com.sparta.spring_prac3.dto;

import com.sparta.spring_prac3.model.Restaurant;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@NoArgsConstructor
@Getter
public class FoodRequestDto {

    private Long id; // 음식 ID
    private String name; // 음식 이름
    @Range(min = 100, max = 1000000, message = "100원 ~ 1,000,000원")
    private int price; // 음식 가격
    private int quantity;
    private Restaurant restaurant;

    @Builder
    public FoodRequestDto(Long id, String name, int price, int quantity, Restaurant restaurant) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.restaurant = restaurant;

    }
}
