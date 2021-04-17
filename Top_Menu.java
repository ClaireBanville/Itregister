package Menues;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import accounts.User;
import accounts.Account_Storage;

public class Top_Menu {

	// creating a map of users
	private static Map<String, User> userMap = new HashMap<String, User>();

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

		while (1) {

			String email = in.next();

			if (checkEmail(email) == true) {
				break;
			}

			System.out.println("Please enter a valid email address");

		}

		System.out.println("Enter your full name:");
		while (1) {

			String name = in.next();

			if (checkUserName(name) == true) {
				break;
			}

			System.out.println("Please enter a valid");

		}

		System.out.println("Enter your Phone Number");

		while (1) {

			int phone = in.nextInt();

			if (checkPhone(phone) == true) {
				break;
			}
			System.out.println("Please enter a valid phone number");

		}

		System.out.println("Choose a password:");

		while (1) {

			String password = in.next();

			if (checkPassword(password) == true) {
				break;
			}
			System.out.println("Please enter a valid password");
		}

//		// printing out details to test
//		System.out.println("email: " + email);
//		System.out.println("Name: " + name);
//		System.out.println("Phone Number: " + phone);
//		System.out.println("Password: " + password);

		// creating a new user object according to the inputed data
		User user1 = new User(name, password, email, phone);

		// storing the user1 object in HashMap
		User putIfAbsentReturn = userMap.putIfAbsent(user1.getEmail(), user1);

		// sending feedback to the user based on putIfAbsentReturn
		if (putIfAbsentReturn != null) {
			System.out.println("The a user with that email is already in the System, select Log In");
		}

		// test print to check if the user was really stored in userMap
		System.out.println(userMap.get(email).getPhone());

	}

	// run log in method (ask for password)
	public static void logIn() {

		// make option for forgot password and password will be emailed
		// menu with option for forgotten password

		// making the scanner to take input
		Scanner in = new Scanner(System.in);

		boolean match = false;
		// starting log in loop
		while (match == false) {

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
			}
			
			// at this stage if match was changed to true then the loop will end and it will then proceed to the logged in menu
		}

		// need to make a way to pass through which user is being logged in so it can be linked with the user in the logged in menu
		Logged_In_Menu.main(null);

	}

	// matchCheck method to go through the whole userMap hash map to check for a
	// match
	public static boolean matchCheck(String email, String password) {

		return false;
	}

}