package Tutor;

public class MethodParametrise {

	public static void main(String[] args) {
		
	System.out.println(	bothEven(2,4));
		System.out.println(bothEven(3,4));

	}

	public static boolean bothEven(int a, int b) {
	boolean evenNumber=false;
	if(a% 2==0 && b% 2==0) {
		evenNumber=true;
	}
	return evenNumber;
	}
}
