package Accounts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import Accounts.Ticket;
import Menus.Logged_In_Menu_Technician;

public class Collections {

	// creating a map of users
	public static Map<String, User> userMap = new HashMap<String, User>();

	// collection of Tickets
	public static ArrayList<Ticket> ticketList = new ArrayList<Ticket>();

	// methods altering and printing things in ticketList

	public static void printAllUsersTickets(String currentlyLoggedInEmail) {

		int i;

		for (i = 0; i < ticketList.size(); i++) {

			if (ticketList.get(i).getuserName().equals(currentlyLoggedInEmail)) {
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

	}

	public static void printAllTechnicionTickets(String currentLoggedInName) {
		// Prints details of the submitted IT Ticket

		// getting the currentLoggedInName in ticketList
		if (currentLoggedInName.contentEquals(Technician.POSSIBLE_VALUES[0])
				|| currentLoggedInName.contentEquals(Technician.POSSIBLE_VALUES[1])
				|| currentLoggedInName.contentEquals(Technician.POSSIBLE_VALUES[2])) {
			// it is a level 1 technician, so checking randomValue
			// need to go through the ticketList and print all the tickets corresponding to
			// the technicion name currently logged in
			for (int i = 0; i < Collections.ticketList.size(); i++) {

				if (Collections.ticketList.get(i).getRandomValue().equals(currentLoggedInName)) {
					System.out.printf("%s %s\n", "Ticket ID: ", Collections.ticketList.get(i).getuniqueKey());
					System.out.printf("%s %s\n", "Ticket Status: ", Collections.ticketList.get(i).getStatus());
					System.out.printf("%s %s\n", "Issue Description:", Collections.ticketList.get(i).getDescription());
					System.out.printf("%s %s\n", "Issue Severity:", Collections.ticketList.get(i).getSeverity());
					System.out.printf("%s %s\n", "Issue Reporter:", Collections.ticketList.get(i).getuserName());
					System.out.printf("%s %s\n", "Date Submitted:", Collections.ticketList.get(i).getDate());
					System.out.printf("\n");
					System.out.printf("\n");
				}
			}
		} else {
			// it is a level 2 technician, so checking randomValue2
			// need to go through the ticketList and print all the tickets corresponding to
			// the technicion name currently logged in
			for (int i = 0; i < Collections.ticketList.size(); i++) {

				if (Collections.ticketList.get(i).getRandomValue2().equals(currentLoggedInName)) {
					System.out.printf("%s %s\n", "Ticket ID: ", Collections.ticketList.get(i).getuniqueKey());
					System.out.printf("%s %s\n", "Ticket Status: ", Collections.ticketList.get(i).getStatus());
					System.out.printf("%s %s\n", "Issue Description:", Collections.ticketList.get(i).getDescription());
					System.out.printf("%s %s\n", "Issue Severity:", Collections.ticketList.get(i).getSeverity());
					System.out.printf("%s %s\n", "Issue Reporter:", Collections.ticketList.get(i).getuserName());
					System.out.printf("%s %s\n", "Date Submitted:", Collections.ticketList.get(i).getDate());
					System.out.printf("\n");
					System.out.printf("\n");

				}
			}
		}

	}

	public static void startArchiveTimer(int TicketNumber)
			{
				for (int i = 0; i < Collections.ticketList.size(); i++) {

					if (Collections.ticketList.get(i).getuniqueKey() == TicketNumber)
					{
						
					}
						
				}
			}

//			public void archive() {
//				int input;
//				if (status == "resolved") {
//
//					System.out.println("Enter Ticket Number:");
//					input = sc.nextInt();
//
//					// if (i == input) {
//					status.replace("resolved", "Closed");
//					System.out.println();
//					// }
//				}
//			}
//
//			public static void updateStatus() {
//
//				String input;
//				String newStatus = "";
//
//				System.out.println("Enter Ticket ID:");
//				input = sc.nextLine();
//
//				if (input.equals(uniqueKey)) {
//					System.out.println("Enter new status (Select from the list below):");
//					System.out.println("- To do \n- Inprogress \n - Resolved");
//					newStatus = sc.next();
//					submittionMap.remove(status);
//					submittionMap.put(newStatus, null);
//				} else {
//					System.out.println("Ticket ID" + input + "does not exist");
//					Logged_In_Menu_Technician.runLoggedInMenuTechnicians(newStatus);
//				}
//			}

}
