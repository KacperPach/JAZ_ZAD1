package com.JAZ1.zad1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Zad1Application {

	public static void main(String[] args) {
		SpringApplication.run(Zad1Application.class, args);
	}

}
