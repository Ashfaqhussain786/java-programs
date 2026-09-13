package com.tasks;

public class Employees {

    int count;
	int EmployeeID;
	short EmployeeAGE;
	double EmployeeSALARY;
	char EmployeeGRADE;
	byte EmployeeEXP;
	boolean EmployeeACTIVE;
	int EmployeeUSEDLEAVE;
	long EmployeePHNO;
	int Employee_AVAILABLE_LEAVE;
	
	
	void countl() {
		
		count = Employee_AVAILABLE_LEAVE - EmployeeUSEDLEAVE;
		
	}
	void display() {
		System.out.println(" ********************************************** ");
		
		System.out.println(" Employee Details: ");
		System.out.println(" EmployeeID: " +EmployeeID);
		System.out.println(" EmployeeAGE: " +EmployeeAGE);
		System.out.println(" EmployeeSALARY: " +EmployeeSALARY);
		System.out.println(" EmployeeGRADE: " +EmployeeGRADE);
		System.out.println(" EmployeeEXP: " +EmployeeEXP);
		System.out.println(" EmployeeACTIVE: " +EmployeeACTIVE);
		System.out.println(" EmployeeUSEDLEAVE: " +EmployeeUSEDLEAVE);
		System.out.println(" EmployeePHNO: " +EmployeePHNO);
		System.out.println(" EmployeeAvailableleave: " +Employee_AVAILABLE_LEAVE);
		System.out.println(" EmployeeREMAININGlEAVES: " +count);
		
		System.out.println(" ********************************************** ");
	}
	
	
	public static void main(String[] args) {
		 Employees e1 = new Employees();
		 e1.EmployeeID = 101;
		 e1.EmployeeAGE = 23;
		 e1.EmployeeSALARY = 800000D;
		 e1.EmployeeGRADE = 'A';
		 e1.EmployeeEXP = 10;
		 e1.EmployeeACTIVE = true;
		 e1.EmployeeUSEDLEAVE = 1;
		 e1.EmployeePHNO = 8520995341L;
		 e1.Employee_AVAILABLE_LEAVE = 4;
		 
		 e1.countl();
		 e1.display();
		 
		 
		 
		 
		 
		 
	}

}
