
public class Ternary_operators_7 {
	public static void main(String[] args) {
		/*
		 * when we want to make use of if else conditional statement in one line in order to decide flow of a code based on some following situation 
		 * then we can do that using ternary operators
		 * if the condition is shorter and we can check some condition then we can use ternary operator(?:)
		 * 
		 */
		int num1=10;
		int res;
		//write a program to check whether a given no is even or odd
		if(num1%2==0) {
			res=10;
		}
		else {
			res=20;
		}
		//same above program we can do using ternary operator
		res=(num1%2==0)?10:20;
		System.out.println("The value of res is: "+ res);
	}

}
