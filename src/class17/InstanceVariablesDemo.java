package class17;

public class InstanceVariablesDemo {
int number=10;//instance variables
void printNumber() {
	System.out.println(number);
	String name="Ashgar";
}
void printNumbers2() {
	System.out.println(number);
	//System.out.println(name); CE
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceVariablesDemo obj=new InstanceVariablesDemo();
		System.out.println(obj.number);
	}

}
