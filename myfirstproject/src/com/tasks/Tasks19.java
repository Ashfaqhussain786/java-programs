package com.tasks;

//Program on simple chatbot..
import java.util.Scanner;

public class Tasks19 {
	static Scanner sc = new Scanner(System.in);
	static String ans;

	void hello() {
		System.out.println(" Hello Welcome,I am Ashfaq!!!! ");
		sc.nextLine();
	}

	void name() {
		System.out.println(" What Is Your Name? ");
		ans = sc.nextLine();
		System.out.println("\n");
		System.out.println(ans + " : Nice to meet you Ashfaq.. ");
		System.out.println("\n");
		System.out.println(" How Can i help You? ");
		ans = sc.nextLine();
		System.out.println(" Yeah Sure ");
		sc.nextLine();

	}

	void courses() {
		System.out.println("\n");
		String course_1 = "java";
		String course_2 = "python";
		String course_3 = "c++";
		String course_4 = "data analyst";

		System.out.println(" course_1: " + course_1);
		System.out.println(" course_2: " + course_2);
		System.out.println(" course_3: " + course_3);
		System.out.println(" course_4: " + course_4);
		System.out.println("\n");

		System.out.println(" Which Course Did You Choose: ");
		String choice = sc.nextLine();

		if (choice.equals(course_1)) {
			System.out.println(" Your course is: " + course_1);
			System.out.println(" Timings of JAVA course is 9:00AM to 11:00AM.. ");
		} else if (choice.equals(course_2)) {
			System.out.println(" Your course is: " + course_2);
			System.out.println(" Timings of PYTHON course are 12:00PM to 2:00PM.. ");
		} else if (choice.equals(course_3)) {
			System.out.println(" Your course is: " + course_3);
			System.out.println(" Timings of C++ course are 2:00PM to 4:00PM.. ");
		} else if (choice.equals(course_4)) {
			System.out.println(" Your course is: " + course_4);
			System.out.println(" Timings of DATA ANALYST course are 4:00PM to 6:00PM.. ");
		} else {
			System.out.println(" Enter A Valid response: ");
		}
		sc.nextLine();

	}

	void fee() {
		System.out.println(" Have You Cleared Your Fee? ");
		String choice1 = "yes";
		String choice2 = "no";
		String choice = sc.nextLine();
		if (choice.equals(choice1)) {
			System.out.println(" Be Regular and Consistent For the Classes.. ");
			System.out.println(" Your Journey Starts From here.. ");
			System.out.println(" Good Luck!!! ");
		} else if (choice.equals(choice2)) {
			System.out.println(" Please Clear Your Fees.. ");
			System.out.println(" Access to the recordings will be stopped..");

		}
		sc.nextLine();

	}

	public static void main(String[] args) {
		System.out.println(" Main Method Started: ");
		Tasks19 t = new Tasks19();
		t.hello();
		t.name();
		t.courses();
		t.fee();
		System.out.println(" Main Method Ended: ");

	}

}
