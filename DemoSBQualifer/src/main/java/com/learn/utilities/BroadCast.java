package com.learn.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BroadCast {
	
	@Autowired
	@Qualifier("nokiaPhone")
	private Phone phone;
	
	public void hello() {
		phone.hello();
	}

}
