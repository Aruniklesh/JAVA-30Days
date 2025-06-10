package DAY2;

import DAY1.reverserString;

public class WordReverse {

	public static void main(String[] args) {

		String words = "I love India";
		String reverse="";
		
		String[] word = words.split(" ");
		
		for(int i=word.length-1; i>=0; i--) {
			reverse = reverse + word[i];
			}
		System.out.println(reverse);
		
		
	}

}
