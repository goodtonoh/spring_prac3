package com.sparta.spring_prac3.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ORDER_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "RESTAURANT_ID")
    private Restaurant restaurant;

    @ManyToOne
    @JoinColumn(name = "FOOD_ID")
    private Food food;

//    @ManyToOne
//    @JoinColumn(name = "ORDER_ID")
//    private Order order;

    private int quantity;
    private int totalPrice;

//    @OneToMany
//    private List<Order> orderList = new ArrayList<>();



//    public void calTotalPrice(List<Food> orderFood) {
//
//        int sum = 0;
//        for (Food food : orderFood) {
//            sum += order.getPrice();
//        }
//        sum += this.restaurant.getDeliveryFee();
//        this.totalPrice = sum;
//    }

    @Builder
    public Order(Restaurant restaurant, int totalPrice) {

        this.restaurant = restaurant;
        this.totalPrice = totalPrice;
    }

    @Builder
    public void OrderFood(int quantity, Food food) {
        
        this.quantity = quantity;
        this.food = food;

    }

}
