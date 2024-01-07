package Access_modifers;

public class default_modifer {
	public int marks=10;
	public static void main(String[] args) {
		/*
		 * main method is the starting point from where the execution of program begans
		 * we will be creating a object for class A in order to access all it's method
		 */
		
		A a=new A();
		System.out.println(a.marks);
	}

}
//creating a sample class with name A
class A{
	//creating come instance variable which belongs to object
	//so each variable is going to remain different for different object
	public int marks=10;//what exactly access modifers are..?
	//this is default modifier which can be accessible only within the same package but with different class as well but not outside other packages.
	//access modifiers are basically used to set accessibilty for various class memebers like methods and variables
	/*
	 * they are different types of access modifers.
	 * default
	 * public 
	 * private
	 * protected
	 */
	
}