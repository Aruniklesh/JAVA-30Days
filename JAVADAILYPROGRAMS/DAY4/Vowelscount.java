package DAY4;

public class Vowelscount {

	public static void main(String[] args) {

		String input = "Java is a programming language";
		input = input.toUpperCase();
		int vowelscount = 0;


		for(int i=0; i<input.length(); i++) {
			if(		input.charAt(i) == 'A' 
					|| input.charAt(i) == 'E' 
					|| input.charAt(i) == 'I'
					|| input.charAt(i) == 'O' 
					|| input.charAt(i) == 'U' ) {
				vowelscount++;

			}
		}
		System.out.println("Yourcharcter has: " + vowelscount + " " + "Vowels");
	}

}
