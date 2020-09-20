package com.learn.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learn.data.Info;
import com.learn.data.NokiaPhone;
import com.learn.data.SamsungPhone;

@Configuration
@ComponentScan(basePackages="com.learn")
public class AnnotationConfig {
	
	
	@Bean(name="samsung")
	public SamsungPhone getSamsungPhone()
	{
		return new SamsungPhone();
	}
	
	@Bean(name="nokia")
	public NokiaPhone getNokiaPhone()
	{
		return new NokiaPhone();
	}
	


}
