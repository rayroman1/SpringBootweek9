package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan (basePackages = {"com.example.demo2.exam,com.example.demo3"})
@EnableJpaRepositories(basePackages = "com.example.demo2.exam")
@EntityScan("com.example.demo2.exam")

public class SpringBootMySmain {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMySmain.class, args);
    }
}
