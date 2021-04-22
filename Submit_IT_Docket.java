package Menues;

import java.util.Date;

public class Submit_IT_Docket {
	private String description, userName, randomValue, randomValue2, status;
	int severity;
	private Date date;
	private static String uniqueKey;

	// String userName add back into array once Top menu is functional

	public Submit_IT_Docket(String uniqueKey, String description, int severity, String userName, String randomValue, String randomValue2, String status, Date date) {
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

	public String getDescription() {
		return description;
	}

	public int getSeverity() {
		return severity;
	}

	public String getuserName() {
	return userName;
	}

	public static String getuniqueKey() {
		return uniqueKey;
	}

	public String getRandomValue() {
		return randomValue;
	}
	
	public String getRandomValue2() {
		return randomValue2;
	}
	public String getStatus() {
		return status;
	}
	public Date getDate() {
		return date;
	}
	
	
	public void printITsubmittion() {
//Prints details of the submitted IT Docket
		System.out.printf("%s %s\n", "Ticket ID: ", uniqueKey);
		System.out.printf("%s %s\n", "Ticket Status: ", status);
		System.out.printf("%s %s\n", "Issue Description:", description);
		System.out.printf("%s %s\n", "Issue Severity:", severity);
		System.out.printf("%s %s\n", "Issue Reporter:", userName);
		System.out.printf("%s %s\n", "Date Submitted:", date);
		

	}

	public void techicianITTickets() {

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
}
