package DAY5;

public class VowelsReplacement {

	public static void main(String[] args) {

		String inputString = "India is my country of nation";
		inputString = 	inputString.toUpperCase();


		char[] switchedchar = inputString.toCharArray();

		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i)  == 'A' 
					|| inputString.charAt(i)  == 'E' 
					|| inputString.charAt(i)  == 'I' 
					|| inputString.charAt(i)  == 'O'
					|| inputString.charAt(i)  == 'U') {
				switchedchar[i] = '&';
			}
			

		}
		System.out.println(switchedchar);
		
		String repalce = inputString.replaceAll("[AEIOUaeiou]", "*");
		System.out.println(repalce);
	}

}
