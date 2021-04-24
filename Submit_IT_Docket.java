package Menues;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class Submit_IT_Docket {

	private static final Scanner sc = new Scanner(System.in);
	//private static final Submit_IT_Docket[] itsubmittions = new Submit_IT_Docket[1000];
	//private static int submittionCount = 0;
	public static Map<String, Submit_IT_Docket> submittionMap = new HashMap<String, Submit_IT_Docket>();
	private static String description, userName, randomValue, randomValue2;
	private static String status;
	private static int severity;
	private static Date date;

	private static String uniqueKey;

	// String userName add back into array once Top menu is functional

	public Submit_IT_Docket(String uniqueKey, String description, int severity, String userName, String randomValue,
			String randomValue2, String status, Date date) {
		// TODO Auto-generated constructor stub
		this.description = description;
		this.severity = severity;
		this.userName = userName;
		this.uniqueKey = uniqueKey;
		this.randomValue = randomValue;
		this.randomValue2 = randomValue2;
		this.status = status;
		this.date = date;
	}

	public static String getDescription() {
		return description;
	}

	public static int getSeverity() {
		return severity;
	}

	public static String getuserName() {
		return userName;
	}

	public static String getuniqueKey() {
		return uniqueKey;
	}

	public static String getRandomValue() {
		return randomValue;
	}

	public static String getRandomValue2() {
		return randomValue2;
	}

	public static String getStatus() {
		return status;
	}

	public Date getDate() {
		return date;
	}

	public static void printITsubmittion() {
//Prints details of the submitted IT Docket
		System.out.printf("%s %s\n", "Ticket ID: ", uniqueKey);
		System.out.printf("%s %s\n", "Ticket Status: ", status);
		System.out.printf("%s %s\n", "Issue Description:", description);
		System.out.printf("%s %s\n", "Issue Severity:", severity);
		System.out.printf("%s %s\n", "Issue Reporter:", userName);
		System.out.printf("%s %s\n", "Date Submitted:", date);

	}

	public static void techicianITTickets() {

		if (severity == 1 || severity == 2) {
			// assigns to a random level one tech
			System.out.printf("%s %s\n", "Ticket ID: ", uniqueKey);
			System.out.printf("%s %s\n", "Ticket Status: ", status);
			System.out.printf("%s %s\n", "Issue Description:", description);
			System.out.printf("%s %s\n", "Issue Severity:", severity);
			System.out.printf("%s %s\n", "Issue Reporter:", userName);
			System.out.printf("%s %s\n", "Assigned Technician:", randomValue);
			System.out.printf("%s %s\n", "Date Submitted:", date);

		}
		if (severity == 3 || severity == 4) {
			// assigns to a random level two tech
			System.out.printf("%s %s\n", "Ticket ID: ", uniqueKey);
			System.out.printf("%s %s\n", "Ticket Status: ", status);
			System.out.printf("%s %s\n", "Issue Description:", description);
			System.out.printf("%s %s\n", "Issue Severity:", severity);
			System.out.printf("%s %s\n", "Issue Reporter:", userName);
			System.out.printf("%s %s\n", "Assigned Technician:", randomValue2);
			System.out.printf("%s %s\n", "Date Submitted:", date);

		}
	}

	public void archive() {
		int input;
		if (status == "resolved") {

			System.out.println("Enter Ticket Number:");
			input = sc.nextInt();

				//if (i == input) {
					status.replace("resolved", "Closed");
					System.out.println();
			//	}
			}
		}
	

	public static void updateStatus() {

		String input;
		String newStatus = "";

		System.out.println("Enter Ticket ID:");
		input = sc.nextLine();
		
		if(input == uniqueKey) {
		System.out.println("Enter new status (Select from the list below):");
		System.out.println("- To do \n- Inprogress \n - Resolved");
		newStatus = sc.next();
		submittionMap.remove(status);
		submittionMap.put(newStatus, null);
		}
		else {
			System.out.println("Ticket ID" + input + "does not exist");
			Logged_In_Menu_Technicians.runLoggedInMenuTechnicians(newStatus);
		}
	}
}


