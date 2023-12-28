package StaticKeyword;

public class Static_Methods {
	public static void main(String[] args) {
		/*
		 * methods which we create using static keyword is called as static methods
		 * static method is accessed using class name
		 * can we access a non static variables inside a static method
		 * is it even possible
		 * yes we can do here basically we will encounter a compile time error because
		 * the compiler will get confused about certain things like to which exact object this instances variables are belonging
		 * because since we know each object will have separate instance variables
		 * if we are creating multiple objects then it is diffcult of complier to decide to which exact object these following instance 
		 * variables are belonging for that we will pass specific object reference as a arugment in a method itself.
		 */
		//creating an object for class Mobile1 in order to access all it's variables as well static and non static method
	Mobile1 m=new Mobile1();
	m.model="Iphone";
	m.price=122334;
	Mobile1.name="phones";
	
	Mobile1 m1=new Mobile1();
	m1.price=123346;
	m1.model="vivo";
	/*
	 * here static variable name is going remain common for all the object which can accessed using class name.
	 */
	//calling non static method
	m.show();
	//since static method is static methos so it can be accessed through class name
	Mobile1.show1(m);
	
	}

}
class Mobile1{
	static String name;
	String model;
	int price;
	public void show() {
		System.out.println(name + " " + model + " "+price);
	}
	public static void show1(Mobile1 m) {
		//here we are accessing object 1 properties
		System.out.println(name + "  "+ m.model + " "+m.price);
		//since model and price are non static in nature we need to pass specific object reference variable in order to clear the confusion
	}
	
	/*
	 * why main method is static in nature
	 * let suppose main method is a non static method then we will be creating an object for class demo in order to access this main method
	 * since we also know main method is the starting point from where the execution of program begans
	 * so main method itself is not called how can even create an object for class demo
	 * there is a deadlock here
	 * that's why main method is static in nature so that we don't need any object to access main method.
	 */
}