package com.javalanaguagefundamentals.constructors;

public class TestConstructors {

	int id;
	String name;
	double sal;

	TestConstructors() {
		System.out.println("No-args constructors called:");
	}

	TestConstructors(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	void testInfo() {
		System.out.println("id:" + id);
		System.out.println("name:" + name);
		System.out.println("Salary:" + sal);
	}

	public static void main(String[] args) {
		System.out.println("main method called");
		System.out.println("***********************************");

		TestConstructors t1 = new TestConstructors(101, "Ashfaq", 50000.00);
		t1.testInfo();
		System.out.println("***********************************");

		TestConstructors t2 = new TestConstructors(102, "Akshay", 60000.00);
		t2.testInfo();
		System.out.println("***********************************");

		System.out.println("main method ended");

	}

}
