package com.javaintro;

public class BankAccount {
	
	//static variable
	static long accountnogenerator = 852099534;
	{
		accno = accountnogenerator;
		accountnogenerator++;
	}
	
	//instance variable 
	long accno;
	String accountholdername;
	double balance;
	
	
	public static void main(String[] args) {
       System.out.println(" Main Method Started: ");
       
       System.out.println("**************************");
       System.out.println(" ************** OBJECT01 ****************"); 
       BankAccount b1 = new BankAccount();
       b1.accountholdername = " ASHFAQ ";
       b1.balance = 50000;
       System.out.println(" Account no: " +b1.accno);
       System.out.println(" Accountholdername: " +b1.accountholdername);
       System.out.println(" Balance: " +b1.balance);
       System.out.println("**************************");
       
       System.out.println(" ************** OBJECT02 ****************"); 
       BankAccount b2 = new BankAccount();
       b2.accountholdername = " ADNAN ";
       b2.balance = 60000;
       System.out.println(" Account no: " +b2.accno);
       System.out.println(" Accountholdername: " +b2.accountholdername);
       System.out.println(" Balance: " +b2.balance);
       System.out.println("**************************");
       
       System.out.println(" ************** OBJECT03 ****************"); 
       BankAccount b3 = new BankAccount();
       b3.accountholdername = " ADIL ";
       b3.balance = 80000;
       System.out.println(" Account no: " +b3.accno);
       System.out.println(" Accountholdername: " +b3.accountholdername);
       System.out.println(" Balance: " +b3.balance);
       System.out.println("**************************");
       
       System.out.println(" ************** OBJECT04 ****************"); 
       BankAccount b4 = new BankAccount();
       b4.accountholdername = " ASIF ";
       b4.balance = 90000;
       System.out.println(" Account no: " +b4.accno);
       System.out.println(" Accountholdername: " +b4.accountholdername);
       System.out.println(" Balance: " +b4.balance);
       System.out.println("**************************");
       
       System.out.println(" Main Method Ended: ");
	}

}
