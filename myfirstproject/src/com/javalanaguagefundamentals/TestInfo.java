package com.javalanaguagefundamentals;

class Student {
	int sid;
	String sname;
}

class Employee {
	int eid;
	double esal;
	String ename;

}

public class TestInfo {
	public static Student getStudent() {
		Student s = new Student();
		s.sid = 101;
		s.sname = "Ashfaq Hussain";
		System.out.println("Student id:" + s.sid);
		System.out.println("Student name:" + s.sname);
		return s;

	}
	
	public static Employee getEmployeeInfo() {
		Employee emp = new Employee();
		emp.eid = 101;
		emp.ename ="Ashfaq Hussain";
		emp.esal = 50000;
		System.out.println("Employee id:" +emp.eid);
		System.out.println("Employee name:" +emp.ename);
		System.out.println("Employee salary:" +emp.ename);
		return emp;
	}

	public static void main(String[] args) {
		System.out.println("main method started: ");
		
		Student s1 = getStudent();
		System.out.println("Student id:" +s1.sid);
		System.out.println("Student name:" +s1.sname);
		
		Employee e1 = getEmployeeInfo();
		System.out.println("Employee id:" +e1.eid);
		System.out.println("Employee name:" +e1.ename);
		System.out.println("Employee salary:" +e1.esal);	
		System.out.println("main method ended: ");

	}
}
