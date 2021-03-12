package class07;

import java.util.Scanner;

public class DoOrWhile {

	public static void main(String[] args) {

/*
 * 
 * 
 * we play lottery we have a win number which is 17
 * we need to keps a user to enter any number from 1 to 100
 * until correct number is entered
 */
		
		
		Scanner input;
		int num;
		int lotteryNumber=17;
		input=new Scanner(System.in);
		
		System.out.println("Please enter any number from 1 to 100 to win the lottery");
		num=input.nextInt();
		
		do {
			System.out.println("Please enter any number from1 to 100 to win the lottery");
			num=input.nextInt();
			
		}while(num!=lotteryNumber);
		
		System.out.println("congratulation you entered  "+num+" which is a lucky number");
		}
	}


