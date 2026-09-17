package com.javalanaguagefundamentals;

public class Testdatatypesdemo1 {
       
	  // -128 to 127 
	  byte b = 127;//converting Int to byte called explicit type casting..
	  byte b1 = (byte) 257;//0
	  
	  // -32768 to 32767
	  short s = 32767;
	  short s1 = (short) 32800;
	  short s2 = b1; //implicit type casting, converting byte to short...
	  
	  // -2147483648 to 2147483647 = 2^31
	  int i = 2147483647;
	  int i1 = (int) 2147483648L;//explicit type casting.. long to int..
	  
	  //2^63
	  long l = 2147483648L;
	  long l1 = 9223372036854775807L;
	  
	  //by default RHS decimal point will consider as double..
	  //when we represent float we must provide f or F suffix..
	  float f = 5.9f;//5.9
	  float f1 = 56.5565545484f;//56.556553
	
	  double d = 56.5565545484486646464;
	  
	  char c;
	  boolean boo;

	public static void main(String[] args) {
		Testdatatypesdemo1 t1 = new Testdatatypesdemo1();
		
		System.out.println(" byte value: " +t1.b);//127
		System.out.println(" byte value: " +t1.b1);//1
		
		System.out.println(" short value: " +t1.s);//32767
		System.out.println(" short value: " +t1.s1);// -32736
		System.out.println(" short value: " +t1.s2);//1

		
		System.out.println(" int value: " +t1.i);//2147483647
		System.out.println(" int value: " +t1.i1);//2147483648L
		
		System.out.println(" long value: " +t1.l);//2147483648
		System.out.println(" long value: " +t1.l1);//9223372036854775807

		
		System.out.println(" float value: " +t1.f);//5.9
		System.out.println(" float value: " +t1.f1);//56.556553
		

		System.out.println(" double value: " +t1.d);//56.556554548448666
		
		System.out.println(" char value: " +t1.c);// 
		System.out.println(" boolean value: " +t1.boo);// false
	}

}
