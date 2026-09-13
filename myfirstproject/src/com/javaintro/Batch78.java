package com.javaintro;

import java.util.Scanner;

public class Batch78 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        
        System.out.println("\n Enter The First Number:\n");
        int num1 = myobj.nextInt();

        System.out.println("\n Enter The Second Number:\n");
        int num2 = myobj.nextInt();

        int Difference = num1 - num2;

        System.out.println("The Difference of " + num1 + " and " + num2 + " is :" +Difference);

        myobj.close();

    }
}
