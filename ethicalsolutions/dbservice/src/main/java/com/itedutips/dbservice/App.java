package com.itedutips.dbservice;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.itedutips.dbservice.model.Products;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String str = "2020-11-10";
        Date date=Date.valueOf(str);//converting string into sql date
        
        Products product = new Products(1000, "Zodiac Shirt", "Clothes", "Gents Shirt",
    			258, 400, date , 5)  ;
        
       
        Configuration cf = new Configuration();
        cf.configure("hibernate.cfg.xml").addAnnotatedClass(Products.class); 
       
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(cf.getProperties()).build();
        SessionFactory sf = cf
                .buildSessionFactory(serviceRegistry);
        Session session= sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(product);
        session.getTransaction().commit();
        session.close();
        sf.close();
        
        
    }
}
