package com.javalanaguagefundamentals.constructors;

public class TestConstructors3 {
	// default constructors..
	TestConstructors3() {
		System.out.println("Default constructors");
	}

	int id;
	String name;

	// parameterized constructors..
	TestConstructors3(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("ID:" + id);
		System.out.println("NAME:" + name);
	}

	public static void main(String[] args) {
		System.out.println("main method started:");

		TestConstructors3 t1 = new TestConstructors3(1011, "Ashfaq");

		System.out.println("main method ended:");

	}

}
