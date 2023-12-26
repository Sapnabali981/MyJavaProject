
public class if_else_conditional_statement {
	public static void main(String[] args) {
		/*
		 * using conditional statements we execute certain line of code based on some following condition
		 * so in order to decide the flow of code based on some situation we make use of if else conditional statements in java
		 * these conditional statements include true or false only logical operators
		 * 
		 */
		int a=12;
		int b=10;
		//write a program to check whether a is greater than b or not
		//if a is greater than print hello
		//otherwise print byee
		if(a>b) {
			System.out.println("Hello");
		}
		else {
			System.out.println("bye");
		}
		/*
		 * we can make use of conditional statement using logical operators as well as can be combined with relational operators too
		 * 
		 */
		if(((a>b)&&(a<b)) || ((a>=b)&&(a<=b))){
			System.out.println("Radhey Radhey");
		
		}
		else {
			System.out.println("Hare krishna");
		}
		
		/*
		 * write a program to find the largest number among two numbers
		 */
		if(a>b) {
			System.out.println("a is greater");
		}
		else {
			System.out.println("b is greater");
		}
	/*
	 * write a program to check largest number among 3
	 */
		int num1=10;
		int num2=92;
		int num3=990;
		int max=num1;//initially assuming maximum number is num1 
		if(max<num2) {
			max=num2;
		}
		if(max<num3) {
			max=num3;
		}
		
		System.out.println("The maximum element is:"+ max);
		/*
		 * find the largest number between three no's using logical operators
		 */
		if((num1>num2) && (num1>num3)) {
			System.err.println("maximum element is : "+ num1);
		}
		else if(num2>num3) {
			System.out.println("The maximum element is: "+num2);
		}
		else {
			System.out.println("The maximum element is: "+num3);
		}
	}

}
