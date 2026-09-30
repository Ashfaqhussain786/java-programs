package com.javalanaguagefundamentals.constructors;
//Program on copy constructors..
public class TestConstructors4 {

	int id;
	String name;

	TestConstructors4(int id, String name) {
		this.id = id;
		this.name = name;

	}

	TestConstructors4(TestConstructors4 t) {
		this.id = t.id;
		this.name = t.name;
	}

	void details() {
		System.out.println("***************");
		System.out.println("Id:" + id);
		System.out.println("Name:" + name);
		System.out.println("***************");

		

	}

	public static void main(String[] args) {
		System.out.println("main method started:");
		System.out.println("Original Constructor:");
		TestConstructors4 t1 = new TestConstructors4(101, "Ashfaq");
		t1.details();
		
		System.out.println("Copied Constructor:");
		TestConstructors4 t2 = new TestConstructors4(t1);
		t2.details();

		System.out.println("main method ended:");

	}

}
