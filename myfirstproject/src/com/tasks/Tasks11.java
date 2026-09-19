package com.tasks;

//WAP to check number is divisible by 5 or not..
public class Tasks11 {
	static void checkDivisible(int a) {
		if (a % 5 == 0) {
			System.out.println(" Number is divisible by 5: ");
		} else {
			System.out.println(" Not Divisible by 5: ");
		}

	}

	public static void main(String[] args) {
		System.out.println(" Main Method Started: ");
		checkDivisible(36);
		System.out.println(" Main Method Ended: ");

	}

}
