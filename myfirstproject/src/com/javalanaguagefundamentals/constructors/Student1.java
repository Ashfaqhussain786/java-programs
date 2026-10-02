package com.javalanaguagefundamentals.constructors;

public class Student1 {
	String name;
	int rollNumber;
	int marks1;
	int marks2;
	int marks3;

	Student1(String name, int rollNumber, int marks1, int marks2, int marks3) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	int calculateTotalMarks() {
		int total = marks1 + marks2 + marks3;
		return total;
	}

	int calculateAverageMarks() {
		int average = calculateTotalMarks() / 3;
		return average;
	}

	char getGrade() {
		if (calculateTotalMarks() >= 90) {
			return 'A';
		} else if (calculateTotalMarks() >= 75) {
			return 'B';
		} else if (calculateTotalMarks() >= 60) {
			return 'C';
		} else if (calculateTotalMarks() >= 40) {
			return 'D';
		} else {
			return 'F';
		}
	}

	String getResult() {
		if (calculateTotalMarks() > 40) {
			return "PASS";
		} else {
			return "FAIL";
		}
	}

	void displayResult() {
		System.out.println("*******************************");
		System.out.println("Name: " + name);
		System.out.println("Roll number: " + rollNumber);
		System.out.println("Maths : " + marks1);
		System.out.println("Physics: " + marks2);
		System.out.println("Chemistry: " + marks3);
		System.out.println("*******************************");

		System.out.println("Total Marks: " + calculateTotalMarks());
		System.out.println("Average marks: " + calculateAverageMarks());
		System.out.println("Grade: " + getGrade());
		System.out.println("Result: " + getResult());
	}

	public static void main(String[] args) {
		System.out.println("main method started: ");
		Student1 s1 = new Student1("Ashfaq Hussain", 7694, 36, 36, 36);
		s1.calculateTotalMarks();
		s1.calculateAverageMarks();
		s1.getGrade();
		s1.getResult();
		s1.displayResult();
		
		Student1 s2 = new Student1("Arshiya Sultana", 7695, 36, 36, 36);
		s2.calculateTotalMarks();
		s2.calculateAverageMarks();
		s2.getGrade();
		s2.getResult();
		s2.displayResult();

		System.out.println("main method ended:");

	}

}
