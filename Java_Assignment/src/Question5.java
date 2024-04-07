
//Java Program for Sorting first half in Ascending order and second half in Descending order
import java.util.Arrays;

public class Question5 {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 8, 1, 2, 7, 4, 6 };
		int n = arr.length;

		Arrays.sort(arr, 0, n / 2);

		for (int i = n / 2; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Sorted Array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
