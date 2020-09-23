package com.learn.DemoSBQualifer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.learn.utilities.BroadCast;
import com.learn.utilities.Phone;

@SpringBootApplication
@ComponentScan("com.learn")
public class DemoSbQualiferApplication {
	

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(DemoSbQualiferApplication.class, args);	
		System.out.println("Spring Boot Qualifier Sample!");
		BroadCast bCast = context.getBean(BroadCast.class);
		bCast.hello();
	}

}
