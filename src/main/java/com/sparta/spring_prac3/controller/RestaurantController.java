package com.sparta.spring_prac3.controller;

import com.sparta.spring_prac3.dto.RestaurantRequestDto;
import com.sparta.spring_prac3.model.Restaurant;
import com.sparta.spring_prac3.repository.RestaurantRepository;
import com.sparta.spring_prac3.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class RestaurantController {

    private final RestaurantRepository restaurantRepository;
    private final RestaurantService restaurantService;

    // 음식점 조회
    @GetMapping("/restaurants")
    public List<Restaurant> getRestaurants() {
        return restaurantRepository.findAll();
    }

//    public List<Restaurant> findRestaurants() {
//        return restaurantService.findRestaurants();
//    }

    // 음식점 등록
    @PostMapping("/restaurant/register")
    public Restaurant registerRestaurant(@RequestBody RestaurantRequestDto requestDto) {

        Restaurant restaurant = Restaurant.builder()
                .name(requestDto.getName())
                .minOrderPrice(requestDto.getMinOrderPrice())
                .deliveryFee(requestDto.getDeliveryFee())
                .build();

        return restaurantService.register(restaurant);
    }

}
