package Menues;

public class Submit_IT_Docket {
	private String description;
	private int severity;

	public Submit_IT_Docket(String description, int severity) {
		// TODO Auto-generated constructor stub
		this.description = description;
		this.severity = severity;
	}
	
	public String getDescription() {
		return description;
	}

	public int getSeverity() {
		return severity;
	}
		
		public void printITsubmittion() {

			System.out.printf("%s %s\n", "Issue Description:", description);
			System.out.printf("%s %s\n", "Issue Severity:", severity);
	}

}