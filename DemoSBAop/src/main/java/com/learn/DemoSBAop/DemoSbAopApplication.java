package com.learn.DemoSBAop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.learn.aop.Subject;
import com.learn.utilities.Student;

@SpringBootApplication
@ComponentScan("com.learn")
public class DemoSbAopApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context =  SpringApplication.run(DemoSbAopApplication.class, args);
		
		context.getBean(Student.class).message();
		context.getBean(Student.class).message();
		context.getBean(Subject.class).message();
	}

}
