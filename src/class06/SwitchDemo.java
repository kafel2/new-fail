//package class06;
//
//public class SwitchDemo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int day =7;
//		
//		String weekDay;
//		
//		
//		if(day==1 ) {// work with condition. it evaluates if cindition true or false
//			weekDay="Monday";
//		}else if (day==2)  {
//			weekDay ="Tuesday";
//		}else if (day==3)  {
//			weekDay="Wednesday";
//		}else if (day==4) {
//			weekDay="Thursday";
//		}else if (day==5) {
//		
//		weekDay="Friday";
//	}else if (day==6) {
//		weekDay=("Saturday");
//	} else if(day==7) {
//		weekDay=("Sunday");
//		
//	} else {
//		weekDay="InvaLid";
//		
//		if (!weekDay.equals("InvaLid"))  {
//			System.out.println("Today is " + weekDay);
//			
//			
//			System.out.println("-------------------------------using switch                    ");
//			
//			String weekDay1;
//			
//			switch(day) {// is a value based
//			// we CANNOT have duplicate cases
//			// values MUSTmatch a variable type
//			// wev MUST have break in every case
//			
//			case 1:
//				weekDay1="Monday";
//				break;
//			case 2:
//			weekDay1="Tuesday";
//			break;
//			case 3:// it jumps away to matching case
//				weekDay1="Wednesday";
//				break;
//			case 4:
//				weekDay1="Thursday";
//				break;
//			case 5:
//				weekDay1="Friday";
//				break;
//			case 6:
//				weekDay1="saturday"; 
//				break;
//			case 7:
//				weekDay1="Sunday";
//				break;
//				default:
//					weekDay1="Invalid";
//					break;
//					
//				
//					if (!weekDay.equals("Invalid")) {
//						
//					}
//					
//					System.out.println("Today is "+weekDay1);
//				
//				
//			
//					}
//			}
//						
//		
//			
//		
//		
//	
//
//	
