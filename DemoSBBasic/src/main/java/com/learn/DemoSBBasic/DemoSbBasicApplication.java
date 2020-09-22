package com.learn.DemoSBBasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.learn.utilities.PrototypeHello;
import com.learn.utilities.SingletonHello;

@SpringBootApplication
@ComponentScan("com.learn") //Required to search utilities package
public class DemoSbBasicApplication {

	
	public static void main(String[] args) {
		
		System.out.println("Spring Boot basics!");
		
		ConfigurableApplicationContext context = SpringApplication.run(DemoSbBasicApplication.class, args);
		context.getBean(SingletonHello.class);
		context.getBean(SingletonHello.class);
		context.getBean(PrototypeHello.class);
		context.getBean(PrototypeHello.class);
		
	}

}
