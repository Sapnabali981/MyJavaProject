
public class DataStorageAreas_in_JVM {

	public static void main(String[] args) {
		/*
		 * basically when ever jvm is executing a code what is happening behind the scene
		 * how exactly the variable data is getting stored inside the memory
		 * let 's discuss this in memory level
		 */
		/*
		 * creating an object for class calculator1 in order to access all it's methods and variables
		 */
		calculator1 a=new calculator1();
		System.out.println(a.num1);
		int result=a.addNumbers(34, 13);
		System.out.println("The sum of two numbers is:"+result);
		
		/*here every method will have separate stack for it
		 *in this case we will have 2 stacks one is for main method 
		 *2nd is for addNumbers method
		 *stack will follow last in 1st out  it contains mutiple rows and colums
		 *a variable of a program gets stored inside stack in the form of key and value
		 *where key is name of a variable
		 *value is data which we have stored inside that specific variable.
		 *heap is a open space 
		 *all local variables will get stored inside stack
		 *all java object is created inside the heap
		 *every object present inside the heap is going to have two separate sections
		 *one is for instance variables
		 *second is for method declaration
		 *every object is going to have a unique address 
		 *with the help reference variable we can access the current object using memory address of it
		 *that's why there is an link between stack and heap.
		 * 
		 * 
		 * let suppose I'm different calculator1 object 
		 * then this new object will have same instance variables and non static method copy with itself.
		 */
		calculator1 c1=new calculator1();
		System.out.println(c1.num1);
		//what If I'm updating the value of num will it affect to another object's num value
		c1.num1=100;
		System.out.println("The num1 value for object 1 is:"+(a.num1));
		System.out.println("The num1 value for object 2 is :"+(c1.num1));
		/*
		 * well impact will be on object 2 only
		 * because both the objects are different 
		 * so this was all about the data areas concepts in java
		 * where data will get stored inside jvm where exactly stack and heap residing.
		 */
		
	}
}
//creating a class with name calculator1

class calculator1{
	//creating a instance method which we can accessed from any where throughout the program
	int num1=10;
	//creating a non static method which can perform addition operation
	public int addNumbers(int n1,int n2) {
		
		return n1+n2;
		
	}
}
