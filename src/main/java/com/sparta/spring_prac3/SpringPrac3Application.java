package com.sparta.spring_prac3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import java.math.BigDecimal;

// @EnableJpaAuditing
@SpringBootApplication
public class SpringPrac3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringPrac3Application.class, args);
    }

}

