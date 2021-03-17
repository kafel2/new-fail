package class14;

public class MoreMethodsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoreMethodExamples obj1 = new MoreMethodExamples();
		
		System.out.println(obj1.print());
		System.out.println(obj1.doubleTheValue(10));
		obj1.isRaining(true);
		//System.out.println(obj1.isRaining(true))); error as we are not return
		
		obj1.print5times();
		System.out.println(obj1.returnGreater(122, 56));
		
		obj1.printEvenOdd(5);
		
		double [] arr= {10.2,25,30};
		
		System.out.println(obj1.returnTheArraySum(arr));
		
		/// break
		
		System.out.println(obj1.isMirror("aba"));
		System.out.println(obj1.isMirror("abcdef"));
	}

}
