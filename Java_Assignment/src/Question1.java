/*
 * Find the Fibonacci Series up to Nth Term in Java Language
a. Method 1: Using Iteration (Using Three variables)
 */
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10; // Change n to the desired term
		int a = 0, b = 1, c;
		System.out.print("Fibonacci Series up to " + n + " terms:");
		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
	}

}
