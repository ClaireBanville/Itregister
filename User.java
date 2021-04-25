package Accounts;

public class User {

	private static String userName;
	private String password;
	private String email;
	private String phoneNumber;
	
	public User (String user, String pass, String em, String no) {
		
		userName = user;
		password = pass;
		email = em;
		phoneNumber = no;
		
	}
	
	public static String getUser(){
		
		return userName;
		
	}
	public String getPassword(){
			
		return password;
			
		}
	
	public String getEmail(){
		
		return email;
		
	}
	public String getPhone(){
		
		return phoneNumber;
		
	}
	
}
