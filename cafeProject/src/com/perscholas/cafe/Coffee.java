package com.perscholas.cafe;

public class Coffee extends Product {

	private boolean hasMilk;
	private boolean hasSugar;

	public Coffee() {
		super();
		this.hasMilk = false;
		this.hasSugar = false;
	}

	public Coffee(String name, double price, String description, boolean hasMilk, boolean hasSugar) {
		super(name, price, description);
		this.hasMilk = hasMilk;
		this.hasSugar = hasSugar;
	}

	public boolean isHasMilk() {
		return hasMilk;
	}

	public void setHasMilk(boolean hasMilk) {
		this.hasMilk = hasMilk;
	}

	public boolean isHasSugar() {
		return hasSugar;
	}

	public void setHasSugar(boolean hasSugar) {
		this.hasSugar = hasSugar;
	}

	@Override
	public double calculateProductTotal() {
		// TODO Auto-generated method stub
		return this.getPrice() * this.getQuantity();
	}

}
