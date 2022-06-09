package com.sparta.spring_prac3.service;

import com.sparta.spring_prac3.model.Restaurant;
import com.sparta.spring_prac3.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    @Transactional
    public Restaurant register(Restaurant restaurant) {

        return restaurantRepository.save(restaurant);
    }

    public List<Restaurant> findRestaurants() {

        return restaurantRepository.findAll();
    }

    public Optional<Restaurant> findOne(Long id) {

        return restaurantRepository.findById(id);
    }


}
