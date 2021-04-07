package Menues;

import java.util.regex.*;

public boolean checkUserName(String name) {
	
	String regex = "^[a-zA-Z0-9._-]{3,}$";
	
	Pattern p = Pattern.compile(regex);
	
	if (name == null) {
		
		return false;
		
	}
	
	Matcher m = p.matcher(name);
	  
    return true;
	
}

public boolean checkPassword(String pass) {
	
	
	String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
	
	Pattern p = Pattern.compile(regex);
	
	if (pass == null) {
		
		return false;
		
	}
	
	Matcher m = p.matcher(pass);
	  
    return true;
	
	
}

public boolean checkEmail(String email) {
	
	
	String regex = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|"
			+ "\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\"
			+ "x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?"
			+ "\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9]"
			+ "[0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])"
			+ "|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\"
			+ "x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
	
	Pattern p = Pattern.compile(regex);
	
	if (email == null) {
		
		return false;
		
	}
	
	Matcher m = p.matcher(email);
	  
    return true;
	
}

public boolean checkPhone(int ph) {
	
	
	String regex = "^(?:\\+?(61))? ?(?:\\((?=.*\\)))?(0?[2-57-8])\\)? ?(\\d"
			+ "\\d(?:[- ](?=\\d{3})|(?!\\d\\d[- ]?\\d[- ]))\\d\\d[- ]?\\d"
			+ "[- ]?\\d{3})$";
	
	Pattern p = Pattern.compile(regex);
	
	if (ph == null) {
		
		return false;
		
	}
	
	Matcher m = p.matcher(ph);
	  
    return true;
	
}
}
