package com.tasks;

import java.util.Scanner;

//WAP to calculate Simple Interest..
public class Tasks17 {
	Scanner sc = new Scanner(System.in);

	int principal;
	int rate;
	int time;
	int result;

	void principalinput() {
		System.out.println(" Enter The Principal Amount: ");
		principal = sc.nextInt();
		sc.nextLine();
	}

	void rateinput() {
		System.out.println(" Enter The Rate Of Amount: ");
		rate = sc.nextInt();
		sc.nextLine();
	}

	void timeinput() {
		System.out.println(" Enter The Duration Time: ");
		time = sc.nextInt();
		sc.nextLine();
	}

	void simpleInterest() {
		result = (principal * rate * time) / 100;
		System.out.println(" Simple Interest: " +result);
		sc.nextLine();
	}

	public static void main(String[] args) {

		System.out.println(" Main Method Started: ");
		Tasks17 t = new Tasks17();
		t.principalinput();
		t.rateinput();
		t.timeinput();
		t.simpleInterest();
		System.out.println(" Main Method Ended: ");
	}

}
