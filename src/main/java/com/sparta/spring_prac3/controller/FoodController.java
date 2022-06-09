package com.sparta.spring_prac3.controller;

import com.sparta.spring_prac3.dto.FoodRequestDto;
import com.sparta.spring_prac3.dto.FoodResponseDto;
import com.sparta.spring_prac3.model.Food;
import com.sparta.spring_prac3.model.Restaurant;
import com.sparta.spring_prac3.repository.FoodRepository;
import com.sparta.spring_prac3.repository.RestaurantRepository;
import com.sparta.spring_prac3.service.FoodService;
import com.sparta.spring_prac3.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
public class FoodController {

    private final FoodService foodService;
    private final RestaurantService restaurantService;


    @GetMapping("/restaurant/{restaurantId}/foods")
    public List<Food> getFoods(@PathVariable String restaurantId) {

        return foodService.getFoods();




        // return foodService.findAllByRestaurantId(restaurantId);
        // return foodRepository.findAllByRestaurantId(Long.valueOf(restaurantId));
        // 빌더패턴, 생성자패턴
    }


    @PostMapping("/restaurant/{restaurantId}/food/register")
    public Food registerFood(@PathVariable Long restaurantId, @RequestBody  FoodRequestDto requestDto) {

        if (requestDto.getPrice() % 100 > 0) {
            throw new IllegalArgumentException("100원 단위로만 입력 가능");
       }

        Restaurant restaurant = restaurantService.findOne(restaurantId)
                .orElseThrow(() -> new IllegalArgumentException("음식점 정보가 없습니다."));

        Food food = Food.builder()
                .name(requestDto.getName())
                .price(requestDto.getPrice())
                .restaurant(requestDto.getRestaurant())
                .build();
        return foodService.registerFood(food);


    }

}
