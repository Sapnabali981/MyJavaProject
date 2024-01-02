
public class DefaultConstructor {
	/*
	 * constructors are basically are of 2 types
	 * paramterized constructor as well as default construtor
	 * constructor is basically used to initialize the instance variable of an object
	 * constructor is basically invoked once the object is created inside the heap memory
	 */
	public static void main(String[] args) {
		//creating a Humanss class object in order to access all it's methods
		Humanss h1=new Humanss();//this is default constructor
		System.out.println(h1.age);
		System.out.println(h1.name);
		Humanss h2=new Humanss(12,"bali");//paramterized constructor
		System.out.println(h2.age);
		System.out.println(h2.name);
		/*
		 * default constructor run implicitly even if we are not calling it.
		 * paramterized constructor will accept paramter whenever we want to create a paramterized constructor
		 * then it has to be created implicitly.
		 */
		
		
	}

}
class Humanss{
	public Humanss() {
		/*
		 * creating a default constructor which will initialize the instance variable of an object once it is invoked
		 */
		age=12;
		name="Sapna";
	}
	public Humanss(int age1,String name1) {
		age=age1;
		name=name1;
	}
	String name;
	int age;
}