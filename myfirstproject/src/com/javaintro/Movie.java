package com.javaintro;

public class Movie {

	//static variable
	static String TheatreNAME;
	static String TheatreLOC;
	
	//instance variable
	String MovieNAME;
	int Moviebudget;
	
	
	public static void main(String[] args) {
		   
		System.out.println(" Main Method Started: ");
		System.out.println("********* OBJECT01 *********");  
		Movie salman =new Movie();
          
          
          TheatreNAME = " ASIAN SHA CINEMA ";
          TheatreLOC = " CHINTAL ";
          salman.MovieNAME = " SULTAN ";
          salman.Moviebudget = 500;
          
        System.out.println(" TheatreNAME: " +TheatreNAME);  
        System.out.println(" TheatreLOC: " +TheatreLOC);
        System.out.println(" MovieNAME: " +salman.MovieNAME);
        System.out.println(" Moviebudget: " +salman.Moviebudget);
        
        System.out.println("***********************");
        
        
        System.out.println("********* OBJECT02 *********");  
		Movie sharukh =new Movie();
          
          
          TheatreNAME = " HI-MAX ";
          TheatreLOC = " Hi Tech City ";
          sharukh.MovieNAME = " Raees ";
          sharukh.Moviebudget = 500;
          
        System.out.println(" TheatreNAME: " +TheatreNAME);  
        System.out.println(" TheatreLOC: " +TheatreLOC);
        System.out.println(" MovieNAME: " +sharukh.MovieNAME);
        System.out.println(" Moviebudget: " +sharukh.Moviebudget);
        
        System.out.println("***********************");
        System.out.println(" Main Method Ended");
          
          
       
          
	}

}
