package com.sparta.spring_prac3.service;

import com.sparta.spring_prac3.model.Food;
import com.sparta.spring_prac3.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public Food registerFood(Food food) {

        return foodRepository.save(food);


    }

//    public Food createFood(Long restaurantId, String name, int price) {
//        List<Food> restaurant = findAllByRestaurantId(restaurantId);
//        Food food = new Food(restaurantId, name, price);
//        return food;
//    }

    public List<Food> getFoods() {

        return foodRepository.findAll();


    }

    public Optional<Food> findById(Long id) {

        return foodRepository.findById(id);


    }


}


