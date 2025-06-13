package DAY5;

public class TrianglePattern {
	public static void main(String[] args) {
	int n = 5;
	for (int i = 0; i <n; i++) { //row
		
		for (int j = 0; j <=i; j++) { //coloumn

			System.out.print("*");
			
		}
		System.out.println("");
	}
	}
}
