package com.tasks;

//WAP To Check number is odd number.
public class Tasks2 {
	static void odd(int b) {
		if (b % 2 != 0) {
			System.out.println(" It is odd number: ");
		} else {
			System.out.println(" It is not a odd number: ");
		}
	}

	public static void main(String[] args) {
		System.out.println(" Main method started: ");
		odd(3);
		System.out.println(" Main method ended: ");
	}

}
