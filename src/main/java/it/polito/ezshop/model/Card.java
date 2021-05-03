package it.polito.ezshop.model;

import java.io.Serializable;

public class Card implements Serializable {
	
	private String cardNumber;
	private Integer points;
	private it.polito.ezshop.model.Customer customer;

	

	public it.polito.ezshop.model.Customer getCustomer() {
		return customer;
	}
	


	public void setCustomer(it.polito.ezshop.model.Customer customer) {
		this.customer = customer;
	}

	public Card(Integer cardNumber) {
		super();
		this.cardNumber = cardNumber.toString();
		this.points = 0;
	}

	public Integer getPoints() {
		return points;
	}

	public void addPoints(Integer points) {
		
		this.points += points;
		customer.setPoints(this.points);
	}

	public String getCardNumber() {
		return cardNumber;
	}

}
