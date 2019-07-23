package emailApp;

import java.util.Scanner;

public class Email {

		private String firstName;
		private String lastName;
		private String password;
		private String department;
		private int mailboxCapacity;
		private String alternateEmail;
		
		//Constructor that receives first name and last name
		public Email (String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
			System.out.println("Email created for: " + firstName + " " + lastName);
			
			//call method that asks for department and returns the department
			this.department = setDepartment();
			System.out.println("Department is: " + this.department);
		}
		
		//Ask for department
		private String setDepartment(){
			System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
			Scanner in = new Scanner(System.in);
			int departmentChoice = in.nextInt();
			
			if (departmentChoice == 1){	return "sales";	}
			else if (departmentChoice == 2){ return "dev";	}
			else if (departmentChoice == 3){ return "acct";	}
			else { return ""; }
		}
		
		
		//Generate random password
		
		//set mailbox capacity
		
		//set the alternate email
		
		//change the password
}
