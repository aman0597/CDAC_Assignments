package lab_assignment4;

import java.util.Scanner;

public class Question9 {
	/*
	 * 9.Write a program that creates a Calculator class. The class contains two
	 * variables of integer type. Design a constructor that accepts two values as
	 * parameter and set those values. Design four methods named
	 * Add(),Subtract(),multiply(),Division() for performing
	 * addition,subtraction,multiplication and division of two numbers. For addition
	 * and subtraction,two numbers should be positive.If any negative number is
	 * entered then throw an exception in respective methods. So design an
	 * exceptionhandler(ArithmeticException)in Add() and Subtract() methods
	 * respectively to check whether any number is negative or not. For division and
	 * multiplication two numbers should not be zero.If zero is entered for any
	 * number then throw an exception in respective methods. So design an
	 * exceptionhandler(ArithmeticException)inmultiply()andDivision()methods
	 * respectively to check whether any number is zero or not. Write a main class
	 * and declare four objects of Calculator class.Perform addition(objl),
	 * subtraction(obj2),multiply(obj3) and division(obj4) operations for these
	 * objects. If any non integer values are provided as input; then you should
	 * throw an exception(NumberFormatException)and display a message that informs
	 * the user of the wrong input before exiting
	 */
	int num1, num2;

	public Question9(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int add() {
		if (num1 < 0 || num2 < 0) {
			throw new ArithmeticException("Both number or any one number should not be negative");
		}
		return num1 + num2;
	}

	public int sub() {
		if (num1 < 0 || num2 < 0) {
			throw new ArithmeticException("Both number or any one numbershould not be negative");
		}
		return num1 - num2;
	}

	public int mul() {
		if (num1 == 0 || num2 == 0) {
			throw new ArithmeticException("Both number or any one number should not be zero");
		}
		return num1 * num2;
	}

	public double div() {
		if (num2 == 0) {
			throw new ArithmeticException("Dinominator should not be zero");
		}
		return (double) num1 / num2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String num1, num2;
		System.out.println("Enter two numbers");
		try {
			num1 = scanner.next();
			num2 = scanner.next();
			Question9 assign5 = new Question9(Integer.parseInt(num1), Integer.parseInt(num2));
			System.out.println("Addtion : " + assign5.add());
			System.out.println("Substraction : " + assign5.sub());
			System.out.println("Multiplication : " + assign5.mul());
			System.out.println("Division : " + assign5.div());

		} catch (NumberFormatException e) {
			System.out.println("Please provide value valid values");
		} catch (ArithmeticException e1) {
			System.out.println(e1.getMessage());
		}

	}

}
