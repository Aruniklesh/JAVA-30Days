package DAY5;

public class Arraycontainselementornot {

	public static void main(String[] args) {
		int givenArray[] = {3,4,6,8,9,0};
		boolean found = false;
		int tofind = 7;

		for (int j : givenArray) {
			if (j== tofind) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("present");
		}
		else {
			System.out.println("Not present");
		}
	}

}
