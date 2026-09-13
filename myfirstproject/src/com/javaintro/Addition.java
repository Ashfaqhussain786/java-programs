package com.javaintro;

public class Addition {

	int a,b,sum,sub;
    
	void add()	{
		sum = a + b;
    }
	void subtraction() {
		sub = a - b;
	}
	public static void main(String[] args) {

        Addition a1 = new Addition();
        a1.a = 5;
        a1.b = 12;
        a1.add();
        a1.subtraction();
        
        System.out.println(" Sum of "+a1.a+" and "+a1.b+" is: " +a1.sum);
        System.out.println(" Subtraction of "+a1.a+" and "+a1.b+" is: " +a1.sub);

        
	}

}