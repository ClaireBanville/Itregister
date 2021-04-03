package Menues;

import java.util.Scanner;

public class Top_Menu {

	public static void main(String[] args) {
		
		System.out.println("Select an option:");
		System.out.println("1. Register a new account");
		System.out.println("2. Log In");
		
		// take input 
		 Scanner in = new Scanner(System.in);
		
		int menuSelection = in.nextInt();
		
		// process input
		switch(menuSelection) {
		
		case 1: // Register for an account
			System.out.println("Input your details to register:");
			
			// run account register method
			
			break;
			
		case 2: // log in, go to logged in menu
			System.out.println("Logging you in.....");
			
			// run logged in menu
			
			break;
			
		default:

            System.out.println("Invalid choice.");
			
		}
		
		in.close();
		
		

	}

}
