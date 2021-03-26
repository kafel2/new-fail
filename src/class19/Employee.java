//package class19;
//
//public class Employee {
//	private String name;
//	private String empID;
//	private double salary;
//	private String department;
//	
//	Employee(){
//		System.out.println("Important Line1 ");
//		System.out.println("Important Line2 ");
//		System.out.println("Important Line3 ");
//		System.out.println("Important Line4 ");
//		System.out.println("Important Line5 ");
//		
//	}
//	
//	public Employee {
//	    this();
//		//this.name=name;
//			this.name = ValidateName(name);
//			
//}
//	public Employee(String name,String empID) {
//
//		//this.name=name;
//		//this.name=ValidateName(name);
//			this (name);
//			this.empID = empID;
//	}
//	
//	public Employee(String name,String empID,double salary) {
//		//this.name=name;
//			//this.name = ValidateName(name);
//			//this.empID = empID;
//		    this();
//			this.salary = salary;
//	}
//
//	public Employee(String name,String empID,double salary,String department) {
///*	//this.name=name;
//		this.name = ValidateName(name);
//		this.empID = empID;
//		this.salary = salary;*/
//		this(name,empID,salary);
//		this.department = department;
//		//
//		printInfo();
//		
//		}
//	
//void printInfo() {
//	// this
//	System.out.println("Name "+name+" Employee ID"+empID);
//}
//String ValidateName(String name) {
//	if(name.length()<15) {
//		return name;
//		}else {
//			return null;
//}
//	
//	}
//}
