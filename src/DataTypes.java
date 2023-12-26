
public class DataTypes {
	public static void main(String[] args) {
		/*
		 * data types are basically defines the classification of data
		 * with the help we can identify what kind of data a particular variables can hold
		 * and what all operations can be performed on those data
		 * they are two types of datatypes prmitive and non primitive
		 * primitive are very easy and simple to understand
		 * int byte short long :- integer supports all whole numbers
		 * float double:- this data type supports all decimal point numbers basically all real numbers
		 * character:-char supports numeric values too
		 * boolean:- boolean supports logical values true and false in order to decide the flow of a code.
		 */
		//creating mutiple variables and storing data in it which is of different data types
		int num1=2;//here basically num1 variable is going to allocate memory size of 4bytes
		byte num2=12;//here the num2 variable is going to allocate memory size of 1byte
		short num3=17;//here num3 variable is going to allocate memory size of 2bytes
		long num4=899l;//here num4 variable will allocate memory size of 8bytes in ram
		//1byte is basically 8bit
		//default value for integer data type is 0
		System.out.println("All Integer values:"+ num1 + " "+ num2 +" "+ num3 +" "+ num4);
		float f=15.9f;//float variable will occupy 4 bytes of memory in ram
		//while creating float variable make sure to use f as a suffix
		//same goes of long variable make sure to use l as a suffix.
		double d=1000.89;//double variable will occupy 8vytes of memory in ram
		//by default decimal point data type is double in java
		//default value for float data type variable will be 0.0f
		System.out.println("Decimal pointing values"+f+" " + d);
		char c ='8';// here 8 is the numeric value then also character data type supports such values
		//generally all character data type represented in single quote.
		//char variable occupy 2 bytes of memory in ram
		//default value of char variable is null
		System.out.println("Character values"+ c);
		char t='\u0000';//this represents uncode value which is denotes null value or 0 in decimal
		System.out.println(t);
		boolean b=true;
		
		//in order to decide flow of program based on some condition we make use of boolean values
		System.out.println("Boolean values is:"+b);
		//the default value for boolean data type is false.
	}

}
