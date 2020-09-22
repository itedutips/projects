package com.learn.utilities;

import org.springframework.stereotype.Component;

@Component
public class SingletonHello {
	
	public SingletonHello() {
		System.out.println("SingletonHello instantiated!");
	}


}
