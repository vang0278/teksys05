package com.perscholas.cafe;

public class Option {
	private String name;
	private String desciption;
	private boolean hasOption;
	private double cost;

	public Option(String name, String description, boolean hasOption, double cost) {
		this.name = name;
		this.desciption = description;
		this.hasOption = hasOption;
		this.cost = cost;
	}

	public Option(String name, String description) {
		this(name, description, false, 0.0);
	}

	public Option(String name, boolean hasOption) {
		this(name, "", hasOption, 0.0);
	}

	public Option(String name, double cost, boolean hasOption) {
		this(name, "", hasOption, cost);
	}

	public Option(String name, double cost) {
		this(name, "", false, cost);
	}


	public Option(String name) {
		this(name, "", false, 0.0);
	}

	public Option(Option o) {
		this(o.name, o.desciption, o.hasOption, o.cost);
	}

	public Option copy() {
		return new Option(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public boolean changeOption() {
		hasOption = !hasOption;
		return hasOption;
	}

	public boolean getOption() {
		return hasOption;
	}

	public void setOption(boolean hasOption) {
		this.hasOption = hasOption;
	}

	public double calcCost() {
		return (hasOption) ? cost : 0.0;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Option [name=" + name + ", hasOption=" + hasOption + ", cost=" + cost + "]";
	}

}
