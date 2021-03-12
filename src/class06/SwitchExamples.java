package class06;

public class SwitchExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * store gender using M or F
		 * based on the gender we will specify
		 * if M--->Male
		 * If F__>female
		 * otherwise --->not sure
		 * 
		 * 
		 * 
		 * 
		 */
		
		char gender='A';
		String description;
		switch(gender)  {

		case'M':
			description="Male";
			break;
		case 'F':
			description="Female";
			break;
			default:
				description="N/A";
				
				
				
				
		
	}
System.out.println(description);




/*
 * limitation
 * switch cannot use Relational or logical Operators(it simply check
 * 
 * 
 * switch cannot be used with boolean,double.float.long
 */


boolean sunny=true;
if(sunny) {
	System.out.println("i am happy");
	
	
	
	double price=10.99;
	if (price>10) {
		System.out.println("Too expensive");
		
		
	}
}
}
}