package class12;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 
 * 
 * 
 * Write a Java Program to print the first 10 numbers of Fibonacci series.
 */
		
		int a=0;
		int b=1;
		int c;		
		for (int i=1; i<=10; i++) {
			
			 System.out.println(a+" ");
			
	    c=a+b;
	    
	    a=b;
	    b=c;
	    
	   
	    
	    
		}
		
		System.out.println("---------------------------------------Another Way-------------------------");
		
		int f1=0;
		int f2=1;
		
		for(int f=1; f<=20; f++)  {
			
			System.out.println(f1+" ");
			f1=f1+f2;
			f2=f1-f2;
		}
		
	}
	
	
	
	
	
	
		
	}


