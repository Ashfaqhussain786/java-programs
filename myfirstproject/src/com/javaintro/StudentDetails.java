package com.javaintro;

public class StudentDetails {
//static variable
static String collegename; 

//static block    
static void college() {
        System.out.println(" Name Of The College: " +collegename);
    }

//instance variable     
 String Name;
 int Age; 

//instance block 
void display() {
	college();
    System.out.println(" Name of the Student: " +Name);
    System.out.println(" Age of the Student: " +Age);

}

	public static void main(String[] args) {
		StudentDetails s1 = new StudentDetails();
		collegename = " CMR TECHNICAL CAMPUS ";
		s1.Name = " Ashfaq Hussain ";
		s1.Age = 23;
	    s1.display();
	}

}
