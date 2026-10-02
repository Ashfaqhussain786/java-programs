package com.javalanaguagefundamentals.constructors;

public class MobileRecharge {

	String customerName;
	String mobileNumber;
	double planPrice;
	double dataLimit;
	int validityDays;

	// Constructor
	MobileRecharge(String customerName, String mobileNumber, double planPrice, double dataLimit, int validityDays) {

		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.planPrice = planPrice;
		this.dataLimit = dataLimit;
		this.validityDays = validityDays;
	}

	// Calculate discount
	double calculateDiscount() {

		if (planPrice >= 500) {
			return planPrice * 0.15;
		} else if (planPrice >= 300) {
			return planPrice * 0.10;
		} else {
			return planPrice * 0.05;
		}
	}

	// Calculate final price
	double calculateFinalPrice() {

		return planPrice - calculateDiscount();
	}

	// Check plan type
	String checkPlanType() {

		if (dataLimit <= 2) {
			return "Basic Plan";
		} else if (dataLimit <= 5) {
			return "Standard Plan";
		} else {
			return "Premium Plan";
		}
	}

	// Check validity category
	String getValidityCategory() {

		if (validityDays >= 84) {
			return "Long Validity";
		} else if (validityDays >= 56) {
			return "Medium Validity";
		} else {
			return "Short Validity";
		}
	}

	// Display recharges details
	void displayRecharge() {

		System.out.println("Customer: " + customerName);
		System.out.println("Mobile: " + mobileNumber);
		System.out.println("Plan Price: " + planPrice);
		System.out.println("Data: " + dataLimit + " GB");
		System.out.println("Validity: " + validityDays + " days");

		System.out.println("Discount: " + calculateDiscount());
		System.out.println("Final Price: " + calculateFinalPrice());
		System.out.println("Plan Type: " + checkPlanType());
		System.out.println("Validity Category: " + getValidityCategory());

		System.out.println("----------------------------");
	}

	public static void main(String[] args) {
		System.out.println("main method started: ");
		System.out.println("----------------------------");
		MobileRecharge r1 = new MobileRecharge("Rahul", "9876543210", 500, 6, 84);
		MobileRecharge r2 = new MobileRecharge("Priya", "9123456780", 399, 3, 56);
		MobileRecharge r3 = new MobileRecharge("Arjun", "9988776655", 199, 1.5, 28);
		r1.displayRecharge();
		r2.displayRecharge();
		r3.displayRecharge();

		System.out.println("main method ended: ");

	}
}
