
public class Method_Overriding {
	
	public static void main(String[] args) {
		/*
		 * method over riding is a process where a child class will override some methods from
		 * parent class.
		 * method overide will occur only if there is inheirtance between two class.
		 * In method over riding methods names can be same, type as well as number of paramters can also be same but 
		 * there should be different behaviour
		 */
		//creating a object of B class
		B b=new B();
		b.show();
		b.config();
		//creating a object of parent class
		A a=new A();
		a.show();
		
	}

}
//parent class
class A{
	public void show() {
		System.out.println("In show method of A");
	}
	
}
//child class is extending parent class so all parent class methods will automatically is been inherited by child class 
class B extends A{
	//now I want to over ride show method of parent class
	public void show() {
		System.out.println("In b show");
	}
	public void config() {
		System.out.println("In config B");
	}
}