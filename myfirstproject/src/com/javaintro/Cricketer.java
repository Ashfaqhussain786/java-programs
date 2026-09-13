package com.javaintro;

public class Cricketer {

    //static variables
    
	static int countryID = 01;
    static String countryNAME = " INDIA ";
    
    Cricketer() {
    	System.out.println("Welcome to Team :");
    }


    //instance variables
    int jerseynumber;
    String cricketername;
   
        
     public static void main(String[] args) {
    	    
    	    System.out.println("Main Method Started:");
        System.out.println("Welcome To Indian cricket Team");
        
        System.out.println("*****************Object 01***************************");
        Cricketer msd = new Cricketer();
        
        msd.jerseynumber = 07;
        msd.cricketername = "Mahendar Singh Dhoni";
        
      //Accessing the static data
        System.out.println("Country ID: " + countryID);//0
        System.out.println("CountryNAME: " + countryNAME);//null
        System.out.println("Jersey Number: " + msd.jerseynumber);
        System.out.println("Cricketer Name: " + msd.cricketername);
        
        
        System.out.println("*************Object 02***************************");
        Cricketer vk = new Cricketer();
        
        vk.jerseynumber = 18;
        vk.cricketername = "Virat Kohli";
        
      //Accessing the static data
        System.out.println("Country ID: " + countryID);//0
        System.out.println("CountryNAME: " + countryNAME);//null
        System.out.println("Jersey Number: " + vk.jerseynumber);
        System.out.println("Cricketer Name: " + vk.cricketername);
        
        
        System.out.println("*****************Object 03***************************");
        Cricketer dsp = new Cricketer();
        
        dsp.jerseynumber = 18;
        dsp.cricketername = "Mohd Siraj";
        
      //Accessing the static data
        System.out.println("Country ID: " + countryID);//0
        System.out.println("CountryNAME: " + countryNAME);//null
        System.out.println("Jersey Number: " + dsp.jerseynumber);
        System.out.println("Cricketer Name: " + dsp.cricketername);
        
        
        System.out.println("************************Object 04***************************");
        Cricketer gill = new Cricketer();
        
        gill.jerseynumber = 18;
        gill.cricketername = "Virat Kohli";
        
      //Accessing the static data;
        
      //Accessing the static data
        System.out.println("Country ID: " + countryID);//0
        System.out.println("CountryNAME: " + countryNAME);//null
        System.out.println("Jersey Number: " + gill.jerseynumber);
        System.out.println("Cricketer Name: " + gill.cricketername);
        
        System.out.println("********************Object 05***************************");
        Cricketer pathan = new Cricketer();
        
        countryID = 02;
        countryNAME = " USA ";
        
        pathan.jerseynumber = 07;
        pathan.cricketername = "Yousuf Pathan";
        
      //Accessing the static data
        System.out.println("Country ID: " + countryID);//0
        System.out.println("CountryNAME: " + countryNAME);//null
        System.out.println("Jersey Number: " + pathan.jerseynumber);
        System.out.println("Cricketer Name: " + pathan.cricketername);
        
      //  System.out.println(" Number Of Objects Created: " +count);
        
        
        System.out.println("Main Method Ended:");
        

       
    }
    
}
