package com.perscholas.cafe;

public class Espresso extends Product {
	private boolean extraShot;
	private boolean macchiato;

	public Espresso() {
		this.extraShot = false;
		this.macchiato = false;
	}

	public Espresso(String name, double price, String description, boolean extraShot, boolean macchiato) {
		super(name, price, description);
		this.extraShot = extraShot;
		this.macchiato = macchiato;
	}

	public boolean isExtraShot() {
		return extraShot;
	}

	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}

	public boolean isMacchiato() {
		return macchiato;
	}

	public void setMacchiato(boolean macchiato) {
		this.macchiato = macchiato;
	}

	@Override
	public double calculateProductTotal() {
		// TODO Auto-generated method stub
		double pricePerItem = this.getPrice();
		if (extraShot) {
			pricePerItem += 2;
		}
		if (macchiato) {
			pricePerItem += 1;
		}
		double total = this.getQuantity() * pricePerItem;
		return total;
	}

}
