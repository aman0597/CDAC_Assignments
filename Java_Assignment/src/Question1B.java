//b. Method 2: Using Recursion
public class Question1B {
	public static void main(String[] args) {
		int n = 10; // Change n to the desired term
		System.out.print("Fibonacci Series up to " + n + " terms:");
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

	public static int fibonacci(int n) {
		if (n <= 1)
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
