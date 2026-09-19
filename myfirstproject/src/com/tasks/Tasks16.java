package com.tasks;

import java.util.Scanner;

public class Tasks16 {
	static String emp_Company = " COGNIZANT ";
	static Scanner sc = new Scanner(System.in);

	void emp1() {
		String name;
		byte id;
		long ph_no;
		char gender;
		System.out.println(" Enter The Name of The Employee: ");
		name = sc.nextLine();
		System.out.println(" Enter The Id of The Employee: ");
		id = sc.nextByte();
		System.out.println(" Enter the Phno of The Employee: ");
		ph_no = sc.nextLong();
		System.out.println(" Enter the Gender of The Employee: ");
		gender = sc.next().charAt(0);

		System.out.println(" ************************************** ");
		System.out.println(" Employee Name: " + name);
		System.out.println(" Employee ID: " + id);
		System.out.println(" Employee PH_NO: " + ph_no);
		System.out.println(" Employee GENDER: " + gender);
		System.out.println(" ************************************** ");
		sc.nextLine();

	}

	void emp2() {
		String name;
		byte id;
		long ph_no;
		char gender;
		System.out.println(" Enter The Name of The Employee: ");
		name = sc.nextLine();
		System.out.println(" Enter The Id of The Employee: ");
		id = sc.nextByte();
		System.out.println(" Enter the Phno of The Employee: ");
		ph_no = sc.nextLong();
		System.out.println(" Enter the Gender of The Employee: ");
		gender = sc.next().charAt(0);

		System.out.println(" ************************************** ");
		System.out.println(" Employee Name: " + name);
		System.out.println(" Employee ID: " + id);
		System.out.println(" Employee PH_NO: " + ph_no);
		System.out.println(" Employee GENDER: " + gender);
		System.out.println(" ************************************** ");
		sc.nextLine();

	}

	void emp3() {
		String name;
		byte id;
		long ph_no;
		char gender;
		System.out.println(" Enter The Name of The Employee: ");
		name = sc.nextLine();
		System.out.println(" Enter The Id of The Employee: ");
		id = sc.nextByte();
		System.out.println(" Enter the Phno of The Employee: ");
		ph_no = sc.nextLong();
		System.out.println(" Enter the Gender of The Employee: ");
		gender = sc.next().charAt(0);

		System.out.println(" ************************************** ");
		System.out.println(" Employee Name: " + name);
		System.out.println(" Employee ID: " + id);
		System.out.println(" Employee PH_NO: " + ph_no);
		System.out.println(" Employee GENDER: " + gender);
		System.out.println(" ************************************** ");
		sc.nextLine();

	}

	public static void main(String[] args) {

		System.out.println(" Main Method Started: ");
		Tasks16 t = new Tasks16();
		t.emp1();
		t.emp2();
		t.emp3();
		System.out.println(" Main Method Ended: ");

	}

}
