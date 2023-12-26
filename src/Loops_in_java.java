
public class Loops_in_java {
	public static void main(String[] args) {
		/*
		 * one of the amazing factor about programming is that we can repeat everything
		 * but instead of doing that with the help of system.out.println we can do that using loop
		 * using loop we can iterate certain line of code for multiple time
		 * there are different types of loops in java
		 * for loop, do while loop, while loop
		 * most commonly used loop is for loop
		 * when we know finite of iteration it is recommended to make use of for loop
		 * 
		 */
		/*
		 * write a program to print numbers from 1 to 5
		 * 
		 */
		for(int i=1;i<=5;i++) {
			System.out.println("The value of i is :"+i);
		}
		int i=1;
		/*
		 * when number of iteration is not fixed then it is recommended to use while loop
		 */
		while(i<=5) {
			System.out.println("The value of i:"+i);
			i++;
			
		}
		/*
		 * when we want to execute certain lines of code for atleast one time even if the condition is false
		 * then we make use of do while loop 
		 */
		int j=6;
		do{
			System.out.println(j);
			j++;
		}while(j<=5);
		
	}

}
