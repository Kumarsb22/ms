package com.example.kafka.entity;

public class Order {
	private String id;
	private String price;
	private String email;

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(String id, String price, String email) {
		super();
		this.id = id;
		this.price = price;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", price=" + price + ", email=" + email + "]";
	}
}
