/* John Vang
 * Core Java - Exercises - Variables
 * 
 * Create a Java Project in Eclipse called CoreJavaBasics. 
 * In the src folder, make a package and name it com.perscholas.java_basics. 
 * Create a class with a main( ) method to run the following exercises 
 * (You may name the class whatever you like. Examples: JavaBasicsClass, HomeClass, IndexClass, PracticeClass, etc.).
 * 
 * */

package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {

		/* Write a program that declares 2 integer variables, 
		 * assigns an integer to each, and adds them together. 
		 * Assign the sum to a variable. 
		 * Print out the result. */
		int numInt1 = 3;
		int numInt2 = 11;
		int sumInt = numInt1 + numInt2;
		
		System.out.println("int: " + numInt1 + " + " + numInt2 + " = " + sumInt);
		
		/* Write a program that declares 2 double variables, 
		 * assigns a number to each, and adds them together. 
		 * Assign the sum to a variable. 
		 * Print out the result. */
		double numDouble1 = 123.4567;
		double numDouble2 = 234.5678;
		double sumDouble = numDouble1 + numDouble2;
		
		System.out.println("double: " + numDouble1 + " + " + numDouble2 + " = " + sumDouble);
		
		/* Write a program that declares an integer variable and a double variable, 
		 * assigns numbers to each, and adds them together. 
		 * Assign the sum to a variable. 
		 * Print out the result. 
		 * What variable type must the sum be? */
		int num1 = 4567;
		double num2 = 5678.90123;
		double sumNum = num1 + num2;
		// SUM must be double
		
		System.out.println("mixed: " + num1 + " + " + num2 + " = " + sumNum);
		
		
		/* Write a program that declares 2 integer variables, 
		 * assigns an integer to each, and divides the larger number by the smaller number. 
		 * Assign the result to a variable. 
		 * Print out the result. 
		 * Now change the larger number to a decimal. 
		 * What happens? What corrections are needed? */
		int numIntSmall = 3;
		int numIntBig = 11;
		int divInt = numIntBig / numIntSmall;
		
		System.out.println("int: " + numIntBig + " / " + numIntSmall + " = " + divInt);

//		int numSmall = 3;
		double numBig = 11;
		double divNum = numBig / numIntSmall;
		//the ANS variable must also be a double
		
		System.out.println("decimal: " + numBig + " / " + numIntSmall + " = " + divNum);


		/* Write a program that declares 2 double variables, 
		 * assigns a number to each, and divides the larger by the smaller. 
		 * Assign the result to a variable. 
		 * Print out the result. 
		 * Now, cast the result to an integer. 
		 * Print out the result again. */
		double numDoubleSmall = 3;
		double numDoubleBig = 11;
		double divDouble = numDoubleBig / numDoubleSmall;
		
		System.out.println("double: " + numDoubleBig + " / " + numDoubleSmall + " = " + divDouble);
		
		int divIntCast = (int) divDouble;
		System.out.println("int cast: " + numDoubleBig + " / " + numDoubleSmall + " = " + divIntCast);
		
		/* Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y. 
		 * Declare a variable q and assign y/x to it and print q. 
		 * Now, cast y to a double and assign to q. 
		 * Print q again. */
		int x = 5, y = 6;
		double q = y/x;
		
		System.out.println("non cast: " + y + " / " + x + " = " + q);

		q = ((double) y)/x;
		System.out.println("cast: " + y + " / " + x + " = " + q);
		
		/* Write a program that declares a named constant and uses it in a calculation. 
		 * Print the result. */
		final int NAMEDCONST = 4;
		System.out.println("const: " + NAMEDCONST);

		System.out.println("const: " + NAMEDCONST * NAMEDCONST);

		/* Write a program where you create 3 variables that represent products at a cafe. 
		 * The products could be beverages like coffee, cappuccino, espresso, green tea, etc. 
		 * Assign prices to each product. 
		 * Create 2 more variables called subtotal and totalSale 
		 * and complete an “order” for 3 items of the first product, 4 items of the second product, and 2 items of the third product. 
		 * Add them all together to calculate the subtotal. 
		 * Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. 
		 * Be sure to format the results to 2 decimal places. */
		double coffee, cappuccino, espresso;
		coffee = 1.25;
		cappuccino = 2.50;
		espresso = 2.75;
		
		double item1=coffee, item2=cappuccino, item3=espresso;
		
		double subtotal, totalSale;
		double order = 3 * item1 + 4 * item2 + 2 * item3;
		subtotal = order;
		final double SALES_TAX = 7/100.0;
		totalSale = subtotal * (1 + SALES_TAX);
		System.out.println("subtotal: " + subtotal);
		System.out.println("(" + SALES_TAX + ") SALES TAX: " + String.format("%.2f", subtotal*SALES_TAX) );
		System.out.println("totalSales: " + String.format("%.2f", totalSale));


	}

}
