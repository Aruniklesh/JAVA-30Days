package DAY5;

public class Smallestnuminanarray {

	public static void main(String[] args) {
		int [] arraygiven = {45,678,9,4,24,5,67,8};
		
		int smallest = Integer.MAX_VALUE;
		
		for (int i = 0; i < arraygiven.length; i++) {
			if (arraygiven[i] < smallest) {
				smallest = arraygiven[i];
			}
			
		}
		System.out.println(smallest);

	}

}
