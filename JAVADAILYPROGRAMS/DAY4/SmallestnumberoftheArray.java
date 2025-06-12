package DAY4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class SmallestnumberoftheArray {
	int givenArray[] = {2,4,5,8,6,1,6};
	int smallest = Integer.MAX_VALUE;
	public void usingFor(){
		for (int i = 0; i < givenArray.length; i++) {
			if (givenArray[i] < smallest) {
				smallest = givenArray[i];
			}
			
		}
		System.out.println("Smallest number in an Array: " + smallest);
	}
	public void usingArrays(){
		Arrays.sort(givenArray);
		System.out.println(givenArray[0]);
	}
	
	public static void main(String[] args) {

		SmallestnumberoftheArray call = new SmallestnumberoftheArray();
		call.usingFor();
		call.usingArrays();

	}

}
