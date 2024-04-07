import java.util.Scanner;

class Account {
	protected int accountNumber;
	protected double balance;

	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Invalid amount.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Insufficient balance or invalid amount.");
		}
	}

	public void printAccountDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
	}
}

class SavingsAccount extends Account {
	private double interestRate;

	public SavingsAccount(int accountNumber, double interestRate) {
		super(accountNumber);
		this.interestRate = interestRate;
	}

	public void calculateInterest() {
		double interest = balance * (interestRate / 100);
		deposit(interest);
		System.out.println("Interest calculated and added: " + interest);
	}
}

class LoanAccount extends Account {
	private double loanAmount;
	private double interestRate;

	public LoanAccount(int accountNumber, double loanAmount, double interestRate) {
		super(accountNumber);
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
	}

	public void repayLoan(double amount) {
		if (amount > 0 && amount <= loanAmount) {
			loanAmount -= amount;
			System.out.println("Loan amount repaid: " + amount);
		} else {
			System.out.println("Invalid amount or loan already repaid.");
		}
	}

	public void printLoanDetails() {
		System.out.println("Loan Amount: " + loanAmount);
		System.out.println("Remaining Balance: " + loanAmount);
	}
}

class HousingLoan extends LoanAccount {
	private int tenure;

	public HousingLoan(int accountNumber, double loanAmount, double interestRate, int tenure) {
		super(accountNumber, loanAmount, interestRate);
		this.tenure = tenure;
	}

	public void printHousingLoanDetails() {
		printAccountDetails();
		printLoanDetails();
		System.out.println("Tenure: " + tenure + " years");
	}
}

public class Question10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter account number for savings account:");
		int savingsAccountNumber = scanner.nextInt();
		System.out.println("Enter interest rate for savings account:");
		double savingsInterestRate = scanner.nextDouble();
		SavingsAccount savingsAccount = new SavingsAccount(savingsAccountNumber, savingsInterestRate);

		System.out.println("Enter amount to deposit to savings account:");
		double depositAmount = scanner.nextDouble();
		savingsAccount.deposit(depositAmount);

		savingsAccount.calculateInterest();

		System.out.println("Savings Account Details:");
		savingsAccount.printAccountDetails();

		System.out.println("Enter account number for housing loan:");
		int housingLoanAccountNumber = scanner.nextInt();
		System.out.println("Enter loan amount for housing loan:");
		double housingLoanAmount = scanner.nextDouble();
		System.out.println("Enter interest rate for housing loan:");
		double housingLoanInterestRate = scanner.nextDouble();
		System.out.println("Enter tenure (in years) for housing loan:");
		int housingLoanTenure = scanner.nextInt();
		HousingLoan housingLoan = new HousingLoan(housingLoanAccountNumber, housingLoanAmount, housingLoanInterestRate,
				housingLoanTenure);

		System.out.println("Enter amount to repay for housing loan:");
		double repayAmount = scanner.nextDouble();
		housingLoan.repayLoan(repayAmount);

		System.out.println("Housing Loan Details:");
		housingLoan.printHousingLoanDetails();

	}
}
