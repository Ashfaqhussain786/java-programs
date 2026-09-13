package com.javaintro;

public class Objectcount {

	static int count = 0;
	{
		count = count +1;
	}
	
	public static void main(String[] args) {
		Objectcount o1 = new Objectcount();
		Objectcount o2 = new Objectcount();

		System.out.println(" Number of objects created: " +count);
	}

}
