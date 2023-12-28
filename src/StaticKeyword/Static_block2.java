package StaticKeyword;

public class Static_block2 {
	static {
		System.out.println("In static block");
	}
	public static void main(String[] args) throws ClassNotFoundException {
		/*
		 * can we execute a static block without even creating an object
		 * yes we can with the help of class Class forname method
		 * we can load a class once the class is loaded then static block will execute.
		 */
		
		Class.forName("Static_block2");
		
	}

}
