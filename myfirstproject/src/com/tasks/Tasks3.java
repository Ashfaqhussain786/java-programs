package com.tasks;

//WAP to check whether a number is positive or negative.
public class Tasks3 {
	static void positiveNegative(int a) {
		if (a > 0) {
			System.out.println(" Number is Positive: ");
		} else if (a < 0) {
			System.out.println(" Number is Negative: ");
		}
	}

	public static void main(String[] args) {
		System.out.println(" Main Method Started: ");
		positiveNegative(100);
		System.out.println(" Main Method Ended: ");
	}

}
