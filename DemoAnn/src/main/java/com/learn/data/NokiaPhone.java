package com.learn.data;

import org.springframework.stereotype.Component;


public class NokiaPhone implements Phone {

	@Override
	public void type() {
		System.out.println("Nokia phone..");
	}

}
