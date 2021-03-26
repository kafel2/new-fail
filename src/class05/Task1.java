package class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		//Prompt the user to enter person heights in inches. Person should be classified as one of the following:
			//short (under 60 inch)
			///medium(between 60 -72 inch)
			///tall (over 72 inch)
		
		
		
		Scanner pp=new Scanner(System.in);
		int height;
		
		System.out.println("Please enter your age height in inches");
		height=pp.nextInt();
		if(height < 60)  {
			System.out.println("Your are aperson who's height  short");
		}else if (height > 60 && height <=72)  {
			System.out.println("Your are person who's height medium");
			
			

	}

}
	}
