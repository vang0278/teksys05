package com.perscholas.cafe;

import java.util.StringJoiner;

public class Espresso extends Product {
	private boolean hasExtraShot;
	private boolean hasMacchiato;

	public Espresso() {
		this.hasExtraShot = false;
		this.hasMacchiato = false;
	}

	public Espresso(Espresso e) {
		this(e.getName(), e.getPrice(), e.getDescription(), e.hasExtraShot, e.hasMacchiato);
	}

	public Espresso(String name, double price, String description, boolean hasExtraShot, boolean hasMacchiato) {
		super(name, price, description);
		this.hasExtraShot = hasExtraShot;
		this.hasMacchiato = hasMacchiato;
	}

	public Espresso(String name, double price, String description) {
		this(name, price, description, false, false);
	}

	public boolean getExtraShot() {
		return hasExtraShot;
	}

	public void addExtraShot() {
		this.hasExtraShot = true;
	}

	public void removeExtraShot() {
		this.hasExtraShot = false;
	}

	public boolean hasMacchiato() {
		return hasMacchiato;
	}

	public void addMacchiato() {
		this.hasMacchiato = true;
	}

	public void removeMacchiato() {
		this.hasMacchiato = false;
	}

	@Override
	public double calculateProductTotal() {
		// TODO Auto-generated method stub
		double pricePerItem = this.getPrice();
		if (hasExtraShot) {
			pricePerItem += 2;
		}
		if (hasMacchiato) {
			pricePerItem += 1;
		}
		double total = this.getQuantity() * pricePerItem;
		return total;
	}

	@Override
	public String addOptions(int optionNumber) {
		String action = "";

		String item1 = "Extra Shot";
		boolean bool1 = hasExtraShot;
		String item2 = "Macchiato";
		boolean bool2 = hasMacchiato;

		String action1 = "" + ((!bool1) ? "Added" : "Removed") + " " + item1;
		String action2 = "" + ((!bool2) ? "Added" : "Removed") + " " + item2;

		switch (optionNumber) {
		case 1:
			this.hasExtraShot = !this.hasExtraShot;
			action = action1;
			break;
		case 2:
			this.hasMacchiato = !this.hasMacchiato;
			action = action2;
			break;
		case 3:
			this.setQuantity(this.getQuantity() + 1);
			action = "Increased quanitity to " + this.getQuantity();
			break;
		case 4:
			this.setQuantity(this.getQuantity() - 1);
			action = "Decreased quanitity to " + this.getQuantity();
			break;
		default:
			return null;
		}

		return action;

	}

	@Override
	public String printOptions() {
		String options = "";
		options += this.toString();
		options += "Would you like ";
		options += String.format("an extra shot (%.2f) or macchiato (%.2f) ", 2.0, 1.0);
		options += "with your ";
		options += this.getName();
		options += "?";

		String item1 = "Extra Shot";
		boolean bool1 = hasExtraShot;
		String item2 = "Macchiato";
		boolean bool2 = hasMacchiato;

		String option1 = "1: " + ((!bool1) ? "Add" : "Remove") + " " + item1;
		String option2 = "2: " + ((!bool2) ? "Add" : "Remove") + " " + item2;
		String option3 = "3: Increase Quantity by 1";
		String option4 = "4: Decrease Quantity by 1";

		StringJoiner menu = new StringJoiner("\n");
		menu.add(options);
		menu.add(option1).add(option2);
		menu.add(option3).add(option4);

		return menu.toString();
	}

	@Override
	public Product copy() {
		return new Espresso(this);
	}

	@Override
	public String toString() {
		String option1 = "Extra Shot: " + ((!hasExtraShot) ? "No" : "Yes (Add $2)");
		String option2 = "Macchiato: " + ((!hasMacchiato) ? "No" : "Yes (Add $1)");

		int pad1 = (option1.length() / 8) + 1;
		pad1 *= 8;
		int pad2 = (option2.length() / 8) + 1;
		pad2 *= 8;

		String fmt = "%8s %-" + pad1 + "s" + "%-" + pad2 + "s\n";

		String line1 = String.format("%-8s %-15s Price: %-8.2f Qty: %-3d Subtotal: %.2f\n", "Item:", //
				this.getName(), this.getPrice(), this.getQuantity(), this.calculateProductTotal());

		String line2 = String.format(fmt, "", option1, option2);

		return line1 + line2;
	}

}
