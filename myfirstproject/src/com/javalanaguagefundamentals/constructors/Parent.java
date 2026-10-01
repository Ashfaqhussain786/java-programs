package com.javalanaguagefundamentals.constructors;

class Parent1 {
	Parent1() {
		System.out.println("Parent Constructor");
	}
}

class Child extends Parent1 {
	Child() {
		super();
		System.out.println("Child Constructor");
	}

}public  class Parent{

	public static void main(String[] args) {
		Child c = new Child();
	}

}
