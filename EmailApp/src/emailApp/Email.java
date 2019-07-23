package emailApp;

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
		private String companySuffix = "xyzcompany.com";
		
		//Constructor that receives first name and last name
		public Email (String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
			
			//call method that asks for department and returns the department
			this.department = setDepartment();
			
			//call method that returns random password
			this.password = randomPassword(defaultPasswordLength);
			System.out.println("Your password is: " + this.password);
			
			//join elements to create/generate the email in the required syntax
			email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
		}
		
		//Ask for department
		private String setDepartment(){
			System.out.print("New worker: " + firstName + " " + lastName + ". Select a DEPARTMENT CODE\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
			Scanner in = new Scanner(System.in);
			int departmentChoice = in.nextInt();
			
			if (departmentChoice == 1){	return "sales.";	}
			else if (departmentChoice == 2){ return "dev.";	}
			else if (departmentChoice == 3){ return "acct.";	}
			else { return ""; }
		}
		
		
		//Generate random password
		private String randomPassword(int length){
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
			char[] password = new char[length];
			
			for (int i=0; i < length; i++){
				int randValue = (int) (Math.random() * passwordSet.length());
				//System.out.println("randValue is: " + randValue);
				password[i] = passwordSet.charAt(randValue);
			}
			
			return new String(password);
		}
		
		//set mailbox capacity
		public void setMailboxCapacity(int capacity){
			this.mailboxCapacity = capacity;
		}
		
		//set the alternate email
		public void setAlternateEmail(String altEmail){
			this.alternateEmail = altEmail;
		}
		
		//change the password
		public void changePassword(String newPassword){
			this.password = newPassword;
		}
		
		public int getMailboxCapacity() {return mailboxCapacity;}
		public String getAlternateEmail() {return alternateEmail;}
		public String getPassword() {return password;}
		
		public String showInfo(){
			return "DISPLAY NAME: " + firstName + " " + lastName +
					"\nCOMPANY EMAIL: " + email + 
					"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
		}
}
