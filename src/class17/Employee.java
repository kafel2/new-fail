package class17;

public class Employee {
String empID;
double salary;
String GEO="Sumair";

public static void main(String[] args) {
	
	Employee obj1=new Employee();
	obj1.empID="123";
	obj1.salary=150000;
	System.out.println( obj1.empID+" salary "+obj1.salary+" Geo "+obj1.GEO);
	
	Employee obj2=new Employee();
	obj2.empID="456";
	obj2.salary=180000;
	System.out.println( obj2.empID+" salary "+obj2.salary+" Geo "+obj2.GEO);
	
	
}
}
