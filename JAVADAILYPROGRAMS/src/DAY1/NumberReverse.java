package DAY1;

import java.util.Scanner;

public class NumberReverse {
	
	int givenNumber = 0;
	int reverse = 0;
	public void numberRev() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the number that you want to reverse");
		int givenNumber = sc.nextInt();
		while(givenNumber!=0) {
			
			reverse = reverse *10;
			reverse = reverse+givenNumber%10;
			givenNumber = givenNumber/10;
		}
		System.out.println(reverse);
		

	}
	public static void main(String[] args) {

		NumberReverse number = new NumberReverse();
		number.numberRev();

	}

}
