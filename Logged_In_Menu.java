package Menues;

import java.util.Scanner;

public class Logged_In_Menu {

	public static void main(String[] args) {

		// boolean to quit the menu loop
		boolean quit = false;

		// take input
		Scanner in = new Scanner(System.in);

		while (quit == false) {

			System.out.println("Select an option:");
			System.out.println("1. Submit an IT ticket");
			System.out.println("2. View IT ticket submissions");
			System.out.println("3. Log Out");
			System.out.println("4. Change Password");

			int menuSelection = in.nextInt();

			// process input
			switch (menuSelection) {

			case 1: // submit an IT ticket
				System.out.println("Input Ticket Details");

				// run ticket submission method

				break;

			case 2: // View IT ticket submissions
				System.out.println("Here are your current ticket submissions:");

				// run IT ticket list method

				break;

			case 3: // Log Out
				System.out.println("Logging you out.....");
				System.out.println(".....");

				// run log out method
				logOut();

				break;

			case 4: // Change Password
				System.out.println("Change your password:");

				// run change password method

				break;

			default:

				System.out.println("Invalid choice.");

			}

		}
	}
	
	
	// log out method
	public static void logOut()
	{
		Top_Menu.main(null);
	}

}
