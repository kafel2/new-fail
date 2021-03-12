package class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	boolean morning=true;
	
	boolean classToday=true;
	
	//is it morning?----> good morning
	//if there is class: yes---> helloo classmates
	/// otherwise--->hello my family	
	if(morning)	{
		
		
		
		System.out.println("Let me check if i hve class today");
		
		if(classToday) {
			
			System.out.println("Good morning my classmates");
			
		}else {
			
			System.out.println("good morning my family");
			
		}
	}
System.out.println("------end of the code-----");



System.out.println("-------------------------------Example 2__________________________________");




boolean anyAllergy=true;
boolean pollenAllergy=true;

String allergy="pollen";

if(anyAllergy) {
	System.out.println("lets check which allergies you have");
	if (pollenAllergy)  {
		System.out.println("do no not get close to trees");
	}else  {
		System.out.println("ok i know you do not have pollen allergy ");
	
}      }else {
	
	System.out.println("you are lucky not having anu allergies");
	
	
}

	}

}
