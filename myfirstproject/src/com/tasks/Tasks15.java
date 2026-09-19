package com.tasks;

import java.util.Scanner;

public class Tasks15 {
	static Scanner sc = new Scanner(System.in);
	static double balance = 100000;

	void deposit() {
		double dp;
		System.out.println(" Enter The Amount to be Deposited:");
		dp = sc.nextDouble();
		balance = balance + dp;
		System.out.println(" Balance After Money Deposited: " + balance);

	}

	void withdraw() {
		 double wd;
		System.out.println(" Enter The Amount To Withdraw: ");
		wd = sc.nextDouble();
		balance = balance - wd;
	}

	void checkBalance() {
		System.out.println(" Balance After Money Withdraw: " + balance);
	}

	void main() {
		System.out.println(" Main Method Started: ");
		Tasks15 t = new Tasks15();
		t.deposit();
		t.withdraw();
		t.checkBalance();
		System.out.println(" Main Method Ended: ");

	}

}
