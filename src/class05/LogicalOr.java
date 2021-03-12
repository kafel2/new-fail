package class05;

public class LogicalOr {

	public static void main(String[] args) {
		/* variable day
		 * 
		 * if day is Tuesday or Wendsday----> Manual class
		 * if day Monday or Friday---> no class
		 * if dayu saturday or sunday--->Java clas
		 * if day is thursday----.review class
		 * 
		 */
String day="Monday";


if(day.equals("Monday")   ||    day.equals("Friday"))  {
	System.out.println("Today i have no class");
	
   } else if(day.equals("Tuesday")  || day.equals(" Wednesday"))   {
	   System.out.println("Today i have Manual clas");
   }else if (day.equals("Thursday"))  {
	   System.out.println("Today i have JAVA class");
	   
   }else {
	   System.out.println(day +" is invalid");
   	
}
	}

}
