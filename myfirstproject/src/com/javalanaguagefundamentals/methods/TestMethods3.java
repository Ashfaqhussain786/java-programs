package com.javalanaguagefundamentals.methods;

public class TestMethods3 {
	public static char gender(char a) {
		 return a;
	}

	public static void main(String[] args) {
        System.out.println("main method started: ");
        
        char result = gender('F');
        
        System.out.println("Gender: " +result);
        System.out.println("main method ended: ");
	}

}
