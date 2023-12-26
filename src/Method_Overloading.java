
public class Method_Overloading {
	public static void main(String[] args) {
		/*
		 * method overloading is a process where we can create multiple methods with same name but different number of parameters or else different type of parameters
		 * in method overloading what if we are having mutiple methods with same name and same number of arguments including same type as well.
		 * but different return type then in this case can we overload methods.
		 * no because complier will consider all methods as same in this case due to which it throws a compile time error.
		 */
		//creating a object of class calculator in order to access all it's method
		calculator c=new calculator();
		int sum=c.sumOfNumbers(4, 5);
		System.out.println("The sum of two numbers is:"+sum);
		/*
		 * here basically we are passing 4 and 5 as a argument in a method
		 * but what if now I want to add 3 values then need to make changes in existing method
		 * or else I'll be creating a method which can 3 numbers.
		 * but here we are performing same action and creating mutiple methods for the same so it may possible that it may lead to confusion
		 * so I'll be creating multiple methods with same name but different number of paramters or different type of parameter.
		 */
		
	}

}

class calculator{
	//creating a parameterized function which can return a sum of two numbers
	public int sumOfNumbers(int n1,int n2) {
		return n1+n2;
	}
}