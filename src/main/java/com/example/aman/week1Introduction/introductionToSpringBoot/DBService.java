package com.example.aman.week1Introduction.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    @Autowired
    DB db;

    public void printData() {
        System.out.println(db.getData());
    }
}
