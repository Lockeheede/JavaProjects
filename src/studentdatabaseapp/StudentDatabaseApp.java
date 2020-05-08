package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {		
		System.out.print("Enter the number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		for (int n = 0; n < numOfStudents; n++) {
			//Add new students to database
			
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
		}
		
		for (int n = 0; n < numOfStudents; n++) {
			System.out.println(students[n].showInfo());
		}
	}

}
