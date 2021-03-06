package com.perscholas.cafe;

import java.util.StringJoiner;

public class Coffee extends Product {

	private boolean hasMilk;
	private boolean hasSugar;

	public Coffee() {
		super();
		this.hasMilk = false;
		this.hasSugar = false;
	}

	public Coffee(Coffee c) {
		this(c.getName(), c.getPrice(), c.getDescription(), c.hasMilk, c.hasSugar);
	}

	public Coffee(String name, double price, String description, boolean hasMilk, boolean hasSugar) {
		super(name, price, description);
		this.hasMilk = hasMilk;
		this.hasSugar = hasSugar;
	}

	public Coffee(String name, double price, String description) {
		this(name, price, description, false, false);
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

	@Override
	public String addOptions(int optionNumber) {
		String action = "";

		String item1 = "Milk";
		boolean bool1 = hasMilk;
		String item2 = "Sugar";
		boolean bool2 = hasSugar;

		String action1 = "" + ((!bool1) ? "Added" : "Removed") + " " + item1;
		String action2 = "" + ((!bool2) ? "Added" : "Removed") + " " + item2;

		switch (optionNumber) {
		case 1:
			this.hasMilk = !this.hasMilk;
			action = action1;
			break;
		case 2:
			this.hasSugar = !this.hasSugar;
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
		options += "milk or sugar ";
		options += "with your ";
		options += this.getName();
		options += "?";

		String item1 = "Milk";
		boolean bool1 = hasMilk;
		String item2 = "Sugar";
		boolean bool2 = hasSugar;

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
		return new Coffee(this);
	}

	@Override
	public String toString() {
		String option1 = "Milk: " + ((!hasMilk) ? "No" : "Yes");
		String option2 = "Sugar: " + ((!hasSugar) ? "No" : "Yes");

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
