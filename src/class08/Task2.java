package class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 
 * 
 * 
 * create a program that will keep asking user to apply for a credit card
 * as soon you get "yes" from a user program should stop asking
 * 
 */
		
	Scanner input = new Scanner(System.in);
	String answer;
	
	do {
		System.out.println("Please apply for a credit card");
		answer=input.nextLine();
	}while (!answer.equqlsIgnoreCase("yes"));
	
	System.out.println("Okay,no more question");
	
	System.out.println("--------------------------------------Another Way----------------");
	
	System.out.println("Please applynfor a credit card");
	answer=input
	}
		
	}

}
