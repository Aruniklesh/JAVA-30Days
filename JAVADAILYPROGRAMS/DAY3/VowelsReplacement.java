package DAY3;

public class VowelsReplacement {

	public static void main(String[] args) {

		String givenText = "I love Dhoni";
//		givenText = 	givenText.toUpperCase();
//
//		char[] word = 	givenText.toCharArray();
//
//		for (int i = 0; i < givenText.length(); i++) {
//
//			if(givenText.charAt(i)=='A' || givenText.charAt(i)=='E' || givenText.charAt(i)=='I' 
//					|| givenText.charAt(i)=='O' || givenText.charAt(i)=='U') {
//				word[i] = '*';
//
//			}
//			
//		}
//		for (char c : word) {
//			System.out.print(c);
//		}
		String regular  = givenText.replaceAll("[AEIOUaieou]", "\\$");
		System.out.println(regular);
	}
	
	

}
