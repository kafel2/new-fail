package Tutor;

public class HW4 {

	public static void main(String[] args) {
	
String [][] strArray= {
		{"W", "B", "W", "B", "W", "B", "W", "B"},
		{"W", "B", "W", "B", "W", "B", "W", "B"},
		{"W", "B", "W", "B", "W", "B", "W", "B"},
		{"W", "B", "W", "B", "W", "B", "W", "B"},
		{"W", "B", "W", "B", "W", "B", "W", "B"},
		{"W", "B", "W", "B", "W", "B", "W", "B"},
		{"W", "B", "W", "B", "W", "B", "W", "B"},
		{"W", "B", "W", "B", "W", "B", "W", "B"}};
		

for(int i=0;i<strArray.length;i++) {
	for(int j=0;j<8;j++) {
		System.out.print(strArray[i][j]+" ");
	}
	System.out.println();
}
	}

}
