package cafeProjectcom.perscholas.cafe;

import java.util.Scanner;

public class CafeApp {

	public static void main(String[] args) {
		Product coffee = new Product("Coffee", 1.00, "Black coffee");
		Product espresso = new Product("espresso", 1.99, "espresso coffee");
		Product cuppuccino = new Product("cuppuccino", 2.99, "cuppuccino coffee");

		Scanner userInput = new Scanner(System.in);

		System.out.format("How much %s do you want to buy?\n", coffee.getName());
		coffee.setQuantity(userInput.nextInt());
		System.out.format("name: %s \n description: %s \n productSubTotal: %.2f\n", coffee.getName(),
				coffee.getDescription(), coffee.calculateProductTotal());

		System.out.format("How much %s do you want to buy?\n", espresso.getName());
		espresso.setQuantity(userInput.nextInt());
		System.out.format("name: %s \n description: %s \n productSubTotal: %.2f\n", espresso.getName(),
				espresso.getDescription(), espresso.calculateProductTotal());

		System.out.format("How much %s do you want to buy?\n", cuppuccino.getName());
		cuppuccino.setQuantity(userInput.nextInt());
		System.out.format("name: %s \n description: %s \n productSubTotal: %.2f\n", cuppuccino.getName(),
				cuppuccino.getDescription(), cuppuccino.calculateProductTotal());

		double subtotal = coffee.calculateProductTotal() + espresso.calculateProductTotal()
				+ cuppuccino.calculateProductTotal();
		double tax = subtotal * 0.10;
		double total = subtotal + tax;

		System.out.format("The subtotal is: %.2f , The tax is: %.2f, The total is:  %.2f\n", subtotal, tax, total);

	}

}
