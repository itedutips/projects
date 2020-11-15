package com.ethicalsolutions.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
    @Column(name = "customer_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long customerId;
	
	String customerName;
	String address;
	String streetName;
    String landmark;
    String city;
    long pinCode;
    String country;
    int countryCode;
    String phoneNumber;
    String altPhoneNumber;
    
    public Customer()
    {
    	
    }
    
	public Customer(String customerName, String address, String streetName, String landmark,
			String city, long pinCode, String country, int countryCode, String phoneNumber, String  altPhoneNumber) {
		super();
		this.customerName = customerName;
		this.address = address;
		this.streetName = streetName;
		this.landmark = landmark;
		this.city = city;
		this.pinCode = pinCode;
		this.country = country;
		this.countryCode = countryCode;
		this.phoneNumber = phoneNumber;
		this.altPhoneNumber = altPhoneNumber;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAltPhoneNumber() {
		return altPhoneNumber;
	}

	public void setAltPhoneNumber(String altPhoneNumber) {
		this.altPhoneNumber = altPhoneNumber;
	}
	
	
    
    
    
}
