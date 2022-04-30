package com.perscholas.cafe;

public class Cappuccino extends CafeProduct {

	private static String[] OPTION = { "Peppermint", "Whipped Cream" };
	private static String[] DESC = { "peppermint", "whipped cream" };

	public Cappuccino() {
		super();
		this.addOption(OPTION[0], new Option(DESC[0], 2));
		this.addOption(OPTION[1], new Option(DESC[1], 1));
	}

	public Cappuccino(Cappuccino c) {
		this(c.getName(), c.getPrice(), c.getDescription(), //
				c.checkOption(OPTION[0]), c.checkOption(OPTION[1]));
	}

	public Cappuccino(String name, double price, String description, boolean hasPeppermint, boolean hasWhippedCream) {
		super(name, price, description);
		this.addOption(OPTION[0], new Option(DESC[0], 2, hasPeppermint));
		this.addOption(OPTION[1], new Option(DESC[1], 1, hasWhippedCream));
	}

	public Cappuccino(String name, double price, String description) {
		this(name, price, description, false, false);
	}

//	options += String.format("peppermint (%.2f) or whipped cream (%.2f) ", 2.0, 1.0);

	@Override
	public Product copy() {
		return new Cappuccino(this);
	}

}
