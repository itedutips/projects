package com.learn.utilities;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeHello {
	
	public PrototypeHello() {
		System.out.println("PrototypeHello instantiated!");
	}

}
