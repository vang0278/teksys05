package com.perscholas.cafe;

public abstract class Product {
	private String name;
	private double price;
	private String description;
	private int quantity;

	public Product() {
	};

	public Product(String name, double price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setQuantity(int quantity) {
		int amount = quantity;
		int max = 99;
		int min = 0;
		amount = (max < amount) ? max : amount;
		amount = (amount < min) ? min : amount;

		this.quantity = amount;
	}

	public abstract double calculateProductTotal();

	public abstract String addOptions(int optionNumber);// give available option changes

	public abstract String printOptions();// give summary of selected options

	// similar to clone (without using cloneable)
	// we need actual copies for a store
	public abstract Product copy();

}
