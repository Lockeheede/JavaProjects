package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	private int costOfCourse = 600;
	private static int id = 1000;
	
	
	//Prompted to enter the name and year for each student
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("GRADE LEVEL CODE\n1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student grade level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

	}
	
	//Give student 5-digit unique ID. First number is their grade level
	private void setStudentID() {
		//Grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;
		
	}
	
	//Student can enroll in the following courses:
	public void enroll() {
		do {
			System.out.println("Enter course to enroll (Q to quit)");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else { break;}
		}while(1 != 0);
		System.out.println("ENROLLED IN: " + courses);
		System.out.println("TUITION BALANCE: $" + tuitionBalance);
	}
	//History 101, Mathematics 101, English 101, Chemistry 101, Computer Science 101 
			 
	//Each course costs $600 to enroll
			
	//Students should be able to view their balance and pay the tutition
			
	//To see the status of a student, we should see their name, ID, courses enrolled and balance
}
