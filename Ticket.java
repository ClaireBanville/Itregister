package Accounts;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Menus.Logged_In_Menu_Technician;
import Accounts.Collections;
import Accounts.Technician;

public class Ticket {

	private static final Scanner sc = new Scanner(System.in);
	
	private  String description, userName, randomValue, randomValue2;
	private  String status;
	private  int severity;
	private  Date date;

	private static int uniqueKey;

	// String userName add back into array once Top menu is functional

	public Ticket(int uniqueKey, String description, int severity, String userName, String randomValue,
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

	public  String getDescription() {
		return description;
	}

	public  int getSeverity() {
		return severity;
	}

	public  String getuserName() {
		return userName;
	}

	public  int getuniqueKey() {
		return uniqueKey;
	}

	public  String getRandomValue() {
		return randomValue;
	}

	public  String getRandomValue2() {
		return randomValue2;
	}

	public  String getStatus() {
		return status;
	}

	public Date getDate() {
		return date;
	}
	
	
	// status setter
	public void setStatus(String status)
	{
		this.status = status;
	}
	

//	//used within addITSUbmission to feedback to the user what they have just submitted
//	public static void printITsubmittion() {
//		//Prints details of the submitted IT Docket
//				System.out.printf("%s %s\n", "Ticket ID: ", uniqueKey);
//				System.out.printf("%s %s\n", "Ticket Status: ", status);
//				System.out.printf("%s %s\n", "Issue Description:", description);
//				System.out.printf("%s %s\n", "Issue Severity:", severity);
//				System.out.printf("%s %s\n", "Issue Reporter:", userName);
//				System.out.printf("%s %s\n", "Date Submitted:", date);
//
//			}
//
//		}
	

	
}
