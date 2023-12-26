import java.util.Scanner;

public class Switch_statement_8 {
	public static void main(String[] args) {
		/*
		 * switch statement is basically used for executing certain lines of code based on some follwoing situation
		 * basically here based on value of n certain case will get executed.
		 * write a program to print the day of week 
		 * the same above program can be done using conditional statement
		 * but in this case multiple if else block will occur
		 * so it's better to make use of switch statements
		 * take input n from user
		 * now switch statement accepts n and  match is done with each case once match is done certain case will get printed.
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day of the week:");
		int a=sc.nextInt();
		if(a==1) {
			System.out.println("Monday");
		}
		if(a==2) {
			System.out.println("Tuesday");
		}
		if(a==3) {
			System.out.println("Wednesday");
		}
		if(a==4) {
			System.out.println("Thursday");
			
		}
		if(a==5) {
			System.out.println("friday");
		}
		if(a==6) {
			System.out.println("saturday");
		}
		if(a==7) {
			System.out.println("sunday");
		}
		//in order to avoid multiple usage of if else block. we make use of switch case
		switch(a) {
		
		case 1: System.out.println("monday");
		 		break;
		case 2: System.out.println("tuesday");
 		        break;
 
		case 3: System.out.println("wednesday");
 		        break;
		case 4: System.out.println("thursday");
 		       break;
		case 5: System.out.println("friday");
 		        break;
 		        
		case 6: System.out.println("saturday");
 		       break;
		case 7: System.out.println("sunday");
	            break;
 
 		default:System.out.println("invalid numbers");
 		          break;
		
		}
		
		
		
	}

}
