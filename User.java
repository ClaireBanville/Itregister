public class User {

	private String userName;
	private String password;
	private String email;
	private int phoneNumber;
	
	public User (String user, String pass, String em, int no) {
		
		userName = user;
		password = pass;
		email = em;
		phoneNumber = no;
		
	}
	
	public String getUser(){
		
		return userName;
		
	}
	public String getPassword(){
			
		return password;
			
		}
	
	public String getEmail(){
		
		return email;
		
	}
	public int getPhone(){
		
		return phoneNumber;
		
	}
	

	
	
	
	
	
}
