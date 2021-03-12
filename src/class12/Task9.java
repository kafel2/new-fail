package class12;

public class Task9 {

	public static void main(String[] args) {
	
		
		
		
		
      int[] arr2= {10,200,3,45,89,76,45,125,36,145};
		
		int large, secondLarge;
		
		large=arr2[0];//10
		secondLarge=arr2[0];//10
		
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]>large) {
				secondLarge=large;
				large=arr2[i];
			}else if(arr2[i]>secondLarge) {
				secondLarge=arr2[i];
			}
			
		}
		System.out.println("Largest num is "+large);
		System.out.println(secondLarge);
	}

}
