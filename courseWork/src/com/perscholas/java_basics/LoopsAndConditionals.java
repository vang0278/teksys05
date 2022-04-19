package com.perscholas.java_basics;

import java.io.*;
import java.util.*;
import java.text.*;
import java.nio.charset.*;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.text.NumberFormat;
import java.util.Locale;

import java.util.Scanner;

public class LoopsAndConditionals {

	public static void main(String[] args) {
// && ||
		int num = 12;
		int otherNum = 7;

		if (otherNum < num) {
			System.out.println("yes otherNum");
		}

		if (num < otherNum) {
			System.out.println("yes num");
		}

		// boolean
		boolean isEven = (num % 2 == 0);

		if (isEven) {
			System.out.println("even");
		}

		// if statement
		if ((num % 2 == 0) && (num % 3 == 0))
			System.out.println("even from top");

		num = 10;
		// if statement
		if ((num % 2 == 0) && (num % 3 == 0)) {
			System.out.println("even");
		}

		// if & else statement
		int age = 12;

		age = 18;
		if (age < 18) {
			System.out.println("Can't buy this game");
		} else {
			System.out.println("You can buy this game");
		}

		age = 17;
		if (15 < age && age < 18) {
			System.out.println("in range");
		} else {
			System.out.println("not in range");
		}

		age = 21;
		// starting point
		if (15 < age && age < 18) {
			System.out.println("in range");
		} else if (18 < age && age < 25) {
			System.out.println("in range over 18");
		} else {
			System.out.println("not in range");
		}

		Scanner userInput = new Scanner(System.in);

		System.out.print("Hi, what is you name? ");
		String firstName = "default name";
//		firstName = userInput.nextLine();

		System.out.println(firstName);

		System.out.print("What is you age? ");

		int userAge = 14;
//		userAge = userInput.nextInt();

		if (17 < userAge) {
			System.out.println("You may pass");
		} else {
			System.out.println("None will pass");
		}

		if (17 < userAge) {
			System.out.println(firstName + ", may pass");
		} else {
			System.out.println("Sorry, " + firstName + ". You are not old enough");
		}

//		switch (age) {
//		case value1:
//			// code
//			break;
//		case value2:
//			// code
//			break;
//		default:
//			//default statement
//		}

		int day = 5;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("I'm on break");
		}

		{
			int tday = 1;
			int i = 0;
			switch (tday + 2) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
//				break;
			case 3:
				System.out.println("Wednesday");
//				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("I'm on break");
			}

		}

		// ternary operator
		{
			// (run expression) ? "yes" : "no" ;
			boolean bTest = (3 == 10) ? true : false;
			String sTest = (3 == 10) ? "yes" : "no";
		}

		// ***loops***
		// while loop
		// do while
		// for loop
		// break/continue
		{
			boolean flag = true;
			{// while

				int count = 0;

				while (count < 20 && !flag) {
					System.out.println(count + ") Welcome");
					count = count + 1;
				}
			}

			{// do while
				int count = 0;
				count = 20;
				do {
					System.out.println(count);
					count++;
				} while (count <= 15);
			}

			{// for loop
				// for (initialize action; condition; after iteration)
				// for (start variable; condition to be meet; add one to the iteration)
				for (int count = 0; count < 10; count++) {
					System.out.println(count);
				}

				for (int i = 0; i < 6; i++) {
					System.out.println(i);
				}

				for (int i = 0, j = 0, k = 3; i < k; i++) {
					System.out.println(i);
				}

				for (int i = 0, j = 0, k = 3; (i + j < 10); i++, j++) {
					System.out.println(i + j);
				}

				for (int i = 0; i < 10; i++) {
					System.out.println(i);
					for (int j = 1; j <= 2; j++) {
						System.out.println(j + "," + i);
					}
				}

				for (int i = 0; i < 10; i++) {
					System.out.println(i);
					for (int j = i; j <= 2 * i; j++) {
						System.out.println(j + "," + i);
					}
				}

				for (int i = 0; i < 10; i++) {
					System.out.print("\n" + i);
					for (int j = i; j <= 2 * i; j++) {
						System.out.print("*");
					}
				}

			}

		}

	}// main

}
