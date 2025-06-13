package DAY5;

public class ReverseSinglestring {

	public static void main(String[] args) {
		String input = "ARUN";
		
		/*
		 * StringBuffer string = new StringBuffer(); string.append(input);
		 * System.out.println(string.reverse());
		 */
		
		String reverse ="";
		char [] singlelechar = input.toCharArray();
		for (int i = singlelechar.length-1; i >=0; i--) {
			reverse = reverse + singlelechar[i];
			
		}
		System.out.println(reverse);
		
	}

}
