package AssignmentD10;

public class UseLogIn {

	public static void main(String[] args) {
		try {
			LogIn login = new LogIn("John", "John123");
			login.validate();
		} catch(InvalidUsernameException e) {
			System.out.println(e.getMessage());
		}catch(InvalidPasswordException e) {
			System.out.println(e.getMessage());
		}
		
		try {
            LogIn login2 = new LogIn(null, "password!");
            login2.validate();
        } catch (InvalidUsernameException e) {
            System.out.println(e.getMessage());
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
		
		try {
            LogIn login3 = new LogIn("username", "pass!");
            login3.validate();
        } catch (InvalidUsernameException e) {
            System.out.println(e.getMessage());
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
		
		try {
            LogIn login4 = new LogIn("username", "password1!");
            login4.validate();
            System.out.println("Login is valid");
        } catch (InvalidUsernameException e) {
            System.out.println(e.getMessage());
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }

	}

}
