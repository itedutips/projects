package com.learn.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
//@EnableAspectJAutoProxy(proxyTargetClass=true)
public class AopClass {
	@Before("execution(public void message())")
	public void startMessage() {
		
		System.out.println("School is MGM"); 
	}
    
	@After("execution(public void message())")
	public void endMessage() {
		
		System.out.println("function just called!"); 
	}
}
