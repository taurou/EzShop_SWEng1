package it.polito.ezshop.model;

import java.io.Serializable;

public class Customer implements it.polito.ezshop.data.Customer, Serializable {
	
	String customerName;
	String customerCard;
	Integer points, id;
	Card card;
	

	public Customer(String customerName, Integer id) {
	 this.customerName=customerName;
	 this.id = id;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerCard() {
		return customerCard;
	}


	public void setCustomerCard(String customerCard) {
		this.customerCard = customerCard;
	}


	public Integer getPoints() {
		return points;
	}


	public void setPoints(Integer points) {
		this.points = points;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

}
