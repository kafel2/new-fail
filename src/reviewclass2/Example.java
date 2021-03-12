package reviewclass2;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userName ="Salma";
		String password="Salma123";
		boolean isAllowd=true;
		double accountBalance=1000;
		double amaountToTransfer=3000;
		
		
		if(userName.equals("Salma"))  {
			
			
			if(password.equals("Salma123")) { 
			
				
					System.out.println("Welcome to bank of America");
					if(accountBalance>=amaountToTransfer)  {
						System.out.println("Amount transfered");
						
					}else {
						System.out.println("Insufficient balance");
						
					}
		}else {
			
			
			System.out.println("Incorrect password");
		}
		
		
		}else {
			System.out.println("yput username is not correct please try again later");
		}
	
		

	}

}
