package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Main {
	// Exceptions

	public static void main(String[] args) throws CustomExceptionFile {
		// Checked exception
//		FileNotFoundException
//		File myFile = new File("text.txt");
//		FileReader fr = new FileReader(myFile);

//		int [] num = {1,2,3,4};
//		System.out.println(num[7]); //out of bounds error --- runtime exception

//		try {
//			// try this
//		} catch (Exception e) {
//			// catch Exception
//		} finally {
//
//		}

//		try {
//			File myFile = new File("text.txt");
//			FileReader fr = new FileReader(myFile);
//		} catch (FileNotFoundException e) {
//			System.out.println(e);
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		try {
			File myFile = new File("text.txt");
			FileReader fr = new FileReader(myFile);

			int[] num = { 1, 2, 3, 4 };
			System.out.println(num[7]); // out of bounds error --- runtime exception
		} catch (FileNotFoundException e) {
			System.out.println(e);
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ea) {
			System.out.println(ea);
			// TODO: handle exception
			ea.printStackTrace();

		} finally {
			System.out.println("Still going to run");
			System.out.println("Everything is working");
		}
		
		int[][] matrix2d = new int[][] {
            {10,12,43,11,22},
{20,45,56,1,33},
{30,67,32,14,44},
{40,12,87,14,55},
{50,86,66,13,66},
{60,53,44,12,11}
           };
           matrix2d[1] = new int[] {1,2,3,4,5,6,7,8};
System.out.println(Arrays.toString(matrix2d));
	}

}
