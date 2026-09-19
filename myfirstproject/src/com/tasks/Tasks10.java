package com.tasks;

//WAP to check check marks and result of student..
public class Tasks10 {
	static int passMarks = 40;

	static void checkPassFail(int marks) {
		if (marks >= passMarks) {
			System.out.println(" PASS ");
		} else {
			System.out.println(" FAIL ");
		}

	}

	public static void main(String[] args) {
		System.out.println(" Main Method Started: ");
		checkPassFail(39);
		System.out.println(" Main Method Ended: ");

	}
}
