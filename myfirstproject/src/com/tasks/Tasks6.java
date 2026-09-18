package com.tasks;

//WAP to check age eligibility for voting..
public class Tasks6 {
	static void ageCheck(int a) {
		if (a > 18) {
			System.out.println(" Eligible for vote: ");
		} else {
			System.out.println(" Not Eligible for vote: ");
		}
	}

	public static void main(String[] args) {
		System.out.println(" Main Method Started: ");
		ageCheck(17);
		System.out.println(" Main Method Ended: ");

	}

}
