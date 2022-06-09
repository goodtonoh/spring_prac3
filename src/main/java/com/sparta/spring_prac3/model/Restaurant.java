package com.sparta.spring_prac3.model;

import com.sparta.spring_prac3.dto.RestaurantRequestDto;
import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;

@NoArgsConstructor // 기본 생성자 생성
@Entity // 테이블임을 나타냅니다
@Getter
public class Restaurant {

    @Id // ID값 - Primary Key 사용
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동 증가 명령
    @Column(name = "RESTAURANT_ID")
    private Long id;
    @Column(nullable = false) // 컬럼 값이고 반드시 값이 존재해야 함을 나타냅니다
    private String name;

    @Column(nullable = false)
    private int minOrderPrice;

    @Column(nullable = false)
    private int deliveryFee;

    @Builder
    public Restaurant(String name, int minOrderPrice, int deliveryFee) {
        this.name = name;
        this.minOrderPrice = minOrderPrice;
        this.deliveryFee = deliveryFee;
    }

    public void register(RestaurantRequestDto requestDto) {
        this.name = requestDto.getName();
        this.minOrderPrice = requestDto.getMinOrderPrice();
        this.deliveryFee = requestDto.getDeliveryFee();
    }

}
