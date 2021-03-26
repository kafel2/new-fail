package class18;

public class Task3 {
private static String voweIsOnly(String input) {
	
	return input.replace ("[^a,e,i,o,u]", "");
}
	public static void main(String[] args) {

/*
 * 
 * 
 * Create a method that will accept a String as a parameter and return a new 
 * String that consist only of vowels. 
Method should be available inside the class only where
 it was declared and executed by calling it is name.
 */
 System.out.println(voweIsOnly("ashgar"));
	}
}
