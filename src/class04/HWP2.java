package class04;

public class HWP2 {

	public static void main(String[] args) {
	
		boolean card=true;
		int balance=600;
		if (card)  {
			System.out.println("What is the balance on the card");
			if (balance>1000)  {
		} else {
			System.out.println("Yo can spend more");
		
		}
		} else {
			System.out.println("Would youn like to get a credit card?");
		}
		
		
		System.out.println("--------------------------------2-----------------");
		
		
		
		int years=7;
		int salary=60000;
		
		if (years>=5)   {
			System.out.println("Eligible for the bonus");
			
			if (salary>=50000) {
				System.out.println("bonus = 5000");
			} else {
				System.out.println("bonus = 3000");
				
			
			}
		} else {
			System.out.println( "not eligible for the bonus");
		}
		
	}

}
