package AssignmentD10;

public class LogIn {

	private String username;
	private String password;
	
	public LogIn(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public void validate() throws InvalidUsernameException ,InvalidPasswordException{
		if(username == null || username.isEmpty()) {
			throw new InvalidUsernameException("Username can not be null or Empty:");
		}else if(password.length() < 8) {
			throw new InvalidPasswordException("Password must be at least 8 characters long");
		}else if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            throw new InvalidPasswordException("Password must contain at least one special character");
        }

	}
	
	
}
