package Menus;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Accounts.Collections;
import Accounts.Technician;
import Accounts.Ticket;

public class Logged_In_Menu_User {

	private static final Scanner sc = new Scanner(System.in);

	// hashmap of Submit_IT_Dockets using uniqueKey as the key
	public static Map<String, Ticket> submittionMap = new HashMap<String, Ticket>();

	static String currentlyLoggedInEmail;

	
	// declaring the key number as 0 but it will go up to access another element then next time a ticket is created
	static int keyNumber = 0;

	public static void runLoggedInMenu(String loggedInEmail) {

		currentlyLoggedInEmail = loggedInEmail;

		// boolean to quit the menu loop
		boolean quit = false;

		// starting the menu loop
		while (quit == false) {

			int selection;

			System.out.println("Select an option:");
			System.out.println("1. Submit an IT ticket");
			System.out.println("2. View IT ticket submissions");
			System.out.println("3. Log Out");
			System.out.println("4. Change Password");

			System.out.print("Enter your selection: ");
			selection = sc.nextInt();

			switch (selection) {
			case 1:

				addITsubmittion();
				break;

			case 2:

				listAll();
				break;

			case 3:

				System.out.println("System shutting down – goodbye!");
				Top_Menu.runTopMenu();

				quit = true;
				break;

			case 4:

				changePassword();
				break;

			default:

				System.out.println("Error - invalid selection!");
			}

			System.out.println();

		}

	}

	private static void changePassword() {
		// TODO Auto-generated method stub
		Top_Menu.registerAccount();
	}

	private static void listAll() {

		System.out.println("Here are your current ticket submissions: \n");

		// this is in collections because it is working with data in ticketList
		Collections.printAllUsersTickets(currentlyLoggedInEmail);

	}

	private static void addITsubmittion() {
		// TODO Auto-generated method stub
		System.out.println("Input Ticket Details");

		// changed the username to retrieve from currentlyLoggedInEmail
		String description, userName = currentlyLoggedInEmail, randomValue = Technician.getRandomValue(),
				randomValue2 = Technician.getRandomValue2();
		int severity;
		var status = "New";
		Date date = new Date();

		// this will retrieve from the key array which starts from 0;
		int uniqueKey = keyNumber;
		// adding one to the key so the next one will be different
		keyNumber++;

		System.out.println("Please Enter desciption of issue: ");
		sc.nextLine();
		description = sc.nextLine();
		System.out.println(
				"1 - Low (localised) \n2 - Medium (affecting a small group) \n3- High (affecting a large group) \n4 - Critical (affecting all users)");
		System.out.println("Please select severity:");
		severity = sc.nextInt();
		if (severity == 1 || severity == 2) {
			System.out.println("Assigned Technician: " + randomValue);
		} else if (severity == 3 || severity == 4) {
			System.out.println("Assigned Technician: " + randomValue2);
		}
		System.out.println("Submitted by: " + userName);
		System.out.println("Ticket ID: " + uniqueKey);
		System.out.println("Date Submitted: " + date);
		System.out.println("Ticket Status: " + status);

		Ticket ticket = new Ticket(uniqueKey, description, severity, userName, randomValue, randomValue2, status, date);

		// to feedback what has just been submitted
		System.out.printf("%s %s\n", "Ticket ID: ", uniqueKey);
		System.out.printf("%s %s\n", "Ticket Status: ", status);
		System.out.printf("%s %s\n", "Issue Description:", description);
		System.out.printf("%s %s\n", "Issue Severity:", severity);
		System.out.printf("%s %s\n", "Issue Reporter:", userName);
		System.out.printf("%s %s\n", "Date Submitted:", date);

		System.out.println("IT docket has been successfully submitted to the IT team - Thank you");
		
		//to stop until the user pressed enter
		sc.nextLine();
		sc.nextLine();

		// adding the ticket to the ticketList collection
		Collections.ticketList.add(ticket);

	}

}
