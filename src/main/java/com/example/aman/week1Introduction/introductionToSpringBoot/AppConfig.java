package com.example.aman.week1Introduction.introductionToSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Mango getMango() {
        return new Mango();
    }
}
