package reviewclass3;

import java.util.Scanner;

public class LogicalOperators3 {

	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your password");
		String pass=scanner.next();
		System.out.println("Enter the amaount of money that you want to transfer");
		double transferAmount=scanner.nextDouble();
		if(pass.equals("pass123")&& transferAmount<1000) {
			System.out.println("Amaount transfered");
		}else {
			System.out.println("Either your password is not corect or you do not have enough balance");
		}
		
		if(pass.equals("pass123")){
			System.out.println("Enter the amount that you want to transfer");
			transferAmount=scanner.nextDouble();
			if(transferAmount<1000)  {
				System.out.println("Amount transfered");
			
		}else {
			System.out.println("Not enough balance");
		}

		}else{
			System.out.println("password is not correct");
		
	}
	
}
	
	
}