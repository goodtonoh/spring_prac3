package com.sparta.spring_prac3.repository;

import com.sparta.spring_prac3.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {

    List<Food> findAll();
    List<Food> findAllByRestaurantId(Long restaurantId);

    Optional<Food> findById(Long id);
    // Optional<Food> findFoodByRestaurantId(Long restaurantId);



}
