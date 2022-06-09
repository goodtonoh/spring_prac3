package com.sparta.spring_prac3.repository;

import com.sparta.spring_prac3.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
