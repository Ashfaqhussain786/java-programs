package com.tasks;

public class BankAccount {
	static int balance = 1000;

	static void withdraw(int b) {
		balance = balance - b;
		System.out.println(" After withdraw amount: " + balance);
	}

	static void deposit(int a) {
		balance = balance + a;
		System.out.println(" After deposited amount: " + balance);
	}

	
	public static void main(String[] args) {

		System.out.println(" Main Method Started: ");
		deposit(500);
		withdraw(300);

		
		System.out.println(" Main Method Ended: ");
	}
}
