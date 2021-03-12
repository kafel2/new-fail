package class04;

public class NestedIfLastExample {

	public static void main(String[] args) {
		/*
		 * to donate
		 * you must be 18 and older,otherwise you cannot
		 * your weight must be more than 110 lbs, otherwise you cannote donate
		 * 
		 * 
		 * 
		 * 
		 *
		 * 
		 * 
		 * 
		 * 
		 */
int age=18;
double weight=120;

if (age>18)  {
	
	if (weight>110) {
		System.out.println("you can donate based on your age and weight");
	} else {
		System.out.println("you weight is too small.you can not donate");
		
	}} else {
		System.out.println("you are not eligible");
	}
	
	System.out.println();
}



	}


