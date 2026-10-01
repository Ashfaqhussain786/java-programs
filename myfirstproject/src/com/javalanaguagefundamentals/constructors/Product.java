package com.javalanaguagefundamentals.constructors;

public class Product {
	int product_id;
	String product_name;
	double product_price;
	int product_quantity;

	Product(int product_id, String product_name, double product_price, int product_quantity) {
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_quantity = product_quantity;

	}

	Product(Product p) {
		this.product_id = p.product_id;
		this.product_name = p.product_name;
		this.product_price = p.product_price;
		this.product_quantity = p.product_quantity;

	}

	void calculateTotal() {
		System.out.println("*********************");
		System.out.println("Product ID:" + product_id);
		System.out.println("Product NAME:" + product_name);
		System.out.println("Product PRICE:" + product_price * product_quantity);
		System.out.println("Product QUANTITY:" + product_quantity);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Product p1 = new Product(101, "Iphone", 80000.00, 2);
		p1.calculateTotal();
		Product p2 = new Product(p1);
		p2.product_quantity = 03;
		p2.calculateTotal();

		System.out.println("main method ended");

	}

}
