package class11;

public class HWTask9 {

		public static void main(String[] args) {
			int[] arrayOfNumbers = {1,2,3,4,5,6,7,8,9}; // create an array with 9 elements
			int biggestNumber = 0; // just create an integer with 0
			int secondBiggestNumber = 0; // just create an integer with 0

			for (int i : arrayOfNumbers) { // in this loop we found biggest number
			if (i > biggestNumber) { //if i bigger than previous biggestNumber value
			biggestNumber = i; // make i biggestNumber
			}
			}

			for (int i : arrayOfNumbers) { // this loop will find a second biggest number
			if (i < biggestNumber) { // if i less tan biggest number
			secondBiggestNumber = i; // make secondBiggestNumber equals i
			
			System.out.println(secondBiggestNumber); // print second biggest number
			}
			}
		}
				
}
	



	


