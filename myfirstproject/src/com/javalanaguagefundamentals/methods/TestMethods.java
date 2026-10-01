package com.javalanaguagefundamentals.methods;

public class TestMethods {
	
	public static  String greet(String name) {
		return "Hello " + name;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		String answer = greet("Ashfaq");
		System.out.println("greeting:" +answer);
		System.out.println("main method ended");
	}

}
