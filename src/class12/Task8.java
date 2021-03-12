package class12;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Maximum and minimum number in the array?
 * 
 * 
 */
		int[] largeArray = { 158698, 564, 7894, 10,50,5 };
		int smallest=largeArray[0];
		int largest=largeArray[0];
		
		for(int i=1; i<largeArray.length; i++) {
			if(largeArray[i]<smallest) {
				smallest=largeArray[i];
			}
			if(largeArray[i]>largest) {
				largest=largeArray[i];
			}
		}
		
		System.out.println(smallest+" is minimum number in the array");
		System.out.println(largest+" is maximum number in the array");	
		
	}
	}

