package DAY2;

public class LengthofGivenString {
	public static void main(String[] args) {
		String givenString = "Arun RS";
		int len =0;
		String afterreplacespace = 	givenString.replace(" ","");

		char[] character = afterreplacespace.toCharArray();
		for (char c : character) {
			len++;
		}

		System.out.println(len);


	}
}
