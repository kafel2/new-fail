package Tutor;

public class ArraysTask {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * Write a program that creates an array of integers that stores the following values:
		 *  45,78, 12, 67, 55, 89, 23, 77, 88

            Print only values that stored with even index including 0.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		public static void main(String[] args) {
         int [] intArray = new int[9];
		intArray[0] =45;
		intArray[1]=78;
		intArray[2]=12;		
		intArray[3]=67;
		intArray[4]=55;
		intArray[5]=89;
		intArray[6]=23;
		intArray[7]=77;
		intArray[8]=88;
		
		for(int i=0;i<intArray.length; i++) {
			
			if(i% 2==0) {
				System.out.print(intArray[i]+" ");
			}
		}
	}

}
