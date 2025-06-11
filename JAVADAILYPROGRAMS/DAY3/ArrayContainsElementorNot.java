package DAY3;

public class ArrayContainsElementorNot {

	public static void main(String[] args) {

		int numbertoFind = 3;

		int arraynumbers [] = {1,3,4,5,6,7,8,9};

		boolean found = false;
		for (int number : arraynumbers) {
			if (number == numbertoFind) {
				found = true;				
				break;
			}}
		if(found) {
			System.out.println("Number Present");

		}else {
			System.out.println("Number Present");
		}



	}



}
