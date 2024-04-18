package lab_assignment4;

public class Question2 {

	public static void main(String[] args) {
	/* 2.Write a Java program to remove duplicate characters from a string 
	 * using StringBuffer.
	 */

		String str = "Hello World";
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			char test = str.charAt(i);
			if (buffer.indexOf(String.valueOf(test)) == -1) {
				buffer.append(test);
			}
		}
		System.out.println(buffer);
	}

}
