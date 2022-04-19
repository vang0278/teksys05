/* John Vang
 * Core Java - Exercise - Loops
 * */
package com.perscholas.java_basics;

public class CoreJavaLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* Write a program that uses a for-loop 
		 * to loop through the numbers 1-10 
		 * and prints out each number. */
		{
			for (int i = 1; i <= 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}		 

		/* Write a program that uses a while loop 
		 * to loop through the numbers 0-100 in increments of 10 
		 * and prints out each number. */
		{
			int i = 0;
			while (i <= 100) {
				System.out.print(i + " ");
				i += 10;
			}
			System.out.println();
		}
		

		/* Write a program that uses a do-while-loop 
		 * to loop through the numbers 1-10 
		 * and prints out each number. */
		{
			int i = 1;
			do {
				System.out.print(i + " ");
				i++;
			} while (i <= 10);
			System.out.println();
		}

		/* Write a program that uses a for-loop 
		 * to loop through the numbers 1-100. 
		 * Print out each number if is a multiple of 5, 
		 * but do not print out any numbers between 25 and 75. 
		 * Use the “continue” statement to accomplish this. */
		{
			for (int i = 1; i <= 100; i++) {
				if (25 < i && i < 75)
					continue;

				if (i % 5 == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}

		/* Write a program that uses a for-loop 
		 * to loop through the numbers 1-100. 
		 * Print out each number if is a multiple of 5, 
		 * but do not print out any numbers greater than 50. 
		 * Use the “break” keyword to accomplish this. */
		{
			for (int i = 1; i <= 100; i++) {
				if (i > 50)
					break;

				if (i % 5 == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
		
		/* Write a program that uses nested for-loops to output the following:
			Week 1:
			Day 1
			Day 2
			Day 3
			Day 4
			Day 5
			Week 2:
			Day 1
			Day 2
			Day 3
			Day 4
			Day 5
		* */
		{
			for (int w = 1; w <= 2; w++) {
				System.out.println("Week " + w + ":");
				for (int d = 1; d <= 5; d++) {
					System.out.println("Day " + d);
				}
			}
		}

		/* Write a program that returns all the available palindromes within 10 and 200. 
		 * The following output will be produced:
		 * 11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191, 
		 * */
		{
			for (int i = 10; i <= 200; i++) {
				String str = "" + i;
				boolean isPal = true;
				for (int s = 0, e = str.length() - 1; s < str.length(); s++, e--)
					if (str.charAt(s) != str.charAt(e))
						isPal = false;
				if (isPal)
					System.out.print(i + ", ");

			}
			System.out.println();
		}

		/* Write a program that prints the Fibonacci Sequence from 0 to 50. 
		 * The following output will be produced: 
		 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
		 * */
		{
			int n0 = 0;
			int n1 = 1;
			int tmp;

			while (n0 < 50) {
				System.out.print(n0 + ", ");
				tmp = n0;
				n0 = n1;
				n1 += tmp;
			}
			System.out.println();
		}

		/* Write a program that nests a for-loop inside another. 
		 * Print out the inner and outer variable (e.g., i or j) in the inner loop 
		 * (e.g., System.out.println("Inner loop: i: " + i + ", j: " + j);). 
		 * */
		{
			for (int i = 0; i < 2; i++)
				for (int j = 0; j < 3; j++)
					System.out.println("Inner loop: i: : " + i + ", j: " + j);
		}
		
	}//main

}
