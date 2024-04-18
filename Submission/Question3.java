package lab_assignment4;

public class Question3 {

/*3.Write a Java program to concatenate all elements of a string array efficiently 
 * using StringBuilder.
 */

	public static void main(String[] args) {
		String[] strArray = { "Hello", "World", "Java", "Programming" };
		String strr = "as";
		StringBuilder builder = new StringBuilder();

		System.out.println(strArray);

		for (String str : strArray) {
			builder.append(str);
		}
		builder.append(strr);
		System.out.println(builder);

	}

}
