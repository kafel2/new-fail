package class11;

public class Task3 {

	public static void main(String[] args) {
		String[][] cars= {
				{"Doodge","Chevrolet","Ford"},
				{"Mercedes","Volsfagen","BMW"},
				{"Hyundai","Kia","Honda"},
				{"Fiat","Lamborgini","Maserati"}
		};
		
		for (int r=0; r<cars.length;r++) {
			for(int c=0; c<cars[r].length;c++) {
				System.out.println(cars[r][c]+" ");
			}
		System.out.println();
		}
		System.out.println("------------------------------Each loop----------------");
		
		for(String[] brands:cars) {
	
		System.out.println(cars+" ");
		}
		System.out.println();
	}
	
	
}

