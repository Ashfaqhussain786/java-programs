package com.javaintro;

public class Ashfaq {

	static int a;
    int b;
	static {
		System.out.println(" Static block called: ");
		System.out.println(" Welcome to JVM Architecture: ");
		//System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		
		Ashfaq b1 = new Ashfaq();
         System.out.println(" Welcome to Java World!!! ");
         System.out.println(a);
        // System.out.println(b1);
	}

}
