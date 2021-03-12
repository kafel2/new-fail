package class07;

import java.util.Scanner;

public class NWUsingIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("2please enter 2 numbers");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		System.out.println("please enter an operator");
		char oper = sc.next().charAt(0);
		double res = 0;
		
		if (oper=='+') {
			res = num1+num2;
		}else if (oper=='-') {
			res = num1-num2;
		}else if (oper == '*') {
   		}else if (oper =='/') {
   			res = num1/ num2;}else {
   				res =0;System.out.println("You entered invalid operator");
   				
		}
if (res !=0) {
	System.out.println(num1 + " " + oper + " " + num2 + " = " + res);
}
	}

}
