package com.javalanaguagefundamentals.constructors;

public class ATMAccount {
	String accountHolder;
	long accountNumber;
	double balance;
	int pin;

	ATMAccount(String accountHolder, long accountNumber, double balance, int pin) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.pin = pin;

	}

	// Deposit method..
	void deposit(double amount) {
		System.out.println("******************");
		if (amount > 0) {
			this.balance = balance + amount;
			System.out.println("Deposited amount: " + amount);
			System.out.println("Balance: " + balance);
		} else {
			System.out.println("Invalid amount");
		}

	}

	// Withdraw method..
	void withDraw(double amount) {
		System.out.println("******************");
		if (amount > this.balance) {
			System.out.println("InSufficient funds");
		} else if (amount <= 0) {
			System.out.println("Invalid Amount");

		} else {
			balance = balance - amount;
			System.out.println("Withdraw Amount: " + amount);
		}

	}

	// Check balance..
	void checkBalance() {
		System.out.println("balance: " + balance);
	}

	boolean verifyPin(int enteredPin) {
		if (enteredPin == pin) {
			return true;
		} else {
			return false;
		}
	}

	void withDrawWithPin(int enteredPin, double amount) {

		if (verifyPin(enteredPin)) {
			// PIN is correct
			// Now perform withdrawal

			withDraw(amount);

		} else {

			// PIN is wrong
			System.out.println("Incorrect PIN");
		}
	}

	void display() {
		System.out.println("**************");
		System.out.println("Name: " + accountHolder);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println("Pin: " + pin);
	}

	// main method..

	public static void main(String[] args) {
		System.out.println("main method started: ");
		ATMAccount a1 = new ATMAccount("Ashfaq", 1012545456l, 500000, 2858);
		a1.deposit(50000);
		a1.withDraw(50000);
		a1.withDrawWithPin(2858,50000);
		a1.checkBalance();
		a1.display();

		System.out.println("main method ended: ");

	}

}
