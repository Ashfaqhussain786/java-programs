package com.tasks;

import java.util.Scanner;

public class Tasks18 {
	static Scanner sc = new Scanner(System.in);
	
	String fn;
	String mn;
	String ln;
	String name;

	void first() {
		System.out.println(" Enter Your First Name: ");
		fn = sc.nextLine();
		System.out.println(" Your First Name: " + fn);
		sc.nextLine();
	}
	void middle() {
		System.out.println(" Enter Your Middle Name: ");
		mn = sc.nextLine();
		System.out.println(" Your Middle Name: " +mn);
		sc.nextLine();
	}
	
	void last() {
		System.out.println(" Enter Your Last Name: ");
		ln = sc.nextLine();
		System.out.println(" Your Last Name: " +ln);
		sc.nextLine();
	}

	void fullName() {
		 name = fn + mn + ln;
		 System.out.println(" Your Full Name: " +name);
	}
	public static void main(String[] args) {
		System.out.println(" Main Method Started: ");
		Tasks18 t = new Tasks18();
		t.first();
		t.middle();
		t.last();
		t.fullName();
		System.out.println(" Main Method Ended: ");
	}

}
