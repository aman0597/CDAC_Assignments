
//Program to check Harshad number or not using Java
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();

		if (isHarshad(num)) {
			System.out.println(num + " is a Harshad number.");
		} else {
			System.out.println(num + " is not a Harshad number.");
		}
	}

	public static boolean isHarshad(int num) {
		int sum = 0;
		int temp = num;
		while (temp > 0) {
			sum += temp % 10;
			temp /= 10;
		}
		return num % sum == 0;
	}
}
