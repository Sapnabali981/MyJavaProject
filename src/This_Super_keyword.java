
public class This_Super_keyword {
	public static void main(String[] args) {
		/*
		 * this keyword is generally used to represent the current object
		 * When we create multiple methods with same name but different number of paramters then 
		 * it is called as method overloading
		 * similiarly in constructor concept also we are having constructor overloading process.
		 * this keyword here will represent constructor of same class/subclass
		 * super keyword will represent constructor of parent class 
		 */
		//creating the object for class student in order to access all it's methods and instance variable
		student s=new student();//here we are calling default construtor.
		System.out.println(s.city);
		System.out.println(s.name);
		student d=new student("Sapna","vrindavan");
		System.out.println(d.name);
		System.out.println(d.city);
		child c=new child();//default constructor is been invoked here
		child c1=new child(12,80000);//paramterized constructor is invoked
		
	}

}
class student{
	/*
	 * we will initialize these instance variable through default constructor
	 */
	public student() {
		System.out.println("parent constructor");
		name="Sapna";
		city="Bali";
	}
	//creating a paramterized constructor
	public student(String nameLocal,String cityLocal) {
		name=nameLocal;
		city=cityLocal;
		
		
	}
	//paramterized constructor of parent class
	public student(int age) {
		System.out.println("parent parameterized constructor");
	}
	String name;
	String city;
}
class child extends student{
	
	int age;
	int salary;
	public child() {
		super();
		System.out.println("child constructor");
	}
	public child(int age,int salary)
	{
		//calling default constructor of same class
		this();
		System.out.println("paramterized constructor");
	}
	
		/*
	}
	 * creating a object of sub class then before sub class constructor the constructor of parent class
	 * will get executed..
	 * so implicitly super keyword is been present in each constructor of sub class.
	 * 
	 */
}