package com.ethicalsolutions;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ethicalsolutions.model.Customer;
import com.ethicalsolutions.model.CustomerOrder;
import com.ethicalsolutions.model.HibernateUtil;
import com.ethicalsolutions.model.Product;


public class InternalApp {

	public static void main(String[] args) {
		System.out.println("Main.............");
		/*
        System.out.println( "Hello World!" );
        String str = "2020-11-10";
        Date date=Date.valueOf(str);//converting string into sql date
        
        Product product = new Product("Zodiac Shirt", "Clothes", "Gents Shirt",
    			258, 400, date , 5)  ;
        Customer customer=new Customer("George", "apartment address", "locality","landmark",
    			"city", (long)555000,"India", 91, "mainmobileno","altmobileno");
        
    
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session= sf.openSession();
        session.beginTransaction();
        session.save(product);
        session.save(customer);
        session.getTransaction().commit();
        
        String orderStr = "2020-11-11";
        Date orderDate=Date.valueOf(orderStr);
         		
        CustomerOrder order = new CustomerOrder(100,5,orderDate,"pending");
        order.setCustomer(customer);
        order.setProduct(product); 
        session.beginTransaction();
        session.save(order);
        session.getTransaction().commit();
         
        session.close();
        sf.close();
        */
	}

}
