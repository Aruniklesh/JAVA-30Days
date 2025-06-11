package DAY3;

public class OccuranceoftheCharacter {

	public static void main(String[] args) {

		String input = "arunniiklesh";
		char ToFind = 'n';
		/*
		 *  input = input.toLowerCase(); int occur = 0;
		 * 
		 * for(int i =0; i<input.length(); i++) { if (input.charAt(i)==ToFind) {
		 * occur++;
		 * 
		 * }
		 * 
		 * 
		 * } System.out.println(occur);
		 */

		input = input.toUpperCase();
		String chartoFind  = Character.toString(ToFind).toUpperCase();
		int actuallength = input.length();
		System.out.println(actuallength);
		input = input.replace(chartoFind, "");
		int lengthafterreplace = input.length();
		System.out.println(lengthafterreplace);
		
		System.out.println(actuallength-lengthafterreplace);


	}

}
