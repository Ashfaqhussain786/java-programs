package com.javaintro;

public class Test1 {

	
	void hello() {
		System.out.println("Hello");
	}
	
	void ashu() {
		System.out.println("Ashu");
	}
	public static void main(String[] args) {
		Test1 t1= new Test1();
		Test1 t2= new Test1(); 
		t1.hello();
		t2.ashu();
		System.out.println("Main Method started: ");
		System.out.println("Welcome");
		
	}

}
