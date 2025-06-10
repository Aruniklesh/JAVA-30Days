package DAY1;

import java.util.concurrent.ForkJoinPool.ManagedBlocker;

public class SwapTwoNumbers {
	int mysalary = 10;
	int Mangersalary = 20;
	int temp;
	public void usingThirdVariable() {
		System.out.println("Before Swapping");
		System.out.println(mysalary);
		System.out.println(Mangersalary);
		
		temp = mysalary;
		mysalary = Mangersalary;
		Mangersalary = temp;
		System.out.println("After Swapping");

		System.out.println(mysalary);
		System.out.println(Mangersalary);
		

	}

	public void WithoutUsingThirdVariable() {
		System.out.println("Before Swapping");
		System.out.println(mysalary);
		System.out.println(Mangersalary);
		
		mysalary = mysalary - Mangersalary;  	//first = first - second
		Mangersalary = mysalary + Mangersalary; // second =first + second
		mysalary  = Mangersalary - mysalary; 	// first = second-first
		
		System.out.println("After Swapping");

		System.out.println(mysalary);
		System.out.println(Mangersalary);
	}
	public static void main(String[] args) {
		SwapTwoNumbers swap = new SwapTwoNumbers();
		//swap.usingThirdVariable();
		swap.WithoutUsingThirdVariable();





	}

}
