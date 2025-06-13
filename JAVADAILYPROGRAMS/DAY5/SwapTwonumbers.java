package DAY5;

public class SwapTwonumbers {
	int mysalary = 50;
	int mymanagersalary = 80;
	public void  thirdVariable() {
		int temp;

		System.out.println("Before Swapping");
		System.out.println(mysalary);
		System.out.println(mymanagersalary);
		temp  = mysalary;
		mysalary= mymanagersalary;
		mymanagersalary = temp;
		System.out.println("After Swapping");
		System.out.println(mysalary);
		System.out.println(mymanagersalary);
	}
public void withoutThirdVariable() {
	
	System.out.println("withoutThirdVariable------------------------");
	int mysalary = 50;
	int mymanagersalary = 80;
	
		int temp;

		System.out.println("Before Swapping");
		System.out.println(mysalary);
		System.out.println(mymanagersalary);
		
		mysalary = mysalary - mymanagersalary;    			//first = first - second;
		mymanagersalary = mysalary + mymanagersalary;    //second = first + second;
		mysalary = mymanagersalary - mysalary				// first = second - first
;
		
		System.out.println("After Swapping");
		System.out.println(mysalary);
		System.out.println(mymanagersalary);
	
}
	public static void main(String[] args) {
		
		SwapTwonumbers swap = new SwapTwonumbers();
		swap.thirdVariable();
		swap.withoutThirdVariable();
		
	}

}
