package com.javalanaguagefundamentals.constructors;

public class BankAccount {

	long account_no;
	String account_holdername;
	double balance;
	String branch;

	BankAccount(long account_no, String account_holdername, double balance, String branch) {
		this.account_no = account_no;
		this.account_holdername = account_holdername;
		this.balance = balance;
		this.branch = branch;
	}

	BankAccount(BankAccount b) {
		this.account_no = b.account_no;
		this.account_holdername = b.account_holdername;
		this.balance = b.balance;
		this.branch = b.branch;
	}

	void displayAccountdetails() {
		System.out.println("***********************************");
		System.out.println("Account Number:" + account_no);
		System.out.println("Account HolderName:" + account_holdername);
		System.out.println("Account balance:" + balance);
		System.out.println("Account Branch:" + branch);
	}

	public static void main(String[] args) {
		System.out.println("main method started:");
		BankAccount b1 = new BankAccount(1002555465L, "Ashfaq Hussain", 500000.00, "Hyderabad");
		System.out.println("Original Account Details:");
		b1.displayAccountdetails();
		System.out.println("Copied Account Details:");
		BankAccount b2 = new BankAccount(b1);
		b2.balance = 6500000.00;
		b2.branch = "Kukatpally";
		b2.displayAccountdetails();
		System.out.println("***********************************");

		System.out.println("main method ended:");
	}

}
