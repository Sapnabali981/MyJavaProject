
public class Constructors {

	//creating certain properties here
	String name;
	String city;
	public Constructors() {
		name="sapna";
		city="mumbai";
	}
	public static void main(String[] args) {
		/*
		 * Constructors are basically invoked once the object is created inside the heap memory
		 * constructor are basically used fot initializing the instance variable of an object
		 * constructor does not have any return type value
		 * constructor name is same as that of class name
		 * constructor can be 2 types
		 * default and paramterized
		 * 
		 */
		//creating an object for class Constructors
		Constructors a=new Constructors();
		System.out.println(a.city);//default value will be null here
		System.out.println(a.name);//default value of String object is null
		/*
		 * so we can initialize these instance variable with the help of reference value and using constructor
		 */
		
		
	}
}
