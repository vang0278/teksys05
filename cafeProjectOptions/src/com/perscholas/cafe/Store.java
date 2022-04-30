package com.perscholas.cafe;

import java.util.LinkedHashMap;

// keep available products
// but no inventory (amount of each items)
public class Store {

	// storing products with their prices and descriptions
	private LinkedHashMap<String, Product> theProducts = new LinkedHashMap<>();

	public Store() {
	}

	public Store(Product... products) {
		for (Product p : products) {
			this.addProduct(p);
		}
	}

	public boolean hasProduct(Product p) {
		return (p == null) ? false : this.theProducts.containsKey(calcKey(p));
	}

	// overload for a quick workaround
	private boolean hasProduct(String key) {
		return (key == null) ? false : this.theProducts.containsKey(key);
	}

	public boolean addProduct(Product p) {
		if (p == null || this.hasProduct(p)) {
			return false;
		}

//		System.out.printf("ADDING <%s>\n", calcKey(p));

		return this.theProducts.put(calcKey(p), p) != null; // need to clone p
	}

	public boolean removeProduct(Product p) {
		return (!this.hasProduct(p)) ? false : this.theProducts.remove(calcKey(p)) != null;
	}

	public boolean updateProduct(Product p) {
		return this.removeProduct(p) && this.addProduct(p);
	}

	// will need a copy to work
	public Product getProduct(Product p) {
		return (!this.hasProduct(p)) ? null : this.theProducts.get(calcKey(p)).copy();
	}

	// will need a copy to work
	// overload for a quick work around
	public Product getProduct(String key) {
		return (!this.hasProduct(key)) ? null : this.theProducts.get(key).copy();
	}

	public String[] getProductListing() {
		return (this.theProducts == null) ? null : this.theProducts.keySet().toArray(new String[0]);
	}

	// creates id/key
	// this allows for easy updates for products+names if needed
	// i.e custom variations/options of one class (plain coffee)
	private static String calcKey(Product p) {
		return p.getClass().getSimpleName();
	}

}
