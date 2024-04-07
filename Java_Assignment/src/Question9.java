
/*
 * Create a student class with the following data members:- rollNo, Name,
Course, Mark, grade, result. Develop function members to
a. assign values for rollNo, name, course and mark.
b. Find out the grade for the student(if mark &gt;90, then grade is A, if
mark is between 80 and 90, then grade is B, if mark is between 70
and 80, then grade is C, if mark is between 60 and 70, then grade
is D, otherwise, grade is F.
c. Find the result of the student. If mark&gt;60, then the result is Pass,
otherwise Fail
d. Print out the details of the student
 */
import java.util.Scanner;

public class Question9 {

	private int rollNo;
	private String name;
	private String course;
	private int mark;
	private char grade;
	private String result;

	public Question9(int rollNo, String name, String course, int mark) {
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.mark = mark;
		this.grade = calculateGrade(mark);
		this.result = calculateResult(mark);
	}

	char calculateGrade(int mark) {
		if (mark > 90) {
			return 'A';
		} else if (mark >= 80 && mark <= 90) {
			return 'B';
		} else if (mark >= 70 && mark < 80) {
			return 'C';
		} else if (mark >= 60 && mark < 70) {
			return 'D';
		} else {
			return 'F';
		}
	}

	String calculateResult(int mark) {
		if (mark > 60)
			return "Pass";
		else
			return "Fail";
	}

	void printDetails() {
		System.out.println("Roll No: " + rollNo);
		System.out.println("Name: " + name);
		System.out.println("Course: " + course);
		System.out.println("Mark: " + mark);
		System.out.println("Grade: " + grade);
		System.out.println("Result: " + result);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Roll No: ");
		int rollNo = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		System.out.print("Enter Name: ");
		String name = scanner.nextLine();

		System.out.print("Enter Course: ");
		String course = scanner.nextLine();

		System.out.print("Enter Mark: ");
		int mark = scanner.nextInt();

		Question9 que9 = new Question9(rollNo, name, course, mark);
		que9.printDetails();
	}
}
