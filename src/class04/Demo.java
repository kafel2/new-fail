package class04;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int i=10;
		String str="Hello";
		
		Scanner scan=new Scanner(System.in);
				System.out.println("please enter any text");
				String text=scan.nextLine();//scan.nextLine(
				//---->capture your input from console'
				//once you enter text you must hit Enter
		
		System.out.println("Text that i entered is -"+text);
        
        
        System.out.println("Please enter your name");
        String name=scan.next();//captures 1 word till space
        
        System.out.println("Nice to meet you" +name);
        System.out.println("please enter your age");
        int age=scan.nextInt();
        System.out.println("My name is "+name+" and i am "+age+ "years old");
        
        
	}

}
