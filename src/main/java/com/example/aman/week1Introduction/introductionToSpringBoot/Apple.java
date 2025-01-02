package com.example.aman.week1Introduction.introductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Apple {

    public void eatApple() {
        System.out.println("I am eating an apple");
    }

    @PostConstruct
    public void invokedAfterBeanCreated() {
        System.out.println("Apple object is being created");
    }

    @PreDestroy
    public void invokedBeforeBeanDestoyed() {
        System.out.println("Apple object is being destroyed");
    }
}
