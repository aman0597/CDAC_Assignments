package lab_assignment4;

public class Question10 {
	/*
	 * 10.Write the Java program that reads an input string and converts it to an
	 * integer, handling the exceptions if the input contains non-digits or if the
	 * input is larger than what an integer can store:
	 */
	public static void main(String[] args) {

		String str1 = "100";

		try {
			int a = Integer.parseInt(str1);
			System.out.println("Integer value: " + a);
		} catch (NumberFormatException e) {
			System.out.println("Error: Input contains non-digits.");
			System.out.println(e.getMessage());
		} catch (ArithmeticException e1) {
			System.out.println("Error: Input is larger than what an integer can store.");
			System.out.println(e1.getMessage());
		}

	}

}
