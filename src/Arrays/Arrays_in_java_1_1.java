package Arrays;

public class Arrays_in_java_1_1 {
	public static void main(String[] args) {
		 
		/*
		 * arrays are the data structure which can hold multiple data values of same type
		 * why there is an need of an array
		 * because in order to store the large set of data under single variable we need an array
		 * as well as we can avoid confusion which occur due to creation of multiple variables
		 * indexing in an array starts from 0
		 * which ends at n-1 where n is the length of an array
		 * we can create static array as well as dynamic array
		 * we already know about the data values then it is recommended to make use of static arrays 
		 * static arrays are basically those arrays where we can allocate memory in compile time itself before runtime
		 * dynamic arrays can be expanded and shrinked as per the requirement.
		 * we create dynamic arrays when we are unware about data values
		 * here memory allocation take place at runtime itself.
		 */
		//creating single dimensional array
		int a[]= {2,3,4,5,56};
		//in order to access any element in an array we can make use of index values
		System.out.println("The value at index 1 is:"+a[1]);
		//we can also update the values of array using index value only
		a[0]=100;
		System.out.println("The updated value of an array at index 0 is:"+a[0]);
		
		//in order to print all data values of an array we can make use of for loop where counter value of i begans from 0 as index value of array starts from 0.
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
			/*
			 * length function of array class will give you the length of an array
			 */
		}
	}

}
