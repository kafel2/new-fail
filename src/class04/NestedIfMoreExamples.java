package class04;

public class NestedIfMoreExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* if it is friday------->go to the movie,otherwise stay at home and study
//// /* if it is friday then i will check if day is 13-->if yes--->watch scary movie
 //*           if no--->watch any movie you like
  * 
  */
   
		
		
		boolean isFriday=true;
		int day=13;
		
		if(isFriday)  {
			
		System.out.println("it is a movie day!!!!");
			if(day==13)  {
				
				System.out.println("i will watch a scary movie");
			}else {
				System.out.println("i watch any available movie");
				
			}
			
		}else {
			System.out.println("i will stay home and study Java");
			
			
			
		}
		
		System.out.println("-----Example2_____");
		/*
		 * vcheck assignment and based on the score we display a message
		 * 
		 * 
		 */
		
		boolean completed=true;
		int score =88;
		
		if(completed)  {
			
			if(score>90)  {
				System.out.println("great job");
			}else if (score>80) {
				System.out.println("good job");
			}else if (score>70) {
				System.out.println("Good for trying,but study more!!!");
	
			}
			
		} else {
			System.out.println("Please make sure to complete all assignments on time");
			
			
		}
	}

}
