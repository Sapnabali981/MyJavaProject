package Access_modifers;

public class Private_modifer {
	private String name="Sapna";
	
	public static void main(String[] args) {
		/*
		 * private modifer are accessible only within same class irrespective of package.
		 */
		Private_modifer m=new Private_modifer();
	System.out.println(m.name);
	//creating a object for class B1 in order to access all it's methods
	B1 b=new B1();
b.setMarks(3);
	System.out.println(b.getMarks());
	}

}
class B1{
	private int marks=10;
	/*
	 * private members cannot accessed from any where outside the class
	 * if we want to access then we can do with the help of setters and getters
	 */

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}