package DAY5;

public class WordReverse {

	public static void main(String[] args) {

		String input = "India is my Country";


		String []  replaced = input.split(" ");

		String reverse = ""  ;

		for (int i = replaced.length-1; i>=0; i--) {
			 reverse = reverse + replaced[i]+" ";

		}
		System.out.println(reverse);

	}

}
