/* John Vang
 * Core Java - Exercise - Control Flow
 * */

package com.perscholas.java_basics;

import java.util.Scanner;

public class CoreJavaControlFlow {

	public static void main(String[] args) {
		
		/* Write a program that declares 1 integer variable x, 
		 * and then assigns 7 to it. 
		 * Write an if statement to 
		 * print out “Less than 10” if x is less than 10. 
		 * Change x to equal 15 and notice the result (console should not display anything).
		 * */
		{
			int x;
			x = 7;
			if (x < 10)
				System.out.println(x + ": Less than 10");

			x = 15;
			if (x < 10)
				System.out.println(x + ": Less than 10");
		}
		
		/* Write a program that declares 1 integer variable x, 
		 * and then assigns 7 to it. 
		 * Write an if-else statement that 
		 * prints out “Less than 10” if x is less than 10 
		 * and “Greater than 10” if x is greater than 10. 
		 * Change x to 15 and notice the result.
		 * */
		{
			int x;
			x = 7;
			if (x < 10)
				System.out.println(x + ":: Less than 10");
			else if (x > 10)
				System.out.println(x + ":: Greater than 10");

			x = 15;
			if (x < 10)
				System.out.println(x + ":: Less than 10");
			else if (x > 10)
				System.out.println(x + ":: Greater than 10");
		}
		
		/* Write a program that declares 1 integer variable x, 
		 * and then assigns 15 to it. 
		 * Write an “if-else-if” statement that 
		 * prints out “Less than 10” if x is less than 10, 
		 * “Between 10 and 20” if x is greater than 10 but less than 20, 
		 * and “Greater than or equal to 20” if x is greater than or equal to 20. 
		 * Change x to 50 and notice the result.
		 * */
		{
			int x;
			x = 15;
			if (x < 10)
				System.out.println(x + "::: Less than 10");
			else if (x > 10 && x < 20)
				System.out.println(x + "::: Between 10 and 20");
			else if (x >= 20)
				System.out.println(x + "::: Greater than or equal to 20");

			x = 50;
			if (x < 10)
				System.out.println(x + "::: Less than 10");
			else if (x > 10 && x < 20)
				System.out.println(x + "::: Between 10 and 20");
			else if (x >= 20)
				System.out.println(x + "::: Greater than or equal to 20");
		}
		
		/* Write a program that declares 1 integer variable x, 
		 * and then assigns 15 to it. 
		 * Write an if-else statement that 
		 * prints “Out of range” if the number is less than 10 or greater than 20 
		 * and prints “In range” if between 10 and 20 (including equal to 10 or 20). 
		 * Change x to 5 and notice the result.
		 * */
		{
			int x;
			x = 15;
			if (x < 10 || x > 20)
				System.out.println(x + ":::: Out of range");
			else if (10 <= x && x <= 20)
				System.out.println(x + ":::: In range");

			x = 5;
			if (x < 10 || x > 20)
				System.out.println(x + ":::: Out of range");
			else if (10 <= x && x <= 20)
				System.out.println(x + ":::: In range");
		}

		
		/* Write a program that uses if-else-if statements to print out grades A, B, C, D, F according to the following criteria:
		 * A: 90-100
		 * B: 80-89
		 * C: 70-79
		 * D: 60-69
		 * F: <60
		 * */
		{
			int[] grades = { 65, 60, 59, 45, 86, 80, 78, 70, 98, 90, 100, 101 };

			for (int grade : grades) {
				if (grade < 60)
					System.out.println(grade + ": F");
				else if (grade < 70)
					System.out.println(grade + ": D");
				else if (grade < 80)
					System.out.println(grade + ": C");
				else if (grade < 90)
					System.out.println(grade + ": B");
				else if (grade <= 100)
					System.out.println(grade + ": A");
			}
		}

		/* Use the Scanner class to accept a number score from the user to determine the letter grade. 
		 * Print out “Score out of range.” if the score is less than 0 or greater than 100.
		 * */
		
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter score: "); 
			int grade = 78;
//			grade = input.nextInt();

			if (grade < 60)
				System.out.println(grade + ": F");
			else if (grade < 70)
				System.out.println(grade + ": D");
			else if (grade < 80)
				System.out.println(grade + ": C");
			else if (grade < 90)
				System.out.println(grade + ": B");
			else if (grade <= 100)
				System.out.println(grade + ": A");
		}
		
		/* Write a program that accepts an integer between 1 and 7 from the user. 
		 * Use a switch statement to print out the corresponding weekday. 
		 * Print “Out of range” if the number is less than 1 or greater than 7. 
		 * Don’t forget to include “break” statements in each of your cases.
		 * */
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter number for weekday: ");
//			int week = 4;
//			week = input.nextInt();
			int[] days = { 0, 5, 7, 6, 1, 2, 3, 8, -1, 4 };

			for (int week : days) {

				switch (week) {
				case 1:
					System.out.println("Sunday");
					break;
				case 2:
					System.out.println("Monday");
					break;
				case 3:
					System.out.println("Tuesday");
					break;
				case 4:
					System.out.println("Wednesday");
					break;
				case 5:
					System.out.println("Thursday");
					break;
				case 6:
					System.out.println("Friday");
					break;
				case 7:
					System.out.println("Saturday");
					break;
				default:
					System.out.println("Out of range");
				}
			}
		}

		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter number for weekday: ");
			int week = 4;
			week = input.nextInt();

			switch (week) {
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Out of range");
			}
		}
		
	}//main

}
