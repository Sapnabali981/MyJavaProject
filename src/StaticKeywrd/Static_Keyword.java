package StaticKeywrd;

public class Static_Keyword {
	
	public static void main(String[] args) {
		/*
		 * static keyword is basically shared by all object commonly in order to avoid uneccessary creation of variables
		 * static member belongs to a class .
		 * in order to access any static member we can do that using class name.
		 * static members will access in entire program. 
		 */
		//creating an object for class Mobile
		Mobile m=new Mobile();
		//intializing the instances variable value for each object using reference variable
		m.price=190;
		m.model="Sumsang";
		Mobile.name="Phones";
		//creating another object for class Mobile
		Mobile m2=new Mobile();
		Mobile.name="Phones";
		m2.price=1900;
		m2.model="OPPO";
		m.show();
		m2.show();
		/*
		 * as here you can observe that name is common for both the object so we can make 
		 * name variable as commmon for all objects by making it static
		 * once we have made the name variable as static then it is commonly shared by all the objects
		 * it can be accessed using class name. 
		 *
		 */
		
	}

}
//creating a class Mobile
class Mobile{
	/*
	 * this class mobile will certain properties like name model price which can represented in a program through instance variable
	 *in order to access Mobile class properties and methods we will create an object for it
	 */
	static String name;
	String model;
	int price;
	//creating a non static method show which can display all the properties of mobile object
	public void show() {
		/*
		 * we can access static variable inside non static method there is no harm in it
		 * but can we access non static variable inside static method. let'e see in next chapter.
		 */
		System.out.println(name  + " " + model + " " +price);
	}
}