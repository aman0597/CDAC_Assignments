package lab_assignment4;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Question7 {

	public static void main(String[] args) {
/* 7.Write a program to split a string containing two words using StringTokenizer 
 * without using hasMoreTokens() method and call nextToken() method three times. 
 * Add an exception handling block if necessary.
 */

		String str = "Hello World";
		StringTokenizer tokenizer = new StringTokenizer(str);
		try {
			String first = tokenizer.nextToken();
			String second = tokenizer.nextToken();
			String third = tokenizer.nextToken();
			System.out.println("First word: " + first);
			System.out.println("Second word: " + second);
			System.out.println("Third token: " + third);
		} catch (NoSuchElementException e) {
			System.out.println("String does not contain enough tokens.");
		}

	}

}
