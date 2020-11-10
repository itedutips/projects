package com.itedutips.dbservice.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity(name="products")
public class Products {
	
	@Id
	long productId;
	String productName;
	String productCategory;
	String prodctSubCategory;
	double purchase_price;
	double market_price;
	//@Transient
	Date purchase_date;	
	int stock_quantity;
	
	
	public Products(long productId, String productName, String productCategory, String prodctSubCategory,
			double purchase_price, double market_price, Date purchase_date, int stock_quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.prodctSubCategory = prodctSubCategory;
		this.purchase_price = purchase_price;
		this.market_price = market_price;
		this.purchase_date=purchase_date;
		this.stock_quantity = stock_quantity;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProdctSubCategory() {
		return prodctSubCategory;
	}
	public void setProdctSubCategory(String prodctSubCategory) {
		this.prodctSubCategory = prodctSubCategory;
	}
	public double getPurchase_price() {
		return purchase_price;
	}
	public void setPurchase_price(double purchase_price) {
		this.purchase_price = purchase_price;
	}
	public double getMarket_price() {
		return market_price;
	}
	public void setMarket_price(double market_price) {
		this.market_price = market_price;
	}
	public Date getPurchase_date() {
		return purchase_date;
	}
	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}
	public int getStock_quantity() {
		return stock_quantity;
	}
	public void setStock_quantity(int stock_quantity) {
		this.stock_quantity = stock_quantity;
	}
	

}
