
public class Typecasting_Typeconversion_4 {

	
	public static void main(String[] args) {
		/*
		 * typecasting is a process in which one variable's data type is converted into another data type.
		 * for example :- let suppose I want to store integer type data into byte variable
		 * is it even possible..?
		 * Implicitly it is not possible because the range of integer is greater than range of byte.
		 * but explicitly is it possible by type casting method.
		 * where I'll be converting integer data into byte data then I'll be storing inside byte variable conveniently.
		 *  
		 */
		
		byte a=12;
		int b=19;
		a=(byte)b;
		System.out.println("The updated value of byte variable is:"+a);
		/*
		 * now what if I want to store byte type data into integer variable is it even possible
		 * yes it is possible
		 * because the range of integer is greater than the range of byte
		 * implictly java supporta such operation
		 */
		int a1=10;
		byte b1=12;
		a1=b1;
		System.out.println("The updated value of integer variable is:"+a1);
		/*
		 * what if I want to store the float data into integer variable
		 * Without type casting if we perform such operation we might get an error
		 * so intially convert float data into integer data then store inside integer variable.
		 * but converting loss of data can occur.
		 *
		 */
		float f1=12.3f;
		int c=12;
		c=(int)f1;
		System.out.println("The updated value of integer variable is:"+c);
		/*
		 * we cannot typecast character data type into boolean vice versa
		 * as character supports single values
		 * boolean supports logical values true and false.
		 */
	}
}
