
public class This_Keyword {
	/*
	 * this keyword will refer to current object
	 */
	public static void main(String[] args) {
		//creating a object for class Humans in order to access all it's methods and variables
		Humans h=new Humans();
		h.setAge(13);
		h.setName("Sapna");
		System.out.println(h.getage());
		System.out.println(h.getName());
	}

}
class Humans{
	private int age;
	private String name;
	/*
	 * I'm making them as private so that no one from outside the class we will able to access them directly
	 * only way to access them is through setters and getters
	 */
	public void setAge(int age) {
		
		this.age=age;
		/*
		 * well we know left hand variable is the instance variable and RHS variable is local variable
		 * can we make same name for both the variable
		 * let's see
		 * basically here the local variable age is initializing it's value to itself only
		 * that's why we are getting default values in an instance variable
		 * default values for integer is 0
		 * default value for string is null
		 * so then how can we solve this issue
		 * how to make the method know that LHS part is basically belonging to my object instance variable
		 * then shall be create an new object 
		 * then also instance variable are not initialized because the value is been stored inside the new object's instance variable
		 * not to one instance variable which is making funtion call
		 * then how to resolve this issue
		 * shall we pass object reference here 
		 * let' see yes we can do that here instead of passing current object reference variable
		 * we can make use of this keyword
		 * this keyword will basically refer to current object 
		 * using which we can initialize the instance variable of an object which is calling setters and getters
		 * 
		 */
	}
	public void setName(String name) {
		
	this.name=name;
	
	}
	//getters for accessing instance variable
	public int getage() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
}
