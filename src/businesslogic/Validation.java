package businesslogic;

public class Validation {
	
	public  boolean adminLogin(String username,String password) {
		if(username.equals("admin") && password.equals("admin"))
			return true;
	else 
			return false;
	}

}
