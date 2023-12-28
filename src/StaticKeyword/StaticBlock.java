package StaticKeyword;

public class StaticBlock {
	
	public StaticBlock(){
		
	}
	public static void main(String[] args) {
		//creating an object for class Mobile2 in order to access all it's variables and methods
		Mobile2 m=new Mobile2();
		m.model="oppo";
		m.price=19000;
		Mobile2.name="phone";
		
		/*
		 * we can initialize the Mobile2's instance variable with the help of object reference variable as well with constructor
		 */
		//creating another object
		Mobile2 m1=new Mobile2();
	m1.show();
		/*
		 * for this object I have keep all default values for it's instance variables which is been initialized in it's construtor
		 */
		
		
		
	}

	/* static block is a block where we can initialize all static variables 
	 * well how we initialize non static variables in java
	 * through constructor and with the help of object reference variable
	 * similarly static block is used for initializing all static variables.
	 * 
	 */
}
class Mobile2{
	/*
	 * mobile contains some properties
	 * name price model which can be represented using instance variables
	 */
	static {
		name="Bali";
		System.out.println("static block");
	}
	public Mobile2(){
		
		System.out.println("In constructor");
		model="vivo";
		price=14500;
		/*
		 * well here every time object gets created, constructor is invoked right
		 * every time constructor is invoked all static and non static variables is going to get initialized 
		 * non static variable will remain different for different object 
		 * but static variable is commonly shared by all the objects so is it okay for getting initialized again and again with every object creation.
		 * no right ..?
		 * that'why we will create a separate block where we can initialize static variable for only one  
		 * such block is called as static block.
		 * why static block is executing 1st it's because 
		 * whenever we are creating a object inside heap
		 * a class loader is a part of jre which will load class in java virtual machine
		 * once a class is loaded then static block will get executed then only constructor is invoked
		 * means if we do not create an object.then static block will not going to execute because a class loading is not happpened yet
		 * along with that constructor is also not invoked
		 * so it is any way to run static block without even creating object can we load a class manually like implicitly in JVM
		 * yes we can do that using class Class where will use forname method in order to load a class 
		 * once a class is loaded then automatically a static block will execute.
		 */
				
		
	}
	static String name;
	//name variable is going to remain common for all the objects as it is static in nature
	String model;
	int price;
	//creating non static method which can show the details of object
	public void show() {
		System.out.println(model + " " + price + " "+name);
	}
}