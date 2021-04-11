package Menues;

import java.util.Scanner;

public class Logged_In_Menu {
	private static final Scanner sc = new Scanner(System.in);
	private static final Submit_IT_Docket[] itsubmittions = new Submit_IT_Docket[1000];

	private static int submittionCount = 0;

	public static void main(String[] args) {
		String menuSelection;
		char selection = '\0';

		do {

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

					System.out.println("Logging you out – goodbye!");
					// run log out method
					logOut();

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
		System.out.println("Change your password:");
	}

	private static void listAll() {
		// TODO Auto-generated method stub
		System.out.println("Here are your current ticket submissions:");

		for (int i = 0; i < submittionCount; i++) {
			itsubmittions[i].printITsubmittion();
			System.out.println();
		}

	}

	private static void addITsubmittion() {
		// TODO Auto-generated method stub
		System.out.println("Input Ticket Details");

		String description;
		int severity;

		System.out.println("Please Enter desciption of issue:");
		description = sc.nextLine();
		System.out.println("Please select severy:");
		severity = sc.nextInt();

		sc.nextLine();

		itsubmittions[submittionCount] = new Submit_IT_Docket(description, severity);
		submittionCount++;

		sc.nextLine();

		for (int i = 0; i < submittionCount; i++) {
			itsubmittions[i].printITsubmittion();
			System.out.println();
			System.out.println("IT docket has been successfully submitted to the IT team - Thank you");
		}

	}

	// log out method
	public static void logOut() {
		Top_Menu.main(null);
	}

}
