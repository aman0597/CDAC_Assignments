package lab_assignment4;

import java.util.Scanner;

public class Question5 {
	/*
	 * 5.Write a program to calculate the square value of any number given by the
	 * user . Add an exception handling block to check whether the user enter
	 * letters instead of numbers
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String num;
		System.out.println("Enter the numbers");
		try {
			num = scanner.next();
			int num2 = Integer.parseInt(num);

			System.out.println("Square value of " + num + " is " + (num2 * num2));
		} catch (Exception e) {
			System.out.println("Can only accept integer numbers only");
			System.out.println(e.getMessage());
		}
		scanner.close();
	}

}
