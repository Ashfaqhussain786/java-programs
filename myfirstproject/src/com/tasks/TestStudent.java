package com.tasks;

public class TestStudent {
	static int count = 0;

	TestStudent() {
		count++;
	}

	public static void main(String[] args) {
		
		TestStudent t1 = new TestStudent();
		TestStudent t2 = new TestStudent();
		TestStudent t3 = new TestStudent();
		
		System.out.println("No of objects created:" +count);



	}

}
