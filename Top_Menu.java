package Menues;

import java.util.Scanner;

public class Top_Menu {

	public static void main(String[] args) {

		// boolean to quit the menu loop
		boolean quit = false;

		// making the scanner to take input
		Scanner in = new Scanner(System.in);

		// starting the menu loop
		while (quit == false) {

			System.out.println("Select an option:");
			System.out.println("1. Register a new account");
			System.out.println("2. Log In");
			System.out.println("3. Quit");

			// take input
			int menuSelection = in.nextInt();

			// process input
			switch (menuSelection) {

			case 1: // Register for an account
				System.out.println("Input your details to register:");

				// run account register method
				registerAccount();

				break;

			case 2: // log in, go to logged in menu
				System.out.println("Log in:");

				// run logged in method
				logIn();

				break;

			case 3: // quit the menu and terminate
				System.out.println("Quitting...");

				quit = true;
				break;

			default:

				System.out.println("Invalid choice.");

			}

		}
		
		in.close();
	}

	// account register method
	public static void registerAccount() {
		System.out.println("Enter your email address:");
	}

	// run logged in method (ask for password)
	public static void logIn() {
		System.out.println("Enter your email address:");
		System.out.println("Enter your password:");

		// check log in details

		// if details are correct, log in and go to log in menu

	}
}
