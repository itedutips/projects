package com.ethicalsolutions.model;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	static {
		
		Configuration cf = new Configuration();
        cf.configure("hibernate.cfg.xml").addAnnotatedClass(Product.class)
        								 .addAnnotatedClass(Customer.class)
        								 .addAnnotatedClass(CustomerOrder.class); 
    
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(cf.getProperties()).build();
        sessionFactory = cf
                .buildSessionFactory(serviceRegistry);
		
	}
	
	public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
