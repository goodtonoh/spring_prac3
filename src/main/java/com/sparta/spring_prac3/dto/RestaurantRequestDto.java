package com.sparta.spring_prac3.dto;


import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@NoArgsConstructor
@Getter
public class RestaurantRequestDto {

    @NotNull
    private String name;

    @NotNull
    @Range(min = 1000, max = 100000, message = "1,000원 ~ 100,000원")
    private int minOrderPrice;

    @NotNull
    @Range(min = 0, max = 10000, message = "0원 ~ 10,000원")
    private int deliveryFee;

    public RestaurantRequestDto(String name, int minOrderPrice, int deliveryFee) {
        this.name = name;
        this.minOrderPrice = minOrderPrice;
        this.deliveryFee = deliveryFee;
    }

}
