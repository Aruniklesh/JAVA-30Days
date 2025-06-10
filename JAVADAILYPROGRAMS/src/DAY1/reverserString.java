package DAY1;

public class reverserString {

	
	public void reverseStringUsingStringbuffer() {
		String givenString = "ARUN";
		StringBuffer buffer = new StringBuffer();
		buffer.append(givenString);
		
		System.out.println(buffer.reverse());
	}
	
	public void usingChar() {
		String givenString = "ARUN";
		String rev="";
		char[] letters = givenString.toCharArray();
		for (int i = letters.length-1;i >=0 ; i--) {
			 rev = rev + letters[i];
			 
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverserString rev = new reverserString();
		rev.usingChar();

	}

}
