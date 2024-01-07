
public class Dynamic_method_Dispatch {
	public void show() {
		System.out.println("parent class method..");
	}
	public static void main(String[] args) {
		/*
		 * what exactly is polymorphism
		 * poly means different morphism means forms
		 * here each object is going to behave differently in different situation.
		 * there are 2 types of polymorphism 
		 * late binding:- it takes place at run time itself.
		 * that's why it is also called as run time polymorphism./method overriding
		 *early binding:- it generally takes place at compile time so it also called compile time 
		 *polymorphism/method overloading
		 * method overloading is a process where a we can create multiple method with same name but different number of paramter. or different type of paramter.
		 * method overriding is the process where we can over ride parent class method
		 */
		Dynamic_method_Dispatch dy=new Dynamic_method_Dispatch();//this is basically a parent class object
		dy.show();//calling show method parent class
		//creating a child class object in order to access all it's methods
		D a=new D();
		a.show();
		Dynamic_method_Dispatch dy1=new D();
		dy1.show();//here child class show method will get implemented because the object is of child class so it is going to contain all it's own overrided methods.
		/*
		 * similarly different object will have different behaviour in different situation
		 * same parent class reference variable is refering to different object.
		 * and parent class reference variable is behaving differently with different object
		 */
		Dynamic_method_Dispatch dy2=new G();
		dy2.show();
		/*
		 * well can we create a object of child class and This child class object is basically refered by parent class Reference variable.
		 * is it possible yes
		 * for example if we are creating a computer class object
		 * this computer class is basically abstract class
		 * let suppose now laptop class is inheriting all properties from it's parent class Laptop.
		 * so here we can say laptop is basically a computer.
		 * laptop object can be refered by computer/parent class reference variable.
		 * similarly we can say parent class reference variable can refer to child class object
		 * 
		 */
	}

}
//creating a child class which is basically extending a parent class
class D extends Dynamic_method_Dispatch { 
	
	/*
	 * automatically it is going to all methods from it's parent class
	 * now I want to override show method of parent class here in child class in order to provide different implementation to it.
	 */
	public void show() {
		System.out.println("from child show method..");
	}
	
}

class G extends Dynamic_method_Dispatch {
	public void show() {
		System.out.println("from G child class show method..");
	
	
}

}

/*
 * run time polymorphism will take place only when there is an inheritance between two class
 *so object is something which matters not the type of reference variable
 *let suppose I'm creating a class F which is not inheriting the parent class
 *so here can we implement run time polymorphism
 *not at all because here inheritance is not taking place class G is not a subclass so here we cannot refer it's object by parent class reference variable.
 */
