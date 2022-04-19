/* John Vang
 * Core Java - Exercise - Operators and Numbers

Write the following integers in binary notation. 
Do not use any Java functions or online conversion applications to calculate the answer 
as this will hinder the learning process and your understanding of the concept. 
However, you may check your answers using Java methods.
1 = 1
8 = 1000
33 = 100001
78 = 1001110
787 = 1100010011
33,987 = 1000010011000011
 

Convert the following binary numbers to decimal notation. 
Do not use any Java functions or online conversion applications to calculate the answer 
as this will hinder the learning process and your understanding of the concept. 
However, you may check your answers using Java methods.
0010 -- [2] = 2
1001 -- [9] = 9
0011 0100 -- [3][4] -- (48)+(4) = 52  
0111 0010 = [7][2] -- (112)+(2) = 114
0010 0001 1111 = [2][1][15] -- (512)+(16)+(15) = 543
0010 1100 0110 0111 = [2][12][6][7] -- (8192)+(3072)+(96)+(7) = 11367
 
 */

package com.perscholas.java_basics;

public class OperatorsAndNumbers {

	public static void main(String[] args) {

		/*
		 * Write a program that declares an integer a variable x and assigns the value 2
		 * to it and prints out the binary string version of the number (
		 * Integer.toBinaryString(x) ). Now, use the left shift operator (<<) to shift
		 * by 1 and assign the result to x. Before printing the results, write a comment
		 * with the predicted decimal value and binary string. Now, print out x in
		 * decimal form and in binary notation.
		 * 
		 * Do the preceding exercise with the following values: 9 17 88
		 */

		int[] vals;

		vals = new int[] { 2, 9, 17, 88 };
		for (int x : vals) {
			System.out.print(x + " = binary " + Integer.toBinaryString(x));

			x = x << 1;
			// 2, 9, 17, 88
			// This should double x
			// 4, 18, 34, 176

			System.out.println("  << 1   " + x + " = binary " + Integer.toBinaryString(x));
		}

		/*
		 * Write a program that declares a variable x and assigns 150 to it and prints
		 * out the binary string version of the number. Now use the right shift operator
		 * (>>) to shift by 2 and assign the result to x. Write a comment indicating
		 * what you anticipate the decimal and binary values to be. Now print the value
		 * of x and the binary string.
		 * 
		 * Do the preceding exercise with the following values: 225 1555 32456
		 */

		vals = new int[] { 150, 225, 1555, 32456 };
		for (int x : vals) {
			System.out.print(x + " = binary " + Integer.toBinaryString(x));

			x = x >> 2;
			// 150, 225, 1555, 32456
			// This be divided by 4 (no decimals)
			// 75, 112, 777, 16228
			// 37, 56, 388, 8114

			System.out.println("  >> 2   " + x + " = binary " + Integer.toBinaryString(x));
		}

		/*
		 * Write a program that declares 3 int variables x, y, and z. Assign 7 to x and
		 * 17 to y. Write a comment that indicates what you predict will be the result
		 * of the bitwise & operation on x and y. Now use the bitwise & operator to
		 * derive the decimal and binary values and assign the result to z.
		 * 
		 * Now, with the preceding values, use the bitwise | operator to calculate the
		 * “or” value between x and y. As before, write a comment that indicates what
		 * you predict the values to be before printing them out.
		 */

		{
			// new scope
			int x = 7; // 0 0111
			int y = 17; // 1 0001

			int z;
			z = x & y; // should be 0 0001 = 1
			System.out.println(Integer.toBinaryString(x) + " & " + Integer.toBinaryString(y) + " = "
					+ Integer.toBinaryString(z) + " = " + z);

			z = x | y; // should be 1 0111 = 23
			System.out.println(Integer.toBinaryString(x) + " | " + Integer.toBinaryString(y) + " = "
					+ Integer.toBinaryString(z) + " = " + z);

		}

		/*
		 * Write a program that declares an integer variable, assigns a number, and uses
		 * a postfix increment operator to increase the value. Print the value before
		 * and after the increment operator.
		 */
		{
			int i;
			i = 100;
			System.out.println("Before: " + i);
			i++;
			System.out.println("After postfix: " + i);
		}

		/*
		 * Write a program that demonstrates at least 3 ways to increment a variable by
		 * 1 and does this multiple times. Assign a value to an integer variable, print
		 * it, increment by 1, print it again, increment by 1, and then print again.
		 */
		{
			int i;
			i = 50;
			System.out.println("Before: " + i);
			i++;
			System.out.println("i++: " + i);
			i += 1;
			System.out.println("i+=1: " + i);
			++i;
			System.out.println("++i: " + i);
		}

		/*
		 * Write a program that declares 2 integer variables, x, and y, and then assigns
		 * 5 to x and 8 to y. Create another variable sum and assign the value of ++x
		 * added to y and print the result. Notice the value of the sum (should be 14).
		 * Now change the increment operator to postfix (x++) and re-run the program.
		 * Notice what the value of sum is. The first configuration incremented x and
		 * then calculated the sum while the second configuration calculated the sum and
		 * then incremented x.
		 */
		{
			int x=5, y=8;
			int sum;
			
			sum = ++x + y;
			System.out.println("++x" + " + " + y + " = " + sum);
		}
		{
			int x=5, y=8;
			int sum;
			
			sum = x++ + y;
			System.out.println("x++"  + " + " + y + " = " + sum);
		}

	}

}
