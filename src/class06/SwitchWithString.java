package class06;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* we need to identify favorite food
		 * 
		 * we need capture country from a user
		 * based on the country identify favorite food
		 * 
		 * 
		 * 
		 * 
		 */
Scanner input;
String country,food;

input=new Scanner(System.in);
System.out.println("Please enter your country");


country=input.nextLine();
switch (country.toLowerCase())  {

case "usa":
	food="burger";
	break;
case"Afganistan":
food="Kebab";
break;
case"Vietnam":
	food="Pho";
	break;
case"Poland":
	food="Pierogi";
	break;
case"Belarus":
	food="draniki";
	break;
case"Tadjiukistan":
	food="plov";
		break;
case"Mexico":
	food="tacos";
	break;
	default:
		food="uknown";
		


}



System.out.println("Your favorite food is "+food);
	}

}
