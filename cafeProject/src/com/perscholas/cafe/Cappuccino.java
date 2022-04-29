package com.perscholas.cafe;

import java.util.StringJoiner;

public class Cappuccino extends Product {

	private boolean hasPeppermint;
	private boolean hasWhippedCream;

	public Cappuccino() {
		super();
		this.hasPeppermint = false;
		this.hasWhippedCream = false;
	}

	public Cappuccino(Cappuccino c) {
		this(c.getName(), c.getPrice(), c.getDescription(), c.hasPeppermint, c.hasWhippedCream);
	}

	public Cappuccino(String name, double price, String description, boolean hasPeppermint, boolean hasWhippedCream) {
		super(name, price, description);
		this.hasPeppermint = hasPeppermint;
		this.hasWhippedCream = hasWhippedCream;
	}

	public Cappuccino(String name, double price, String description) {
		this(name, price, description, false, false);
	}

	public boolean hasPeppermint() {
		return hasPeppermint;
	}

	public void addPeppermint() {
		this.hasPeppermint = true;
	}

	public void removePeppermint() {
		this.hasPeppermint = false;
	}

	public boolean hasWhippedCream() {
		return hasWhippedCream;
	}

	public void addWhippedCream() {
		this.hasWhippedCream = true;
	}

	public void removeWhippedCream() {
		this.hasWhippedCream = false;
	}

	@Override
	public double calculateProductTotal() {
		double pricePerItem = this.getPrice();
		if (hasPeppermint) {
			pricePerItem += 2;
		}
		if (hasWhippedCream) {
			pricePerItem += 1;
		}
		double total = this.getQuantity() * pricePerItem;
		return total;

	}

	@Override
	public String addOptions(int optionNumber) {
		String action = "";

		String item1 = "Peppermint";
		boolean bool1 = hasPeppermint;
		String item2 = "Whipped Cream";
		boolean bool2 = hasWhippedCream;

		String action1 = "" + ((!bool1) ? "Added" : "Removed") + " " + item1;
		String action2 = "" + ((!bool2) ? "Added" : "Removed") + " " + item2;

		switch (optionNumber) {
		case 1:
			this.hasPeppermint = !this.hasPeppermint;
			action = action1;
			break;
		case 2:
			this.hasWhippedCream = !this.hasWhippedCream;
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
		options += String.format("peppermint (%.2f) or whipped cream (%.2f) ", 2.0, 1.0);
		options += "with your ";
		options += this.getName();
		options += "?";

		String item1 = "Peppermint";
		boolean bool1 = hasPeppermint;
		String item2 = "Whipped Cream";
		boolean bool2 = hasWhippedCream;

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
		return new Cappuccino(this);
	}

	@Override
	public String toString() {
		String option1 = "Peppermint: " + ((!hasPeppermint) ? "No" : "Yes (Add $2)");
		String option2 = "Whipped Cream: " + ((!hasWhippedCream) ? "No" : "Yes (Add $1)");

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
