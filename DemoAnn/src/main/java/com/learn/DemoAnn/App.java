package com.learn.DemoAnn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learn.configuration.AnnotationConfig;
import com.learn.data.Info;
import com.learn.data.NokiaPhone;
import com.learn.data.SamsungPhone;


public class App 
{

	
    public static void main( String[] args )
    {
        System.out.println( "Spring framework annotation example" );
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
    	
        NokiaPhone phone1 =  (NokiaPhone) context.getBean("nokia");
        phone1.type();
        SamsungPhone phone2 =  (SamsungPhone) context.getBean("samsung");
        phone2.type();
        Info info = (Info) context.getBean("message");
        info.message();   
        
    }
}
