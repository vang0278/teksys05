package com.perscholas.cafe;

public class Cuppuccino extends Product {
	private boolean peppermint;
	private boolean whippedCream;

	public Cuppuccino() {
		super();
		this.peppermint = false;
		this.whippedCream = false;
	}

	public Cuppuccino(String name, double price, String description, boolean peppermint, boolean whippedCream) {
		super(name, price, description);
		this.peppermint = peppermint;
		this.whippedCream = whippedCream;
	}

	public boolean isPeppermint() {
		return peppermint;
	}

	public void setPeppermint(boolean peppermint) {
		this.peppermint = peppermint;
	}

	public boolean isWhippedCream() {
		return whippedCream;
	}

	public void setWhippedCream(boolean whippedCream) {
		this.whippedCream = whippedCream;
	}

	@Override
	public double calculateProductTotal() {
		double pricePerItem = this.getPrice();
		if (peppermint) {
			pricePerItem += 2;
		}
		if (whippedCream) {
			pricePerItem += 1;
		}
		double total = this.getQuantity() * pricePerItem;
		return total;

	}

}
