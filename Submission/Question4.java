package lab_assignment4;

public class Question4 {
	/*
	 * 4.Write a Java method to check if an input string is a palindrome (Use String
	 * functions).
	 */

	public static void main(String[] args) {
		String str1 = "radar";
		String str2 = new StringBuilder(str1).reverse().toString();
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println(str1 + " : is an palindrome");
		} else {
			System.out.println(str1 + " : is not an palindrome");
		}

	}

}
