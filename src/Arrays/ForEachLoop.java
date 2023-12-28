
package Arrays;

public class ForEachLoop {

	/*
	 * for each loop is also called as enhanced for loop
	 * what is difference between for loop and enhanced loop
	 * In traditional for loop programmer has to manually specify the condition and initialize the counter variable as well as 
	 * reponsible for increment operation
	 * but in enhanced for loop all above mentioned operation is performed by JVM.
	 * 
	 */
	
	/*
	 * creating an 1D array printing the values of an array using for each loop
	 * In enhanced loop we will fetch one value at a time store inside an integer variable 
	 * 
	 */
	public static void main(String[] args) {
		
	
	int arr[]= {2,3,4,5,6};
	for(int n:arr) {
		System.out.print(n +" ");
	}
	System.out.println();
	
	//creating 2d array and printing all the elements of array in the console.
	int arr1[][]= {{2,3,4},
			{5,6,7},{8,9,10}};
	/*
	 * enhanced for loop 
	 * using enhanced for loop if we want to print all the elements of 2d array then
	 * we have to bit carefull
	 * like if I'm asking hey 2d array give me one element at a time then it is going to throw the entire array
	 * from that particular array I'll be fetching one element at a time printing it in console.
	 */
	for(int n[]:arr1) {
		for(int m:n) {
			System.out.print(m);
		}
		System.out.println();
	}
	/*main method is the starting point from execution of program begans
	 */
	
}
}

