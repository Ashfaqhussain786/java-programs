package com.javalanaguagefundamentals.methods;

public class Methods {
	
	public static void division(int product,int e) {
		int result = product / e;
		System.out.println(" Division method called: " +result);
	}
	
	public static void multiplication(int diff,int d) {
		int product = diff * d;
		division(product,50);
		System.out.println(" mulplication method called: " +product);
		
	}
	
	public static void subtraction(int sum, int c) {
		int dif = sum - c;
		multiplication(dif,20);
		System.out.println(" subtraction method called:" +dif);
	}
	
    public static void addition(int a, int b) {
    	     int sum = a + b;
    	     subtraction(sum,10);
    	     System.out.println(" Addition method called: " +sum);
    	}
    
	public static void main(String[] args) {
       
		System.out.println(" main method started: ");
		addition(10,20);
		System.out.println(" main method ended: ");
		
	}

}
