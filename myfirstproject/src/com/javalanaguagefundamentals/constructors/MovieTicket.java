package com.javalanaguagefundamentals.constructors;

public class MovieTicket {

	String customerName;
	String movieName;
	double ticketPrice;
	int numberOfTickets;

	// Constructor
	MovieTicket(String customerName, String movieName, double ticketPrice, int numberOfTickets) {

		this.customerName = customerName;
		this.movieName = movieName;
		this.ticketPrice = ticketPrice;
		this.numberOfTickets = numberOfTickets;
	}

	// Calculate total price
	double calculateTotal() {
		return ticketPrice * numberOfTickets;
	}

	// Calculate discount
	double calculateDiscount() {

		double total = calculateTotal();

		if (numberOfTickets >= 5) {
			return total * 0.20;
		} else if (numberOfTickets >= 3) {
			return total * 0.10;
		} else {
			return 0;
		}
	}

	// Calculate final amount
	double calculateFinalAmount() {

		return calculateTotal() - calculateDiscount();
	}

	// Display booking details
	void displayBooking() {

		System.out.println("Customer: " + customerName);
		System.out.println("Movie: " + movieName);
		System.out.println("Ticket Price: " + ticketPrice);
		System.out.println("Tickets: " + numberOfTickets);

		System.out.println("Total: " + calculateTotal());
		System.out.println("Discount: " + calculateDiscount());
		System.out.println("Final Amount: " + calculateFinalAmount());

		System.out.println("----------------------");
	}

	public static void main(String[] args) {

		MovieTicket ticket1 = new MovieTicket("Rahul", "Avengers", 200, 5);

		MovieTicket ticket2 = new MovieTicket("Priya", "Avatar", 300, 3);

		MovieTicket ticket3 = new MovieTicket("Arjun", "Batman", 250, 2);

		ticket1.displayBooking();
		ticket2.displayBooking();
		ticket3.displayBooking();
	}
}
