package lab_assignment4;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		/*
		 * 6.Create an integer array of size n and read the elements from the user . 
		 * Add an exception handling block to print the value at nth position of the array
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		try {
			int size = scanner.nextInt();

			String[] arr = new String[size];

			System.out.println("Enter value in array");
			for (int i = 0; i < size; i++) {
				arr[i] = scanner.next();
			}

			System.out.println("Enter index value position to see what value is stored at that index");
			int num = scanner.nextInt();

			System.out.println("Value for index " + num + " is " + arr[num]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Given index is not present/invalid index position");
			System.out.println(e.getMessage());
		}
		scanner.close();
	}

}
