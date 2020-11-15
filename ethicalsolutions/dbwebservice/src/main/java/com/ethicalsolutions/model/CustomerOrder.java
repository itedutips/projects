package com.ethicalsolutions.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="customerorder")
public class CustomerOrder {
	
	@Id
	@Column(name = "order_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long orderId;
	
	long orderNumber;
	
	
	@ManyToOne
    @JoinColumn(name = "product_id")
	Product product;
	
	@ManyToOne
    @JoinColumn(name = "customer_id")
	Customer customer;
	
	int quantity;
	Date dateOfOrder;
	String deliveryStatus;
	
	public CustomerOrder()
    {
    	
    }
	
	
	public CustomerOrder(long orderNumber,int quantity, Date dateOfOrder,
			String deliveryStatus) {
		super();
		
		this.orderNumber = orderNumber;
		this.quantity = quantity;
		this.dateOfOrder = dateOfOrder;
		this.deliveryStatus = deliveryStatus;
	}
	
	

	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(long orderNumber) {
		this.orderNumber = orderNumber;
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getDateOfOrder() {
		return dateOfOrder;
	}

	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	

}
