package com.tasks;

//WAP to check biggest of 2 numbers..
public class Tasks4 {
	static void findLargest(int a, int b) {
		if (a > b) {
			System.out.println(" a is greater than b: ");
		} else if (a < b) {
			System.out.println(" b is greater than a: ");
		}
	}

	public static void main(String[] args) {
		System.out.println(" Main Method Started: ");
		findLargest(4, 5);
		System.out.println(" Main Method Ended: ");
	}

}
