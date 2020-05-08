package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "orangehehven.com"; 
	
	
	//Generate email with the following syntax: firstname.lastname@department.company.com
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
				
		//Call a method asking for the department and return the department
		this.department = setDepartment();
				
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}
	
	//Determine the department (sales, development, accounting) if none, leave blank
	private String setDepartment() {
		System.out.println("New worker: " + firstName + "\nDEPARTMENT CODE:\n1 For Sales\n2 For Development\n3 For Accounting\n0 For None\nEnter Department Code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {return "sales";}
		else if(depChoice == 2) {return "dev";}
		else if(depChoice == 3 ) {return "acct";}
		else {return "";}
	}
	
	//Generate a random String for the password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
				
	}
	
	//Have set methods to change the password, define the mailbox capacity and define an alternate email address
	
	
	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Change password
	public void changePassword(String password) {
		this.password = password;
	}
	
	//Gave get methods to display the password, capacity and alternate email
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
		
	}
}
