package com.example.aman.week1Introduction.introductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@ConditionalOnProperty(name = "deploy.db", havingValue = "dev")
public class DevDB implements DB{

    public String getData() {
        return "This is Dev Data";
    }
}
