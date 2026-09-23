package com.tasks;

public class Student {
	int id;
	String name;

	Student(int a,String b) {
		id = a;
		name = b;

	}

	public static void main(String[] args) {

		System.out.println("Main Method Started:");
		Student s1 = new Student(101,"Ashfaq");
		Student s2 = new Student(102,"Adil");
		
		System.out.println("student id:" + s1.id);
		System.out.println("student name:" + s1.name);
		System.out.println("student id:" + s2.id);
		System.out.println("student name:" + s2.name);
		System.out.println("Main Method Ended:");

	}

}
