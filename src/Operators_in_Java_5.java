
public class Operators_in_Java_5 {
	public static void main(String[] args) {
		/*
		 * what are operators 
		 * operators are basically used to perform certain operation using data values
		 * there are different types of operators
		 * arithmetic operators
		 * relational operators
		 * logical operators
		 * Arithmetic operators includes addition subtraction division multiplication modulus etc.
		 * 
		 */
		int num1=10;
		int num2=20;
		System.out.println("The addition of num1 and num2 is:"+(num1+num2));
		System.out.println("The multiplication of num1 and num2 is:"+(num1*num2));
		System.out.println("The division of num1 and num2 is:"+(num1/num2));
		System.out.println("The subtraction of num1 and num2 is:"+(num1-num2));
		System.out.println("The modulus of num1 and num2 is:"+(num1%num2));
		/*
		 * what is relational operators
		 * relational operators are used to compare two data values
		 * there are different types of relational operators
		 * less than , greater than,
		 * less than equal to,
		 * greater than equal to,
		 * not equal to,
		 * equal to equal to operators
		 * we compare two data values using relational operators in order to decide the flow of code.
		 * the output which we receive after comparing two values will be inform of boolean data type
		 * true ot false.
		 */
		System.out.println("Is num1 is less than num2 : "+(num1<num2));//10<20 true
		System.out.println("Is num1 is greater than num2: "+(num1>num2));//10>20 false
		System.out.println("Is num1 is greater than or equal to num2 : "+(num1>=num2));//10>=20 false
		System.out.println("Is num1 is less than or equal to num2 : "+(num1<=num2));//10<=20 true
		System.out.println("Is num1 is equal to num2 : "+(num1==num2));//10==20 false
		System.out.println("Is num1 is not equal to num2: "+(num1!=num2));//10!=20 true
		
		/*
		 * logical operators
		 * in order to decide the flow of a code we make use of logical operators
		 * there are different types of logical operators
		 * logical and : - if one of the condition is false then output will be false. 
		 * logical or :- if one of the condition is true then output will be true
		 * logical not :- if one of condition is true then output will false
		 * if one of the condition is false then then output will be true.
		 * 
		 */
		int no1=12;
		int no2=13;
		/*
		 * well the output we receive after comparing two data values will be in the form of boolean value
		 */
		boolean result=(no1>no2) && (no1<no2);//if one of the condition is false then output will be false
		//(12>13) && (12<13) f&&t false
		System.out.println("The output after comparsion will be"+result);
		
		//logical or
		boolean res=((no1<no2) || (no1>no2));// 12<13 || 12>13  T || F true
		// if one of the condition is true then output will be true.
		
		System.out.println("The output after comparsion will be"+res);
		
		//logical not
		boolean not=(!(true));
		System.out.println("The output will be "+ not);
		
	}

}
