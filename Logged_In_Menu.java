package Menues;
import java.util.UUID;
import java.util.Date;
import java.util.Scanner;

import accounts.Technicians;
import accounts.User;




public class Logged_In_Menu {
	private static final Scanner sc = new Scanner(System.in);
	private static final Submit_IT_Docket[] itsubmittions = new Submit_IT_Docket[1000];
	private static int submittionCount = 0;
	
	public static void main(String[] args) {
	String menuSelection;
	char selection = '\0';
	

	do 	{		
		System.out.println("Select an option:");
		System.out.println("1. Submit an IT ticket");
		System.out.println("2. View IT ticket submissions");
		System.out.println("3. Log Out");
		System.out.println("4. Change Password");
		
		// take input 
		System.out.println();

		System.out.print("Enter your selection: ");
		menuSelection = sc.nextLine();

		if (menuSelection.length() != 1) {
			System.out.println("Error - selection must be a single character!");

		} else {
			selection = Character.toUpperCase(menuSelection.charAt(0));

			switch (selection) {
			case '1':

				addITsubmittion();
				break;

			case '2':

				listAll();
				break;

			case '3':

				System.out.println("System shutting down – goodbye!");
				Top_Menu.main(null);
				break;

			case '4':

				changePassword();
				break;
				
			default:

				System.out.println("Error - invalid selection!");
			}
		}
		System.out.println();

	} while (selection != '3');

}

		 private static void changePassword() {
		// TODO Auto-generated method stub
			 Top_Menu.registerAccount();
	}

		private static void listAll() {
		// TODO Auto-generated method stub
			System.out.println("Here are your current ticket submissions:");
			//if(//logged in user be tech or user = Submit_IT_Docket.getRandomValue()) {
			for (int i = 0; i < submittionCount; i++) {
				System.out.println("Ticket Number: " + i);
				itsubmittions[i].techicianITTickets();
				System.out.println();
			}
			}
			
		
		private static void addITsubmittion() {
		// TODO Auto-generated method stub
			System.out.println("Input Ticket Details");
			
			String description, userName, randomValue = Technicians.getRandomValue(), randomValue2 = Technicians.getRandomValue2(), status = "New";
			int severity;
			Date date = new Date();
		    String uniqueKey = UUID.randomUUID().toString();
		    
		    
		    System.out.println ("Ticket ID: " + uniqueKey);
		    System.out.println ("Ticket Status: " + status);
			System.out.println("Please Enter desciption of issue:");
			description = sc.nextLine();
			System.out.println("1 - Low (localised) \n2 - Medium (affecting a small group) \n3- High (affecting a large group) \n4 - Critical (affecting all users)");
			System.out.println("Please select severity:");
			severity = sc.nextInt();
			System.out.println(User.getUserName());
			userName = sc.nextLine();
			if (severity == 1 || severity == 2) {
			System.out.println("Assigned Technician: "  + randomValue);
			}
			else if (severity == 3 || severity == 4) {
			System.out.println("Assigned Technician: "  + randomValue2);
		}
			 System.out.println ("Date Submitted: " + date);

			
			itsubmittions[submittionCount] = new Submit_IT_Docket(uniqueKey, description, severity, userName, randomValue, randomValue2, status, date);
			submittionCount ++;
			
			
			
				for (int i = 0; i < submittionCount; i++) {
				System.out.println();
				System.out.println("Ticket Number: " + i);
			    itsubmittions[i].printITsubmittion();
				System.out.println();
				}
				System.out.println("IT docket has been successfully submitted to the IT team - Thank you");
	}

}

