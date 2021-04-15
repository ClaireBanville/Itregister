package Menues;

import java.util.UUID;

import accounts.Technicians;

public class Submit_IT_Docket {
	private int MAX_ASSIGN = 1;
	private String description, userName;
	private int severity;
	private static UUID uniqueKey;

	public Submit_IT_Docket(UUID uniqueKey, String description, int severity, String userName) {
		// TODO Auto-generated constructor stub
		this.description = description;
		this.severity = severity;
		this.userName = userName;
		this.uniqueKey = uniqueKey;
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
	public static synchronized UUID uniqueKey()
	{
	    return uniqueKey;
	}  
		
		public void printITsubmittion() {

			System.out.printf("%s %s\n", "Issue ID:", uniqueKey);
			System.out.printf("%s %s\n", "Issue Description:", description);
			System.out.printf("%s %s\n", "Issue Severity:", severity);
			System.out.printf("%s %s\n", "Issue Reporter:", userName);
			
	}

		public void techicianITTickets() {
			
			if(severity == 1 || severity == 2){
			//assign to a random level one tech
			}
			if(severity == 3 || severity == 4){
			//assign to a random level two tech
			}
			
}

}
