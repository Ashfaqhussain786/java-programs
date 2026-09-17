package com.javalanaguagefundamentals.methods;

public class Test1 {
	public static void modulus(int a,int b) {
		int result =a % b;
		System.out.println(" modulus method called: " +result);
	}
	public static void division(int a,int b) {
		int div = a / b;
		System.out.println(" Division method called: " +div);
	}
	
	public static void multiplication(int a,int b) {
		int product = a * b;
		System.out.println(" Multiplication method called: " +product);
	}
	
	public static void subtraction(int a ,int b) {
		int dif = a - b;
		System.out.println(" Subtarction method called: " +dif);
	}
	
	
	public static void addition(int a,int b) {
		int sum = a + b;
		System.out.println(" Addition method called: " +sum);
	}

	public static void main(String[] args) {
		System.out.println(" main method started: ");
		
		addition(10,20);
		subtraction(20,10);
		multiplication(30,50);
		division(40,10);
		modulus(100,10);
		
		System.out.println(" main method ended: ");

	}

}
