package com.javaintro;

public class Friend {
     
	
	  //static variable declaration
      static String Friend = "Ashfaq's Friends";
	
      //instance variable declaration
      String FriendNAME;
      int phno;
      
	public static void main(String[] args) {
		
		System.out.println(" Main Method Started: ");
		System.out.println(" Welcome to Friends Club: ");
		System.out.println(" ************* OBJECT01 ***************");
		
		Friend adil = new Friend();
		
		adil.FriendNAME = " MOHD ADIL SHAREEF ";
		adil.phno = 77802;
		
		System.out.println(" Relation: " +Friend);
		System.out.println(" FriendsNAME: " +adil.FriendNAME);
		System.out.println(" phno: " +adil.phno);

		System.out.println("****************************************");
		
        System.out.println(" ************* OBJECT02 ***************");
		
		Friend adnan = new Friend();
		
		adnan.FriendNAME = " MOHD ADNAN SHAREEF ";
		adnan.phno = 95503;
		
		
		System.out.println(" Relation: " +Friend);
		System.out.println(" FriendsNAME: " +adnan.FriendNAME);
		System.out.println(" phno: " +adnan.phno);
		
		System.out.println(" Main Method Ended: ");

	    System.out.println("*************************");
			
		
	}

}
