package class05;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*we have to ident is smal,medium,large,xlarge
 * if number between 1 and 10--> small
 * if number between 11 and 100--->medium
 * if number between 101 and 1000---.large
 * if number between 1001 till 100000--->xlarge
 * 
 * 
 * 
 */
		
		
		
		int num=2000000;
		if (num<1)  {
			System.out.println("Number is 0 or negative");
		}
		if (num>=1 && num <=10) {
			
			System.out.println(num +"is a small number");
			
		}else if(num>=11 && num<=100  ) {
			System.out.println(num +" is a medium number");
		}else if(num<=101 && num<=1000)  {
			System.out.println(num +" is a Large number");
		} else if (num>= 1001 && num <=100000)  {
			
			System.out.println(num +" is a xlarge number");
		
		}else {
			System.out.println(num+" is a huge number");
			
			
			
		}
	}

}
