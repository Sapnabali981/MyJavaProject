
public class Variables {
	
	public static void main(String[] args) {
		/*
		 * as a programmer when we write any java code
		 * compiler will comiple the code we get bytecode
		 * again bytecode is executed by jvm in order to get desired output in the console.
		 * JVM will execute the bytecode only if it has main method in it.
		 * why we build the software..?
		 * we build software in order to solve the real problems with the help of virtual solutions
		 * so while building java application we usually process data 
		 * while processing data of user we generally store it in permanent or temprary way
		 * for permanent storage we will make use of data base
		 * for temparary storage we will make use of variables
		 * so here variables are basically placeholder which hold certains data in it.
		 * variables contains two main components in it
		 * name and values
		 * while declaring the variables in java we make use of data type
		 * data type will define the classification of data like what values can be stored and what operation can be performed using those data can be identified with the help of data type
		 * that's why java is called as strongly typed programming language
		 */
		//creating variables and performing addition operation 
		int num1=12;
		int num2=13;
		int result=num1+num2;
		System.out.println("The addition of num1 and num2 is:"+result);
		/*
		 * well we store different types of data into a certain variables
		 * similarly we can also store binary values , hexa decimal values as well
		 * 
		 */
		int bin=0b101;
		int hex=0x7E;
		System.out.println("The binary value is:"+bin);
		System.out.println("The hexa decimal value is:"+hex);
		/*
		 * while storing a data in a variable it might possible there can be many zero's in data
		 * due to many number of zero's confusion may occur.
		 *in order to avoid confusion we use underscore in between the data values which is exactly ignored by comipler
		 */
		int p=100_00_0;//5 zero's basically
		System.out.println("The value of p is:"+p);
	}

}
