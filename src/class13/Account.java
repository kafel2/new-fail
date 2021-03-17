package class13;

public class Account {

	String userName;
	String password;
	double balance;
	String accountNumber;
	boolean isLoggedIn;
	
	public void login(String passedUserNameWhenLogging,
			String passedPasswordWhenLogging) {
		if(userName.equals(passedPasswordWhenLogging)
				&&password.equals(passedPasswordWhenLogging)) {
			System.out.println("Welcome to bank of America your balance id "+balance);
		}else {
			System.out.println("Username or password is not correct");
		}
		
	}
	
	
	public void printInfo() {
		if(isLoggedIn) {
			System.out.println("Your Account number is "+accountNumber+" Your balance is "+balance);
		}
	}
	
	
	
}
