/*Java program for rotation of elements of array- left and right. An array is
said to be right rotated if all the selected elements were moved towards
right by one position.*/
public class Question7 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = arr.length;

		int k = 2;

		rightRotate(arr, k);

		System.out.println("Array after right rotation:");
		printArray(arr);

		leftRotate(arr, k);

		System.out.println("Array after left rotation:");
		printArray(arr);
	}

	public static void rightRotate(int[] arr, int k) {
		int n = arr.length;
		reverse(arr, 0, n - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, n - 1);
	}

	public static void leftRotate(int[] arr, int k) {
		int n = arr.length;
		reverse(arr, 0, k - 1);
		reverse(arr, k, n - 1);
		reverse(arr, 0, n - 1);
	}

	public static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
