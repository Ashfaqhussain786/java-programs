package com.javalanaguagefundamentals.constructors;

class Employee {

	Employee() {
		System.out.println("no args constrctors called");

	}

	public static void main(String[] args) {
		System.out.println("employee main method called");
		Employee e1 = new Employee(101,"Ashfaq",50000.00,'M');

		System.out.println("employee main method ended:");
	}

	Employee(int id, String name, Double salary, char gender) {

	}

	public class TestConstructors1 {

		int id;
		String name;
		Double salary;
		char gender;

		TestConstructors1() {
			System.out.println("No-args constructors called:");
		}

		void empInfo() {
			System.out.println("employee id:");
			System.out.println("employee name:");
			System.out.println("employee salary:");
			System.out.println("employee gender:");
		}

		public static void main(String[] args) {
		}

	}

}
