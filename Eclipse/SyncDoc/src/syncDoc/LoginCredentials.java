package syncDoc;

public class LoginCredentials {
	final String username = "username";
	final String password = "password";
	boolean checkCredentials(String uname, String pword) {
		return username.equals(uname) && password.equals(pword);
	}
}
