package lab_assignment4;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		/* 1.Write a Java program that compares two wrapper objects for equality and 
		 * demonstrates when to use equals() instead of == (try with Integer or Float classes)
		 */
		Integer myInteger1, myInteger2;
		//Float myFloat1, myFloat2;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter 2 int values");
		myInteger1 = scanner.nextInt();
		myInteger2 = scanner.nextInt();

		if (myInteger1.equals(myInteger2)) {
			System.out.println("Number are equal.....");
		} else {
			System.out.println("Numbers are not equal....");
		}
		scanner.close();
	}

}
