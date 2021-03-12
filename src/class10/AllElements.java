package class10;

public class AllElements {

	public static void main(String[] args) {
		String[] names = new String[10];
		names[0] ="Grey";
		names[1] ="Ali";
		names[2] ="Jose";
		names[3] ="Alec";
		names[4] ="Ozoda";
		names[5]="Angelo";
		names[6] ="Karina";
		names[7] ="Anastsia";
		names[8] ="Alina";
						
		System.out.println(names[0]);
		
		System.out.println("---------------");
		String[] name = { "Grey","Ali","Jose","Alec","Aman","Ozoda","Angelo","Karina","Anastsia","Alina"};
		System.out.println(names[0]);
		
		System.out.println("====                         All Elements from an array          ===========");
		//how to get all elements fron an array
		for(int i=0; i<=names.length;i++)  {
			
			System.out.println(names[i]);
		}
	}

}
