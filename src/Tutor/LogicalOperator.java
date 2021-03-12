package Tutor;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter two Strings");
		System.out.print("word1: ");
		String str1 = scanner.nextLine();
		System.out.print("word2: ");
		String str2=scanner.nextLine();
		System.out.println("Please enter two numbers");
		System.out.print("int1: ");
		int num1 = scanner.nextInt();
		System.out.print("int2: ");
		int num2 = scanner.nextInt();
		
		if (num1 == num2 && str1.equals(str2)) {
			System.out.println("Output: AND");
		} else if (num1 == num2 || str1.equals(str2))  {
			System.out.println("OR");
		} else if (num1 != num2 && !str1.equals(str2)) {
			System.out.println("Output: NONE");	
			
		}
	}
}
