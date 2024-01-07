import Access_modifers.Protected_modifer;
import Access_modifers.Public_modifer;
import Access_modifers.default_modifer;

public class AccessModifer_example  {

	public static void main(String[] args) {
		/*
		 * if I want to create object for class default_modifer here we can do
		 */
		default_modifer df=new default_modifer();
		System.out.println(df.marks);
		//we are getting an error because default members cannot be acessed outside the class
		/*
		 * in order to make it accessible we have to make it as public
		 * so that everyone from outside the world will be to access this variable.
		 */
		//creating an object for Public_modifer
		Public_modifer p=new Public_modifer();
		System.out.println(p.name);
		//creating the object of Public_modifer
		Protected_modifer m=new Protected_modifer();
		
	m.show();
	}
}
