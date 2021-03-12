package class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
	
		//Create a Jva programm that will ask if user has a credit card or not
		//If you user does not have a credit card then offer them.
		// if they do have one ask what is balance on the card?
		//	if balance of the card is longer than 100,tell the
		
		
		
String creditCard;
double balance;
Scanner scan;

scan=new Scanner(System.in);

System.out.println("Do you have a credit card");
creditCard=scan.next();

if (creditCard.equalsIgnoreCase("yes")) {
	System.out.println("What is the balance on th cc?");
	balance=scan.nextDouble();
	
	double balance1=scan.nextDouble();
	if(balance1>1000) {
		System.out.println("pay off immediatly");
	}else {
		System.out.println("spend more");
	}
}else {
		System.out.println("would you like a credit card");
	}
}

	}

