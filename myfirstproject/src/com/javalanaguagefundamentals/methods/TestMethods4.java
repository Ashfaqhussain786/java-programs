package com.javalanaguagefundamentals.methods;

public class TestMethods4 {
	public static void add(int a, int b) {
		int sum = a + b;
		System.out.println("SUM: " + sum);
	}
	

	public static void main(String[] args) {
		System.out.println("main method started: ");
		add(20, 20);
		System.out.println("main method ended: ");

	}

}
