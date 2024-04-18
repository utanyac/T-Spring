package com.cc.tspring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cc.tspring.dao")
public class TSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(TSpringApplication.class, args);
    }

}
