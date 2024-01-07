package Access_modifers;

public class Protected_modifer {
	protected String names="Radhey Radhey";
	public void show() {
		System.out.println("from protected class method");
	}
	public static void main(String[] args) {
		/*
		 * protected modifer can be accessed only within the same package 
		 * if we want to access it from outside the package of different class
		 * then that particular class has to be subclass
		 */
		//creating a object for class c in order to access all it's method
		C c=new C();
		System.out.println(c.name);
	}
}
class C{
	protected String name="Radhey Radhey";
}