package com.ethicalsolutions.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ethicalsolutions.model.HibernateUtil;
import com.ethicalsolutions.model.Product;

@Path("/products")
public class ProductController {
	
	  @GET 
	  @Path("/id/{id}")
	  @Produces(MediaType.APPLICATION_JSON)  
	  public Object getProductById(@PathParam("id") String productId) {  
		Object product=null;
		try {
	        long id= Long.parseLong(productId);
		    SessionFactory sf = HibernateUtil.getSessionFactory();
		    Session session = sf.openSession();
		    session.beginTransaction();
		    Long pid =new Long(id);
		    product = (Object)session.get(Product.class,pid );
		    if(product == null)
		    {
		    	return Response.status(204).build();
		    }
		    session.getTransaction().commit();
		    session.close();
		    return product;
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException");
			return Response.status(Status.NOT_FOUND).entity("NumberFormatException!").build();
		}
			
	    
	  }  

	 
	  @SuppressWarnings("unchecked")
	  @GET 
	  @Path("/catname/{catname}")
	  @Produces(MediaType.APPLICATION_JSON)  
	  public List<Object> getProductsByCategory(@PathParam("catname") String catname) { 
	    SessionFactory sf = HibernateUtil.getSessionFactory();
	    Session session = sf.openSession();
	    session.beginTransaction();
	    String hql = "from Product as p where p.productCategory like :searchField";
	    Query query = session.createQuery(hql);
	    /*
	     ** 
	     **For start with character
	    query.setString("searchField","%"+catname+"%");
	    
	    */
	    query.setString("searchField",catname);
	    
	    @SuppressWarnings("unchecked")
		List<Object> results = query.list();
	    
	    if(results == null)
	    {  
	    	return (List<Object>) Response.status(204).build();
	    }
	    
	    session.getTransaction().commit();
	    session.close();
	    return results;
	  } 
	   
  
    @SuppressWarnings("unchecked")
	@GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON) 
    public List<Object> getMsg() {
    	
    	SessionFactory sf = HibernateUtil.getSessionFactory();
	    Session session = sf.openSession();
	    session.beginTransaction();
	    String hql = "from Product";
	    Query query = session.createQuery(hql);
	   
	    @SuppressWarnings("unchecked")
		List<Object> results = query.list();
	    
	    if(results == null)
	    {  
	    	 
	    	return (List<Object>) Response.status(204).build();
	    }
	    
	    session.getTransaction().commit();
	    session.close();
	    return results;
  
       
  
    }
    
    
  
}
