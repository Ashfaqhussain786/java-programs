package com.javaintro;

public class Car {
	
	String brand;
	double price;

	public static void main(String[] args) {
   
		Car c1 = new Car();
		c1.brand = " MAHINDRA ";
		c1.price = 250000;
		
		System.out.println(" MAIN METHOD STARTED: ");
		System.out.println(" CAR DETAILS: ");
		System.out.println(" BRAND: " +c1.brand);
		System.out.println(" PRICE: " +c1.price);
		
		System.out.println(" MAIN METHOD ENDED: ");
	
	}

}
