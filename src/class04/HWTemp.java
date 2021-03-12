package class04;

import java.util.Scanner;

public class HWTemp {

	public static void main(String[] args) {
	
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the city");
		String city=scan.nextLine();
		System.out.println("Enter the temprature");
		Scanner input=new Scanner(System.in);
		int temp=input.nextInt();
		temp=(temp-40)/2;
		System.out.println("The temperature in the "+city+" is "+temp+" degrees  Celsius");
		
		
	}

}
