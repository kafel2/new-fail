package Tutor;

public class Arrays2D {

	public static void main(String[] args) {
		double[][] someArray = {{1.4,2.0,3.3,2.0},{4.0,1.5,6.1,1.0},{1.2,3.1,4.0,1.6}};
		for(int i=0;i<someArray.length;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(someArray[i][j]+" ");
			}
			System.out.println();
		}
	}

}
