package com.learn.utilities;

import org.springframework.stereotype.Component;

@Component
public class NokiaPhone implements Phone {

	@Override
	public void hello() {
		
		System.out.println("Hello from Nokia Phone");
	}

}
