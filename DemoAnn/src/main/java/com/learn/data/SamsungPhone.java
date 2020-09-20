package com.learn.data;

import org.springframework.stereotype.Component;


public class SamsungPhone implements Phone {

	@Override
	public void type() {
		System.out.println("Samsung phone..");

	}

}
