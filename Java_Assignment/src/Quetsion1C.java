//c. Method 3: Using Formula a[i]=a[i-1]+a[i-2] (Using Array)
public class Quetsion1C {
	public static void main(String[] args) {
		int n = 10; // Change n to the desired term
		int[] arr = new int[n];
		arr[0] = 0;
		arr[1] = 1;
		System.out.print("Fibonacci Series up to " + n + " terms:" + arr[0] + " " + arr[1] + " ");
		for (int i = 2; i < n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			System.out.print(arr[i] + " ");
		}
	}
}
