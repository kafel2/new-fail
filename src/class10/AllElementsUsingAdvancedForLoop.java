package class10;

public class AllElementsUsingAdvancedForLoop {

	public static void main(String[] args) {
		
		
		int[] numbers= {10,14,78,5,90};
		
		//for each,enhanced for loop,advanced for loop Used only with arrays!!!!!!! Or Collections!!!!!!!!!!!!
		
		for(int num:numbers)  {
			System.out.println(num+" ");
			
			
		}
		System.out.println();
		String[] name = { "Grey","Ali","Jose","Alec","Aman","Ozoda","Angelo","Karina","Anastsia","Alina"};
		
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]+" ");
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------");
		
		for(String n:name) {
			
			System.out.println(n+" ");
		}
		
		System.out.println();
		System.out.println("------------------------------------------------");
		
		char[] grades= {'A','B','C','D','E','F','G','H'};
		
		for(char grade:grades)  {
			System.out.println(grade +" ");
		}
		
		System.out.println();
		System.out.println("------------------------------------------");
		
		boolean[] boo= {true,false,false,false,true};
		
		for(boolean b:boo)  {
			System.out.println(b+" ");
		}
	}
	
	

}
