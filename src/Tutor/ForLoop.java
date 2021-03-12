package Tutor;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
	int end;
	Scanner scanner=new Scanner(System.in);
	end=scanner.nextInt();
	
	for (int i = 0; i < end*2; i++) {
		System.out.print(i+" ");
	}
	

	}

}
