package Tutor;

public class Array2D2 {

	public static void main(String[] args) {
		double[][] someArray= {
				{2.8,4.0,6.6,4.0},
				{8.0,3.0,12.2,2.0},
				{2.4,6.2,8.0,3.2}};
		
for(int i =0;i<someArray.length;i++) {
	for(int j=0;j<4;j++) {
		System.out.print(someArray[i][j]);
	}
	System.out.println();
}

	}

}
