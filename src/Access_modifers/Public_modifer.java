package Access_modifers;

public class Public_modifer {
	public String name="Sapna";
	public static void main(String[] args) {
		/*
		 * public access modifer can be accessed from anywhere within the package as well as outside package too.
		 */
		/*
		 * creating a object for class B in order to access all it's method
		 */
		B b=new B();
		System.out.println(b.marks);
	}

}
class B{
	public int marks=10;
}
