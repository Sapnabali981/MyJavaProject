package Final_Keyword;

public class Final_keyword_methods {

	final public void show() {
		System.out.println("Parent class");
	}
	/*
	 * once methods are final then any other sub class won't be able to override it
	 */
}
class B extends Final_keyword_methods {
	
//	public void show() {
//		
//	}
	//we cannot override show method from parent class since it is final
}