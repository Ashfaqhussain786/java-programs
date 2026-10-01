package com.javalanaguagefundamentals.methods;

public class TestMethods1 {
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}

	public static boolean isOdd(int num) {
		return num % 2 != 0;
	}

	public static boolean checkAge(int num) {
		return num >= 18;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		boolean result = isEven(2);
		System.out.println("Answer: " + result);
		
		boolean result1 = isOdd(15);
		System.out.println("Answer: " + result1);
		
		boolean result2 = checkAge(18);
		System.out.println("Answer: " +result2);

		

		System.out.println("main method ended");
	}

}
