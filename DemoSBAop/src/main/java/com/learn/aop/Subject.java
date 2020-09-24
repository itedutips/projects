package com.learn.aop;

import org.springframework.stereotype.Component;

@Component
public class Subject {
	
	public void message() {
		System.out.println("Subject he likes is Chemistry!");
	}

}
