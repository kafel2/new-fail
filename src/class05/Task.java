package class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
	Scanner input;
	double height;
	
	input = new Scanner(System.in);
	System.out.println("Please enter your age height in inches");
	height=input.nextDouble();
	if(height < 60)  {
		System.out.println("Your height is short");
	}else if (height>=60 && height <=72)  {
		System.out.println(("Your height is tall"));
		
		
		
			
		
	System.out.println("-------------------------2------------------------------");
	////2
	
	
	
		
Scanner scan=new Scanner(System.in);
System.out.println("Enter your day");
int day=scan.nextInt();
if(day<=1  || day<=5)  {
	System.out.println("weekday");
}else if (day==6 || day==7)  {
	System.out.println("weekend");
}else {
	System.out.println("invalid day");
}
		
	}
	

	}

}
