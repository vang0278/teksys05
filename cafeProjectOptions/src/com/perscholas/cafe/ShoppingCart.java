package com.perscholas.cafe;

import java.util.ArrayList;

// hold items and calculate totals
public class ShoppingCart {
	// only able to
	// add items (cannot remove/update)
	// list the items
	// get totals

	private ArrayList<Product> cart;
	private double taxRate;

	public ShoppingCart(double taxRate) {
		this.cart = new ArrayList<>();
		this.taxRate = taxRate;
	}

	public boolean add(Product item) {
		return (item == null) ? false : this.cart.add(item);
	}

	public String listCart() {
		String items = "";
		for(Product item:this.cart) {
			items += item.toString()+"\n";
		}

		return items;
	}

	public String listTotals() {

		double subtotal = 0;

		for (Product item : this.cart) {
			subtotal += item.calculateProductTotal();
		}

		double tax = subtotal * this.taxRate;
		double total = subtotal + tax;

		String strSubtotal = "Purchase Subtotal:";
		String strTax = String.format("Sales Tax (%.2f%%):", this.taxRate*100);
		String strTotal = "Purchase Total:";

		int padTxt = strSubtotal.length();
		int padNum = String.format("%.2f", total).length();// total is biggest num

		String fmtTxt = "%-" + padTxt + "s";
		String fmtNum = "%" + padNum + ".2f";
		String fmt = String.format("%s %s\n", fmtTxt, fmtNum);
		String results = "";
		results += String.format(fmt, strSubtotal, subtotal);
		results += String.format(fmt, strTax, tax);
		results += String.format(fmt, strTotal, total);

		return results;
	}
}
