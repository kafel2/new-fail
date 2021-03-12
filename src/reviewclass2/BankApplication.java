package reviewclass2;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String userName;
		String password;
		System.out.println("Please Enter your Username");
		Scanner scaner=new Scanner(System.in);
		userName=scaner.next();
		System.out.println("Please Enter your password");
		password=scaner.next();
		
		
		
		double accountBalance=1000;
		double amaountToTransfer;
		
		
		if(userName.equals("Salma"))  {
			
			
			if(password.equals("Salma123")) { 
			
				
					System.out.println("Welcome to bank of America");
					System.out.println("Please Enter the amaount to transfer");
					amaountToTransfer=scaner.nextDouble();
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
