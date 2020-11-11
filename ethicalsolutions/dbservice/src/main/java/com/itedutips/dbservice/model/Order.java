package com.itedutips.dbservice.model;

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
@Table(name="order")
public class Order {
	
	@Id
	@Column(name = "order_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long orderId;
	
	long orderNumber;
	
	@ManyToOne
    @JoinColumn(name = "customer_id")
	long customerId;
	
	@ManyToOne
    @JoinColumn(name = "product_id")
	long productId;
	int quantity;
	Date dateOfOrder;
	String deliveryStatus;
	
	
	public Order(long orderNumber, long customerId, long productId, int quantity, Date dateOfOrder,
			String deliveryStatus) {
		super();
		
		this.orderNumber = orderNumber;
		this.customerId = customerId;
		this.productId = productId;
		this.quantity = quantity;
		this.dateOfOrder = dateOfOrder;
		this.deliveryStatus = deliveryStatus;
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

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
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
