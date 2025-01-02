package com.example.aman.week1Introduction.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {

//	@Autowired
//	Apple myApple;
//
//	@Autowired
//	Apple myApple2;
//
//	@Autowired
//	Mango myMango;

	@Autowired
	DBService database;


	public static void main(String[] args) {

		SpringApplication.run(IntroductionToSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		myApple.eatApple();
//		myApple2.eatApple();
//		System.out.println(myApple.hashCode());
//		System.out.println(myApple2.hashCode());
		database.printData();
	}
}
