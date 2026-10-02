package com.javalanaguagefundamentals.constructors;

public class Student {
	String student_NAME;
	int student_AGE;
	String student_COURSE;

	Student(String student_NAME, int student_AGE, String student_COURSE) {
		this.student_NAME = student_NAME;
		this.student_AGE = student_AGE;
		this.student_COURSE = student_COURSE;
	}

	void details() {
		System.out.println("*********************");
		System.out.println("Details of Students: ");
		System.out.println("Student Name:" + student_NAME);
		System.out.println("Student Age: " + student_AGE);
		System.out.println("Student Course: " + student_COURSE);
	}

	public static void main(String[] args) {
		System.out.println("main method started: ");

		Student s1 = new Student("Ashfaq Hussain", 16, "MPC");
		s1.details();
		Student s2 = new Student("Arshiya Sultana", 16, "BIPC");
		s2.details();

		System.out.println("main method ended: ");

	}

}
