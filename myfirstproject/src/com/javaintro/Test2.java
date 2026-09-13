package com.javaintro;

public class Test2 {
	
	static int count =0;
	{
		count = count +1;
	}
	
	void ashu() {
		System.out.println(" Welcome To Java World Mr.Ashu: ");
	}
	void ashfaq() {

			System.out.println(" Welcome To java World Mr.Ashfaq: ");
		}
	

	public static void main(String[] args) {
		
		


		Test2 t2 = new Test2();
		Test2 t3 = new Test2();
		t2.ashu();
		t3.ashfaq();
		System.out.println(" Number Of Objects created: " +count);
		
	}

}
