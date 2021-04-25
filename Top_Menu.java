package Menus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Menus.Logged_In_Menu_User;
import Menus.Logged_In_Menu_Technician;
import Menus.Menu_Regex;
import Menus.Top_Menu;
import Accounts.Collections;
import Accounts.Technician;
import Accounts.User;




public abstract class Top_Menu {
	
	

	public static void runTopMenu() {
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
			System.out.println("4. Technician Log In");

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

			case 4:
				logInTechnician();
				break;

			default:

				System.out.println("Invalid choice.");

			}

		}

		in.close();

	}

	// methods used by the menu

	private static void logInTechnician() {

		// make option for forgot password and password will be emailed
		// menu with option for forgotten password

		// making the scanner to take input
		Scanner in = new Scanner(System.in);

		boolean match = false;
		// starting log in loop
		// while (match == false) {

		// taking user email as: email
		System.out.println("Enter your name");
		String name = in.nextLine();
		// taking user password as: password
		System.out.println("Enter password:");
		String password = in.nextLine();

		// check log in details passing in name and password, saving the boolean as
		// match
		// if it is true then the log in can proceed, if not then send a message to the
		// user to say they don't have access
		// checking if the Technician details are correct
		match = matchCheckTechnician(name, password);

		System.out.println(Technician.technicianName[1]);
		System.out.println(match);

		if (match == false) {
			// message user, start loop again (continue)
			System.out.println("you do not have access");

			Top_Menu.runTopMenu();
		}

		// at this stage if match was changed to true then the loop will end and it will
		// then proceed to the logged in menu
		// }

		// need to make a way to pass through which user is being logged in so it can be
		// linked with the user in the logged in menu
		Logged_In_Menu_Technician.runLoggedInMenuTechnicians(name); // need this to be able to pass through the
																		// technicians name

	}

	private static void logIn() {

		// make option for forgot password and password will be emailed
		// menu with option for forgotten password

		// making the scanner to take input
		Scanner in = new Scanner(System.in);

		boolean match = false;
		// put loop back if needed
		// starting log in loop
		// while (match == false) {

		// taking user email as: email
		System.out.println("Enter your email address:");
		String email = in.next();
		// taking user password as: password
		System.out.println("Choose a password:");
		String password = in.next();

		// check log in details passing in email and password, saving the boolean as
		// match
		// if it is true then the log in can proceed, if not then send a message to the
		// user to say user doesn't exist
		match = matchCheck(email, password);

		if (match == false) {
			// message user, start loop again (continue)
			System.out.println("the email you entered is not registered, plesase register your account, \n"
					+ "or if you are registerd, your password is incorrect, please check it and try again \n "
					+ "or select: forgot password to recover your password");
			// }

			// runs top menu main again
			Top_Menu.runTopMenu();

		}

		// need to make a way to pass through which user is being logged in so it can be
		// linked with the user in the logged in menu
		Logged_In_Menu_User.runLoggedInMenu(email);

	}

	public static void registerAccount() {

		// account creation, creating a new user object for this new user

		// declaring the variables
		String email;
		String name;
		String phone;
		String password;

		// creating scanner to take data input
		Scanner in = new Scanner(System.in);

		System.out.println("Enter your email address:");

		while (true) {

			email = in.next();

			if (Menu_Regex.checkEmail(email) == true) {
				break;
			}

			System.out.println("Please enter a valid email address");

		}

		System.out.println("Enter your full name:");
		while (true) {

			name = in.nextLine();
			name = in.nextLine();

			if (Menu_Regex.checkUserName(name) == true) {
				break;
			}

			System.out.println("Please enter a valid name");

		}

		System.out.println("Enter your Phone Number:");

		while (true) {

//					try {
			phone = in.next();

			if (Menu_Regex.checkPhone(phone) == true) {
				break;
			}
//						System.out.println("Please enter a valid phone number");
//					} catch (Exception e) {
//						System.out.println("please enter a valid phone number");
//					}

		}

		System.out.println("Choose a password:");

		while (true) {

			password = in.next();

			if (Menu_Regex.checkPassword(password) == true) {
				break;
			}
			System.out.println("Please enter a valid password");
		}

//				// printing out details to test
//				System.out.println("email: " + email);
//				System.out.println("Name: " + name);
//				System.out.println("Phone Number: " + phone);
//				System.out.println("Password: " + password);

		// creating a new user object according to the inputed data
		User user1 = new User(name, password, email, phone);

		// storing the user1 object in HashMap
		User putIfAbsentReturn = Collections.userMap.putIfAbsent(user1.getEmail(), user1);

		// sending feedback to the user based on putIfAbsentReturn
		if (putIfAbsentReturn != null) {
			System.out.println("The a user with that email is already in the System, select Log In");
		}

	}

	private static boolean matchCheckTechnician(String name, String password) {

		if (Technician.technicianName[0].equals(name) && password.contentEquals("Technician_admin")) {
			return true;
		}
		if (Technician.technicianName[1].equals(name) && password.contentEquals("Technician_admin")) {
			return true;
		}
		if (Technician.technicianName[2].equals(name) && password.contentEquals("Technician_admin")) {
			return true;
		}
		if (Technician.technicianName[3].equals(name) && password.contentEquals("Technician_admin")) {
			return true;
		}
		if (Technician.technicianName[4].equals(name) && password.contentEquals("Technician_admin")) {
			return true;
		} else {
			return false;
		}
	}

	// matchCheck method to go through the whole userMap hash map to check for a
	// match
	public static boolean matchCheck(String email, String password) {

		// needs to go through the hash map user map and check the email and password

		// System.out.println(userMap.get(email).getEmail());

		if (Collections.userMap.containsKey(email)) {

			System.out.println("email is correct");

			System.out.println("\n");
			System.out.println("this is the password: " + Collections.userMap.get(email).getPassword());
			System.out.println("\n");

			if (Collections.userMap.get(email).getPassword().equals(password)) {
				System.out.println("password is correct");
				return true;
			}

		}

		return false;

	}

}
