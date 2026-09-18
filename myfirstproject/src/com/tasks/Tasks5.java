package com.tasks;
//WAP to check largest of 3 numbers..
public class Tasks5 {

	static void findLargest(int a, int b, int c) {

		if (a >= b && a >= c) {
			System.out.println(" Largest = " + a);
		} else if (b >= a && b >= c) {
			System.out.println(" Largest = " + b);
		} else {
			System.out.println(" Largest = " + c);
		}
	}

	public static void main(String[] args) {
        System.out.println(" Main Method Started: ");
		findLargest(10, 25, 15);
		System.out.println(" Main Method Ended: ");
	}
}
