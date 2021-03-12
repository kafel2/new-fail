package reviewclass3;

import java.util.Scanner;

public class LogicalOperatorss4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your password");
		String pass=scanner.next();
		System.out.println("Enter the amaount of money that you want to transfer");
		double transferAmount=scanner.nextDouble();
		if(pass.equals("pass123")&& transferAmount<1000) {
			System.out.println("Enter true to check your balance and false  to close the application");
			boolean nextOp=scanner.nextBoolean();
			if(nextOp)  {
				System.out.println("Hello this is Zanna");
			}
		}
	}

}
