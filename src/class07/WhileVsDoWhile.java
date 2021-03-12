package class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1;
		
		while(num<=5)  {
			System.out.println(num);
			num ++;
		}
		System.out.println("------------------- Do while----------------");
		
		int num1=1;
		
		do {
			System.out.println(num1);
			num1++;
		}while(num1<=5);
			
		/*
		 * 
		 * while=first check then execute
		 * do =first execure then check
		 * 
		 * even when vondition is false do will execute your code AT LEAST ONCE
		 * 
		 */
		
		
			
	}
}
