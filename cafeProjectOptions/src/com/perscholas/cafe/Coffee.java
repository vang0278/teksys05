package com.perscholas.cafe;

public class Coffee extends CafeProduct {

	private static String[] OPTION = { "Milk", "Sugar", "Ice" };
	private static String[] DESC = { "milk", "sugar", "ice" };

	public Coffee() {
		super();
		this.addOption(OPTION[0], new Option(DESC[0]));
		this.addOption(OPTION[1], new Option(DESC[1]));
		this.addOption(OPTION[2], new Option(DESC[2]));
	}

	public Coffee(Coffee c) {
		this(c.getName(), c.getPrice(), c.getDescription(), //
				c.checkOption(OPTION[0]), c.checkOption(OPTION[1]));
	}

	public Coffee(String name, double price, String description, boolean hasMilk, boolean hasSugar) {
		super(name, price, description);
		this.addOption(OPTION[0], new Option(DESC[0], hasMilk));
		this.addOption(OPTION[1], new Option(DESC[1], hasSugar));
		this.addOption(OPTION[2], new Option(DESC[2]));
}

	public Coffee(String name, double price, String description) {
		this(name, price, description, false, false);
	}

	@Override
	public Product copy() {
		return new Coffee(this);
	}

}
