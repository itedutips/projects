package com.learn.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	public boolean validate(String uName, String password)
	{
		if(uName.equals("Alex") && password.equals("changeme"))
		{
			return true;
		}
		
		return false;
	}

}
