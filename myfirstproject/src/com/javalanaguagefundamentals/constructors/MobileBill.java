package com.javalanaguagefundamentals.constructors;

import java.util.Scanner;

public class MobileBill {
    String mobileModel;
    int quantity;
    double price;
    double deliveryCharge;
    double mobileCost;
    double finalBill;

    // Constructor 1
    MobileBill() {
        this("Unknown");
    }

    // Constructor 2
    MobileBill(String mobileModel) {
        this(mobileModel, 0);
    }

    // Constructor 3
    MobileBill(String mobileModel, int quantity) {
        this(mobileModel, quantity, 0.0);
    }

    // Constructor 4
    MobileBill(String mobileModel, int quantity, double price) {
        this(mobileModel, quantity, price, 0.0);
    }

    // Constructor 5 - Main constructor
    MobileBill(String mobileModel, int quantity, double price, double deliveryCharge) {
        this.mobileModel = mobileModel;
        this.quantity = quantity;
        this.price = price;
        this.deliveryCharge = deliveryCharge;

        mobileCost = price * quantity;
        finalBill = mobileCost + deliveryCharge;
    }

    void displayBill() {
        System.out.println("\n----- Mobile Bill -----");
        System.out.println("Mobile Model    : " + mobileModel);
        System.out.println("Price           : " + price);
        System.out.println("Quantity        : " + quantity);
        System.out.println("Mobile Cost     : " + mobileCost);
        System.out.println("Delivery Charge : " + deliveryCharge);
        System.out.println("Final Bill      : " + finalBill);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mobile Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Delivery Charge: ");
        double deliveryCharge = sc.nextDouble();

        // Constructor chaining starts here
        MobileBill bill = new MobileBill(model, quantity, price, deliveryCharge);

        bill.displayBill();

        sc.close();
    }
}
