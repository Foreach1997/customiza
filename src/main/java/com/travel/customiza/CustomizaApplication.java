package com.travel.customiza;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.travel.customiza")
public class CustomizaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomizaApplication.class, args);
    }

}
