package com.javalanaguagefundamentals.methods;

public class TestMethods2 {
	public static float add(float a, float b) {
		return a + b;
	}

	public static float sub(float a, float b) {
		return a - b;
	}

	public static float product(float a, float b) {
		return a * b;
	}

	public static float division(float a, float b) {
		return a / b;
	}

	public static float modulus(float a, float b) {
		return a % b;
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		float result = add(10, 20);
		System.out.println("Sum:" + result);

		float result1 = sub(40, 20);
		System.out.println("Difference: " + result1);

		float result2 = product(20, 20);
		System.out.println("Product: " + result2);

		float result3 = division(50, 10);
		System.out.println("Divison: " + result3);

		float result4 = modulus(50, 10);
		System.out.println("Divison: " + result4);

		System.out.println("main method ended");

	}

}
