
public class Encapsulation {
	/*
	 * encapulsation is a process where we will binding the data with methods
	 * so that no one from outside the world will be able to access the directly
	 * only way to access the data will be with the help of methods..
	 */
	//creating a object of a Human class in order to access all it's properties as well as behavoiur
	
	/*
	 * main method is the starting point from where the execution of programs begans
	 */
	public static void main(String[] args) {
		Human n=new Human();
		n.setAge(12);
		n.setName("Radha");
		System.out.println(n.getage());
		System.out.println(n.getName());
		/*
		 * well there is different setters and getters for different instance variables
		 * so whenever we are creating any instance variable further always remember to make it as private
		 * so that no one from outside the world will able to access those data directly.
		 */
	}

	
	

}
class Human{
	
	//creating a instance variables which belongs to a object of an class
	private int age;
	private String name;
	/*
	 * well we can directly access these variables with the help of object reference variable
	 * but in real world it is unsafe to provide access to all data
	 * in order to restrict direct access we will make private instance variable
	 * once these variables are private then it can be accessed only within the class
	 * no one from outside the class will able to access them directly.
	 * only way to access them is through setters and getters
	 */
	//creating a setter method
	public void setAge(int ageLocal) {
		age=ageLocal;
		/*
		 * here we have successfully initialized the instance variable of an object with the help of setters
		 */
	}
	public void setName(String nameLocal) {
		name=nameLocal;
	}
	//access the instance variable with the help of getters
	public int getage() {
		return age;
	}
	public String getName() {
		return name;
	}
	
}
