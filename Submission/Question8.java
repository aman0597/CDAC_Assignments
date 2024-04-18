package lab_assignment4;

import java.util.Scanner;

class NoVowelsException extends Exception {
	public NoVowelsException(String msg) {
		super(msg);
	}
}

public class Question8 {
	/*
	 * 8.Write a JAVA program to create a method that takes a string as input and throws an 
	 * exception if the string does not contain vowels.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string value: ");
		String pass = sc.next();
		String vowels = "aeouiAEIOU";
		boolean check = false;

		for (int i = 0; i < pass.length(); i++) {
			if (vowels.contains(String.valueOf(pass.charAt(i)))) {
				check = true;
				break;
			}
		}

		try {
			if (check) {
				System.out.println("Given String has vowels.");
			} else {
				throw new NoVowelsException("Error: DOES NOT CONTAIN VOWELS");
			}
		} catch (NoVowelsException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
