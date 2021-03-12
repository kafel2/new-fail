package class07;

import java.util.Scanner;

public class LoteryWithWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input;
		int num;
		int lotteryNumber=17;
		
		input=new Scanner(System.in);
		System.out.println("Plese enter any number 1 to 100 to win the lottery");
num=input.nextInt();

while (num!=lotteryNumber ) {
	
	System.out.println("Please enter any number from 1 to 100 to win the lottery");
	
	System.out.println("congratulation you entered" +num +" which is a lucky number");
}
	}

}
