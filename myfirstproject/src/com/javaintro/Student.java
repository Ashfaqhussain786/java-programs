package com.javaintro;

public class Student {

	
	    //Static variable
	    static String CollegeName = " CMR ENGG COLLEGE";
	    
	
		//instance variable
	    int studentID;
		String studentNAME;
	    float studentMARKS;
	    int count = +1;
	    
		
	    public static void main(String[] args) {
	        System.out.println(" Main method Started: ");
		    System.out.println(" Welcome to College: ");
		    
		    //First Student 
		    System.out.println(" ************** Object01 **************** ");
		    
		    	Student ashfaq = new Student();
		    	
		    	ashfaq.studentID = 01;
		    	ashfaq.studentNAME = " Ashfaq Hussain ";
		    	ashfaq.studentMARKS = 100;
		    	
		    	System.out.println(" College Name: " +CollegeName);
		    	System.out.println(" StudentID: " +ashfaq.studentID);
		    	System.out.println(" StudentNAME: " +ashfaq.studentNAME);
		    	System.out.println(" StudentMARKS: " +ashfaq.studentMARKS);
		    	
		    	//Second Student
		    	System.out.println(" ************** Object02 **************** ");
			    
		    	Student arshiya = new Student();
		    	
		    	arshiya.studentID = 02;
		    	arshiya.studentNAME = " Arshiya Sultana ";
		    	arshiya.studentMARKS = 100;
		    	
		    	CollegeName = " NIZAMS INSTITUTE OF PHARMACY";
		    	
		    	System.out.println(" College Name: " +CollegeName);
		    	System.out.println(" StudentID: " +arshiya.studentID);
		    	System.out.println(" StudentNAME: " +arshiya.studentNAME);
		    	System.out.println(" StudentMARKS: " +arshiya.studentMARKS);
		    
		    	
		    	//Third Student
		    	System.out.println(" ************** Object03 **************** ");
			    
		    	Student arshaq = new Student();
		    	
		    	arshaq.studentID = 03;
		    	arshaq.studentNAME = " Arshaq Hussain ";
		    	arshaq.studentMARKS = 25;
		    	
		    	CollegeName = " XYZ ";
		    	
		    	System.out.println(" College Name: " +CollegeName);
		    	System.out.println(" StudentID: " +arshaq.studentID);
		    	System.out.println(" StudentNAME: " +arshaq.studentNAME);
		    	System.out.println(" StudentMARKS: " +arshaq.studentMARKS);
		    	
		    	
		    	
		    	System.out.println(" Main Method Ended: ");
		
		
	}

}
