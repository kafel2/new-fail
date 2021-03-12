package class07;

import java.util.Scanner;

public class ScannerandLoop {

	public static void main(String[] args) {
/*
 * 
 * i want to capture your name 5 times and say hello to you
 * 
 */
		
		Scanner scan;
		String name;
		
		scan=new Scanner(System.in);
		
		int q=0;
		while(q<5)  {
		System.out.println("Please enter youe name");
		name=scan.nextLine();
		System.out. println("Hello "+name);
		q++;
		
		}
		
	}

}
