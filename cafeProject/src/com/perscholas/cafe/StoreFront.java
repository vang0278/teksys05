package com.perscholas.cafe;

import java.util.Scanner;

// give menus and take input actions
// cannot remove/update items in a cart
public class StoreFront extends Store {

	private double taxRate;
	private ShoppingCart cart;
	private boolean readyToCheckOut;
	private String[] productListing;

	public StoreFront(double taxRate, Product... products) {
		super(products);
		this.taxRate = taxRate;
		this.cart = new ShoppingCart(taxRate);
		this.readyToCheckOut = false;
		this.updateProdectListing();
	}

	public void updateProdectListing() {
		this.productListing = this.getProductListing();
	}

	public boolean isReadyToCheckOut() {
		return this.readyToCheckOut;
	}

	// can be optimized for subsequent calls
	public String listMenu() {
		String menuItems = "Please select from the following menu:\n";
		int i = 0;
		for (String item : this.productListing) {
			menuItems += String.format("%d: %s\n", ++i, item);
		}

		menuItems += String.format("%d: %s\n", ++i, "Check Out");
		menuItems += String.format("%d: %s\n", 88, "View Current Order");
		return menuItems;
	}

	// only retrieves the item (copy)
	// DO NOT add to cart
	// return item to have options updated
	public Product takeOrder(int itemNumber) throws ProductNotAvailableException {
		Product item = null;
		// checkout?
		if (itemNumber == (1 + this.productListing.length)) {
			this.readyToCheckOut = true;
			return item;
		}

		if (itemNumber <= 0 || this.productListing.length < itemNumber) {
			throw new ProductNotAvailableException("Product unavailable");
		}
		// find item in listing
		int index = itemNumber - 1;

		String itemKey = this.productListing[index];

		item = this.getProduct(itemKey);
		item.setQuantity(1);// set to 1 item

		return item;
	}

	public String listOptionsMenu(Product item) {
		String options = "";

		options += item.printOptions();
		options += "\n99: Order Item(s)";
		options += "\n0: Cancel Item(s)";

		return options;
	}

	// return the option/action taken
	public String takeOptionsOrder(Product item, int option) throws OptionNotAvailableException {
		if (option == 0) {
			return "<< Order Canceled >>";
		}

		if (option == 99) {
			return "<< Trying to Place Order >>";
		}
		String action = item.addOptions(option);

		if (action == null) {
			throw new OptionNotAvailableException("Option unavailable");
		}

		return "<< " + action + " >>";
	}

	public boolean placeOrder(Product item) {
		if (item == null || item.getQuantity() == 0) {
			return false;
		}

		return this.cart.add(item); // place item into cart

	}

	public String getCurrentOrder() {
		String summary = "\n[[[ Curent Orer ]]]\n";
		summary += "\n" + this.cart.listCart();
		summary += "\n" + this.cart.listTotals();

		return summary;
	}

	public String getCheckout() {
		String summary = "\nProceed to checkout.\n";
		summary += "\n" + this.cart.listCart();
		summary += "\n" + this.cart.listTotals();

		return summary;
	}

	public static void main(String[] args) {
		System.out.println("======================================");
		System.out.println("=== WELCOME TO THE STOREFRONT DEMO ===");
		System.out.println("======================================");
		Scanner input = new Scanner(System.in);
		Product coffee = new Coffee("coffee", 3.49, "Black coffee");
		Product espresso = new Espresso("espresso", 3.99, "espresso coffee");
		Product cappuccino = new Cappuccino("cappuccino", 4.99, "cappuccino coffee");

		StoreFront myCafe = new StoreFront(0.0755, coffee, cappuccino);
		myCafe.addProduct(espresso);
		myCafe.addProduct(espresso); // does nothing
		myCafe.addProduct(coffee); // does nothing
		myCafe.updateProdectListing(); // update listing for new/removed items

		while (!myCafe.isReadyToCheckOut()) {
			System.out.print(myCafe.listMenu());
			try { // select items
				int order = input.nextInt();
				input.nextLine();
				Product item = null;
				if (order == 88) {
					System.out.println(myCafe.getCurrentOrder());
				} else {
					item = myCafe.takeOrder(order);
				}

				if (item != null) {
//					System.out.println("NOT NULL ORDERED");
					int option = -1;

					do {
						try { // select options
							System.out.println(myCafe.listOptionsMenu(item));
							option = input.nextInt();
//							input.nextLine(); //if commented out allow multiple options
							System.out.println(myCafe.takeOptionsOrder(item, option));// print the action
						} catch (Exception e) {
							option = -1;
							input.nextLine();
							System.out.println("\n--- Select Another Option ---");
						}
					} while ((option != 0 && option != 99) || //
							(option == 99 && !myCafe.placeOrder(item)));

					if (option != -1) {
						input.nextLine();// clear the input to not effect items
					}

				}

			} catch (ProductNotAvailableException e) {
				System.out.print("\nSorry. ");
				System.out.print("Item/selection is not available at this time. ");
				System.out.println();
				System.out.print("** Please make another selection **");
				System.out.println();
			} catch (Exception e) {
				input.nextLine();
				System.out.println("\n** Please make another selection **");
			}
		}

		System.out.println(myCafe.getCheckout());
	}

}
