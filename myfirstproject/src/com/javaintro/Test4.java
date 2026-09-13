package com.javaintro;

public class Test4 {
	static void method4() {
        System.out.println(" METHOD 4 CALLED: ");
    }
    static void method3() {
        method4();
        System.out.println(" METHOD 3 CALLED: ");
    }
    void method2() {
        method3();
        System.out.println(" METHOD 2 CALLED: ");
     }
    void method1() {
        method2();
        System.out.println(" METHOD 1 CALLED: ");
    }
    
    public static void main(String[] args) {
       Test4 t = new Test4();
        t.method1();
    }
}