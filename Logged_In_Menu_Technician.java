package Menus;

import java.util.Scanner;

import Accounts.Ticket;
import Menus.Top_Menu;
import Accounts.Collections;
import Accounts.Technician;

public class Logged_In_Menu_Technician {

	private static final Scanner sc = new Scanner(System.in);

	private static int submittionCount = 0;
	
	static String currentLoggedInName;

	public static void runLoggedInMenuTechnicians(String LoggedInName) {

		currentLoggedInName = LoggedInName;

		String menuSelection;
		char selection = '\0';

		do {
			System.out.println("Select an option:");
			System.out.println("1. View IT tickets assigned to me");
			System.out.println("2. Escalate a Ticket");
			System.out.println("3. Change a Ticket's Status");
			System.out.println("4. Log Out");

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

					Collections.printAllTechnicionTickets(currentLoggedInName);
					break;
				case '2':

					escalateTicket();
					break;

				case '3':

					actionTicket();
					break;

				case '4':

					System.out.println("System shutting down – goodbye!");
					Top_Menu.runTopMenu();
					break;

				default:

					System.out.println("Error - invalid selection!");
				}
			}
			System.out.println();

		} while (selection != '3');

		sc.close();

	}

	private static void escalateTicket() {
		// TODO Auto-generated method stub

		int sev;
		int input;

		
		for (int i = 0; i < submittionCount; i++) {
			System.out.println("Ticket Number: " + i);
		
			System.out.println();
		}

		System.out.println("Enter Ticket Number:");
		input = sc.nextInt();
		for (int i = 0; i < submittionCount; i++) {
			if (i == input) {
				
				System.out.println();
			}
		}
		System.out.println(
				"1 - Low (localised) \n2 - Medium (affecting a small group) \n3- High (affecting a large group) \n4 - Critical (affecting all users)");
		System.out.println("Enter new severity:");
		sev = sc.nextInt();
		for (int i = 0; i < submittionCount; i++) {
			if (i == input) {
				// store new severity in array code
				System.out.println();
			}
		}
	}

	private static void viewITsubmittion() {
		// TODO Auto-generated method stub
		System.out.println("Here are your current ticket submissions:");

		// getting the currentLoggedInName in ticketList
		if (currentLoggedInName.contentEquals(Technician.POSSIBLE_VALUES[0])
				|| currentLoggedInName.contentEquals(Technician.POSSIBLE_VALUES[1])
				|| currentLoggedInName.contentEquals(Technician.POSSIBLE_VALUES[2])) {
			// it is a level 1 technician, so checking randomValue
		} else {
			// it is a level 2 technician, so checking randomValue2
		}

//		if (Submit_IT_Docket.getRandomValue() == currentLoggedInName) {
//			for (int i = 0; i < submittionCount; i++) {
//				itsubmittions[i].techicianITTickets();
//				System.out.println();
//			}

		// i think this just stops the running until the user presses enter
		sc.nextLine();
	}

	private static void changePassword() {
		// TODO Auto-generated method stub
		Top_Menu.registerAccount();
	}

	private static void actionTicket() {
		// TODO Auto-generated method stub
		int input;
		int newStatus;

		for (int i = 0; i < submittionCount; i++) {
			System.out.println("Ticket Number: " + i);
	
			System.out.println();
		}

		System.out.println("Enter Ticket Number:");
		input = sc.nextInt();
		
		// feedback of the chosen ticket
		int i;
		for (i = 0; i < Collections.ticketList.size(); i++) {

			if (Collections.ticketList.get(i).getuniqueKey() == input)
			{
				System.out.println("This is your chosen ticket:");
				System.out.println();
				System.out.printf("%s %s\n", "Ticket ID: ", Collections.ticketList.get(i).getuniqueKey());
				System.out.printf("%s %s\n", "Ticket Status: ", Collections.ticketList.get(i).getStatus());
				System.out.printf("%s %s\n", "Issue Description:", Collections.ticketList.get(i).getDescription());
				System.out.printf("%s %s\n", "Issue Severity:", Collections.ticketList.get(i).getSeverity());
				System.out.printf("%s %s\n", "Issue Reporter:", Collections.ticketList.get(i).getuserName());
				System.out.printf("%s %s\n", "Date Submitted:", Collections.ticketList.get(i).getDate());
				System.out.println();
				System.out.println();
			}
		}
		
		

		System.out.println("Enter new status (Select from the list below):");
		System.out.println("1 To do \n 2 In Progress\n 3 Resolved");
		newStatus = sc.nextInt();
		
	
		
		switch (newStatus)
		{
		case 1:
	
			for (int j = 0; j < Collections.ticketList.size(); j++) {

				if (Collections.ticketList.get(j).getuniqueKey() == input)
				{
					Collections.ticketList.get(j).setStatus("To DO");
				}
			}
			break;
			
		case 2:
			
			for (int k = 0; k < Collections.ticketList.size(); k++) {

				if (Collections.ticketList.get(k).getuniqueKey() == input)
				{
					Collections.ticketList.get(k).setStatus("In Progress");
				}
			}
			break;
			
		case 3:
			
			for (int l = 0; l < Collections.ticketList.size(); l++) {

				if (Collections.ticketList.get(l).getuniqueKey() == input)
				{
					Collections.ticketList.get(l).setStatus("Resolved");
				}
			}
			break;
			
			default:
				System.out.println("please enter one of the valid options");
		}

		//
		
		
//		for (int i = 0; i < submittionCount; i++) {
//			if (i == input) {
//				Ticket.getStatus().replace(newStatus, newStatus);
//				System.out.println();
//			}
//		}
	}

}
