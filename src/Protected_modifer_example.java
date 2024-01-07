import Access_modifers.Protected_modifer;

public class Protected_modifer_example extends Protected_modifer {

	
	public static void main(String[] args) {
		Protected_modifer_example pf=new Protected_modifer_example();
		pf.show();
		System.out.println(pf.names);
		/*
		 * protected modifers can be accessed from same class of same package
		 * if we want to access from different class of different package then we need to make that class as sublcass
		 */
	}
}
