package Menues;

import java.util.Scanner;

import accounts.User;

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
		
		// account creation, creating a new user object for this new user
		
		// creating scanner to take data input
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your email address:");
		String email = in.next();
		
		System.out.println("Enter your full name:");
		String name = in.next();
		
		System.out.println("Enter your Phone Number");
		int phone = in.nextInt();
		
		System.out.println("Choose a password:");
		String password = in.next();
		
//		// printing out details to test
//		System.out.println("email: " + email);
//		System.out.println("Name: " + name);
//		System.out.println("Phone Number: " + phone);
//		System.out.println("Password: " + password);
		
		// creating a new user object according to the inputed data
		User user1 = new User(name, password, email, phone);
		
		// storing the user1 object in an array in Account_Storage.java
		
		
		// test print
		// System.out.println("email: " + user1.getEmail());
		
	}

	// run log in method (ask for password)
	public static void logIn() {
		System.out.println("Enter your email address:");
		System.out.println("Enter your password:");
		
		// make option for forgot password and password will be emailed
		

		// check log in details

		// if details are correct, log in and go to log in menu
		Logged_In_Menu.main(null);

	}
	

	
	
	
	
}
