package com.javalanaguagefundamentals.constructors;

public class FoodOrder {
	String customerName;
	String foodName;
	double price;
	int quantity;

	FoodOrder(String customerName, String foodName, double price, int quantity) {
		this.customerName = customerName;
		this.foodName = foodName;
		this.price = price;
		this.quantity = quantity;

	}

	double calculateTotal() {
		return price * quantity;
	}

	double calculateDiscount() {
		if (calculateTotal() >= 1000) {
			return calculateTotal() * 0.20;
		} else if (calculateTotal() >= 500) {
			return calculateTotal() * 0.10;
		} else {
			return 0;
		}
	}

	double calculateDeliveryCharge() {
		if (calculateTotal() < 300) {
			return 50;
		} else if (calculateTotal() >= 300) {
			return 0;
		}
		return 0;
	}

	double calculateFinalAmount() {
		double FinalAmount = calculateTotal() - calculateDiscount() + calculateDeliveryCharge();
		return FinalAmount;

	}

	String getOrderCategory() {
		if (quantity <= 2) {
			return "Small Order";
		} else if (quantity <= 5) {
			return "Medium Order";
		} else {
			return "Large Order";
		}
	}
	
	String getFoodType() {
		if(calculateFinalAmount() < 200) {
			return "Cheap";
		}else if(calculateFinalAmount() <= 500) {
			return "Regular";
		}else {
			return "Premium";
		}
	}

	void displayOrder() {
		System.out.println("*****************************");
		System.out.println("Name: " + customerName);
		System.out.println("FoodName: " + foodName);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("Type Of Order: " + getOrderCategory());
		System.out.println("Food Type: " +getFoodType());
		
		System.out.println("---------------------------------");
		System.out.println("Total: " + calculateTotal());
		System.out.println("Discount: " + calculateDiscount());
		System.out.println("Final Amount: " + calculateFinalAmount());

	}

	public static void main(String[] args) {
		System.out.println("main method Started: ");
		FoodOrder order1 = new FoodOrder("Ashfaq", "Chicken Wrap", 120, 6);
		order1.calculateTotal();
		order1.calculateDiscount();
		order1.calculateFinalAmount();
		order1.displayOrder();
		
		FoodOrder order2 = new FoodOrder("Arshiya", "Chicken Burger", 150, 7);
		order2.calculateTotal();
		order2.calculateDiscount();
		order2.calculateFinalAmount();
		order2.displayOrder();
		
		
		System.out.println("main method Ended: ");
	}

}
