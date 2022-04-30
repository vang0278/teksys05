package com.perscholas.cafe;

public class Espresso extends CafeProduct {

	private static String[] OPTION = { "Extra Shot", "Macchiato" };
	private static String[] DESC = { "an extra shot", "macchiato" };

	public Espresso() {
		this.addOption(OPTION[0], new Option(DESC[0], 2));
		this.addOption(OPTION[1], new Option(DESC[1], 1));
	}

	public Espresso(Espresso e) {
		this(e.getName(), e.getPrice(), e.getDescription(), //
				e.checkOption(OPTION[0]), e.checkOption(OPTION[1]));
	}

	public Espresso(String name, double price, String description, boolean hasExtraShot, boolean hasMacchiato) {
		super(name, price, description);
		this.addOption(OPTION[0], new Option(DESC[0], 2, hasExtraShot));
		this.addOption(OPTION[1], new Option(DESC[1], 1, hasMacchiato));
	}

	public Espresso(String name, double price, String description) {
		this(name, price, description, false, false);
	}

	@Override
	public Product copy() {
		return new Espresso(this);
	}

}
