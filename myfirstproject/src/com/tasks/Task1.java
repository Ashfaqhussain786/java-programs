package com.tasks;

public class Task1 {
	
	int amount = 100;//money with user
	int cost = 7;//cost of each pencil
	
	int quantity = 14;//quantity user  can buy
	
	int balance = amount - (cost*quantity);//left over money with him
	
	
	void quantity() {
		
		int total = amount /cost ;
		System.out.println(" NO OF PENCILS PURCHASED: " +total);
		System.out.println(" BALANCE AVAILABLE: " +balance);
	}

	public static void main(String[] args) {
		
		Task1 t1 = new Task1();
		t1.quantity();
		
		
		
	}

}
