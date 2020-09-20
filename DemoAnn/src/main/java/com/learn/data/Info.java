package com.learn.data;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/*
 * @Component is a class level annotation whereas @Bean is a method level 
 * annotation and name of the method serves as the bean name.
 */
@Component
public class Info {

 @Bean
 public Info message()
 {
	 System.out.println("Samsung is more common then Nokia phone now a days!");
	 return this;
 }

}
