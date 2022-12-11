package com.dev.delta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan({  "com.dev.delta.security",
	"com.dev.delta.controllers", "com.dev.delta.services"}) 
@SpringBootApplication
public class SpringbootFactoryChefCodecanyonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFactoryChefCodecanyonApplication.class, args);
	}

}
