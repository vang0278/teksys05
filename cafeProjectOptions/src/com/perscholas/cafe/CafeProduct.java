package com.perscholas.cafe;

import java.util.LinkedHashMap;
import java.util.StringJoiner;

public abstract class CafeProduct extends Product {
	private LinkedHashMap<String, Option> options;
	private String[] items = {}; // contains the keys
	private String itemsListed = "";
	private static int INCREASE_VALUE = 111;
	private static int DECREASE_VALUE = 222;

	public CafeProduct() {
	}

	public CafeProduct(String name, double price, String description) {
		super(name, price, description);

		this.options = new LinkedHashMap<>();
	}

	// used in creation for other classes
	protected boolean addOption(String name, Option option) {
		if (name == null || name.compareTo("") == 0 || option == null) {
			return false;
		}
		this.options.put(name, option);
		// update items
		this.updateItemList();
		return true;
	}

	private void updateItemList() {
		this.items = this.options.keySet().toArray(new String[0]);
		String last = this.options.get(items[items.length - 1]).getName();
		String others = "";
		if (items.length >1) {
			others = this.options.get(items[items.length - 2]).getName() + " or ";
		}
		
		for(int i = items.length -3;i>=0;i--) {
			others = this.options.get(items[i]).getName() + ", " + others;
		}

		this.itemsListed = others + last;
	}

	public boolean checkOption(String optionName) {
		if (!this.options.containsKey(optionName))
			return false;
		return this.options.get(optionName).getOption();
	}

	public boolean changeOption(String optionName) {
		if (!this.options.containsKey(optionName))
			return false;
		return this.options.get(optionName).changeOption();
	}

	@Override
	public String toString() {
		String theProduct = "";
		theProduct = String.format("%-8s %-15s Price: %-8.2f Qty: %-3d Subtotal: %.2f\n", "Item:", //
				this.getName(), this.getPrice(), this.getQuantity(), this.calculateProductTotal());

		// the options
		String theOptions = "";

		String[] optionInfo = new String[this.items.length];
		String[] paddedInfo = new String[this.items.length];

		{// create scope for i
			int i = 0;
			for (String item : items) {
//			System.out.println(i + " toString " + item);
				Option o = this.options.get(item);
				String info = item + ": " + ((!o.getOption()) ? "No" : "Yes");
				if (o.calcCost() > 0.00) {
					info += String.format(" (Add $%.2f)", o.getCost());
				}
				optionInfo[i] = info;
				int pad = 8 * ((optionInfo[0].length() / 8) + 1);
				paddedInfo[i] = String.format("%-" + pad + "s", info);

				i++;
			}
		}

		{// create scope for i
			int i = 0;
			while (i < paddedInfo.length) {
				String fmt = "%8s ";

				for (int perLine = 2; perLine > 0 && i < paddedInfo.length; perLine--, i++) {
					fmt += paddedInfo[i];
				}

				theOptions += String.format(fmt + "\n", "");
			}
		}

		return theProduct + theOptions;
	}

	public double calculateProductTotal() {
		Double pricePerItem = this.getPrice();

		for (String item : items) {
			Option o = this.options.get(item);
			pricePerItem += o.calcCost();
		}

		double total = this.getQuantity() * pricePerItem;
		return total;
	}

	// handle the input/action
	public String addOptions(int optionNumber) {
		int index = optionNumber - 1;
		int firstOption = 1;
		int lastOption = this.options.size();

		if (optionNumber == INCREASE_VALUE) {
			this.setQuantity(this.getQuantity() + 1);
			return "Increased quanitity to " + this.getQuantity();
		}

		if (optionNumber == DECREASE_VALUE) {
			this.setQuantity(this.getQuantity() - 1);
			return "Decreased quanitity to " + this.getQuantity();
		}

		if (firstOption <= optionNumber && optionNumber <= lastOption) {
			String item = this.options.keySet().toArray(new String[0])[index];
			this.changeOption(item);
			return "" + ((this.checkOption(item)) ? "Added" : "Removed") + " " + item;
		}

		return null;
	}

	@Override
	public String printOptions() {
		String options = "";
		options += this.toString();
		options += "Would you like ";
		options += this.itemsListed;
		options += " with your ";
		options += this.getName();
		options += "?";

		StringJoiner menu = new StringJoiner("\n");
		menu.add(options);

		int i = 0;
		for (String item : items) {
//			System.out.println(i + " toString " + item);
			i++;
			Option o = this.options.get(item);
			String optionI = i + ": " + ((!o.getOption()) ? "Add" : "Remove") + " " + item;
			menu.add(optionI);
		}

		String optionIncrease = INCREASE_VALUE + ": Increase Quantity by 1";
		String optionDecrease = DECREASE_VALUE + ": Decrease Quantity by 1";

		menu.add(optionIncrease).add(optionDecrease);

		return menu.toString();
	}

	// keep this abstract
	public abstract Product copy();

}