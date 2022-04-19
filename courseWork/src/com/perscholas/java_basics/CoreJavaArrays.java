/* John Vang
 * Core Java - Exercise - Arrays
 */
package com.perscholas.java_basics;

import java.util.Arrays;

public class CoreJavaArrays {

	public static void main(String[] args) {
		
		/* Write a program that creates an array of integers with a length of 3. 
		 * Assign the values 1, 2, and 3 to the indexes. 
		 * Print out each array element.
		 * */
		{
			int[] arr = new int[3];
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;

			for (int i = 0; i < 3; i++)
				System.out.println("<" + i + ">: " + arr[i]);
		}
		
		/* Write a program that returns the middle element in an array. 
		 * Give the following values to the integer array: 
		 * {13, 5, 7, 68, 2} 
		 * and produce the following output: 7
		 * */
		{
			int[] arr = { 13, 5, 7, 68, 2 };
			int m = arr.length;
			m = m%2 + m/2 - 1;
			
			System.out.println(arr[m]);
		}
		 

		/* Write a program that creates an array of String type 
		 * and initializes it with the strings 
		 * “red”, “green”, “blue” and “yellow”. 
		 * Print out the array length. 
		 * Make a copy using the clone( ) method. 
		 * Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
		 * */
		{
			String[] color = { "red", "green", "blue", "yellow" };
			System.out.println(color.length);
			String[] copy = color.clone();
			System.out.println(Arrays.toString(copy));
		}

		/* Write a program that creates an integer array with 5 elements (i.e., numbers). 
		 * The numbers can be any integers.  
		 * Print out the value at the first index 
		 * and the last index using length - 1 as the index. 
		 * Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).  
		 * Notice the type of exception which is produced. 
		 * Now try to assign a value to the array index 5. 
		 * You should get the same type of exception. 
		 * */
		{
			int[] numbers = { 9, 8, 7, 6, 5 };
			System.out.println(numbers[0]);
			System.out.println(numbers[numbers.length - 1]);
			try {
				System.out.println(numbers[numbers.length]);
			} catch (Exception e) {
				System.out.println("error--numbers[numbers.length-1]");
			}
			try {
				numbers[5] = 99;
			} catch (Exception e) {
				System.out.println("error--numbers[5]=99");
			}
		}

		/* Write a program where you create an integer array with a length of 5. 
		 * Loop through the array and assign the value of the loop control variable (e.g., i) 
		 * to the corresponding index in the array. 
		 * */
		{
			int[] arr = new int[5];
			for (int i = 0; i < arr.length; i++)
				arr[i] = i;
			System.out.println(Arrays.toString(arr));
		}
		 
		/* Write a program where you create an integer array of 5 numbers. 
		 * Loop through the array and assign the value of the loop control variable 
		 * multiplied by 2 to the corresponding index in the array. 
		 * */
		{
			int[] arr = new int[5];
			for (int i = 0; i < arr.length; i++)
				arr[i] = i * 2;
			System.out.println(Arrays.toString(arr));
		}
		 

		/* Write a program where you create an array of 5 elements. 
		 * Loop through the array and print the value of each element, 
		 * except for the middle (index 2) element. 
		 * */
		{
			int[] arr = { 9, 8, 7, 6, 5 };

			int m = arr.length;
			m = m % 2 + m / 2 - 1;

			for (int i = 0; i < arr.length; i++)
				if (i != m)
					System.out.println(arr[i]);
		}
		 

		/* Write a program that creates a String array of 5 elements 
		 * and swaps the first element with the middle element without creating a new array. 
		 * */
		{
			int[] arr = { 9, 8, 7, 6, 5 };

			int m = arr.length;
			m = m % 2 + m / 2 - 1;

			int tmp = arr[0];
			arr[0] = arr[m];
			arr[m] = tmp;

			System.out.println(Arrays.toString(arr));
		}

		/* Write a program to sort the following int array in ascending order: 
		 * {4, 2, 9, 13, 1, 0}. 
		 * Print the array in ascending order, 
		 * print the smallest and the largest element of the array. 
		 * The output will look like the following:
		 * 
		 * Array in ascending order: 0, 1, 2, 4, 9, 13
		 * The smallest number is 0
		 * The biggest number is 13
		 * */
		{
			int[] numbers = { 4, 2, 9, 13, 1, 0 };
			Arrays.sort(numbers);
			System.out.println("Array in ascending order: " + Arrays.toString(numbers));
			System.out.println("The smallest number is " + numbers[0]);
			System.out.println("The largest number is " + numbers[numbers.length - 1]);
		}

		/* Create an array that includes an integer, 3 strings, and 1 double. 
		 * Print the array.
		 * */
		{
			Object[] mixed = { 33, "one", "two", "three", 2.2 };

			System.out.println(Arrays.toString(mixed));
		}		
		
		
	}

}
