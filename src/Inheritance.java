
public class Inheritance {
	public static void main(String[] args) {
		/*
		 * inheritance is a process where child class will inherit certain properties and behaviour 
		 * from parent class
		 * child class inherit all parent class properties with the help of keyword extends
		 */
		//creating a object of child class
		adv_calculator c=new adv_calculator();
		Very_adv_calculator vc= new Very_adv_calculator();
		int res=vc.power(3, 2);
		int r=c.add(12,13);
		int r1=c.div(4, 2);
		int r2=c.sub(12, 3);
		int r3=c.mul(5, 10);
		System.out.println("The values are : " + r + " " + r1 + " " + r2 + " " + r3 + " "+res);
	}

}
//parent class
class Main_calculator{
	public int add(int n1,int n2) {
		return n1+n2;
	}
	public int sub(int n1,int n2) {
		return n1-n2;
	}
}
//child class
class adv_calculator extends Main_calculator{
	/*
	 * since this class is a child class which is going to inherit add as well as sub method from parent class
	 */
	public int mul(int n1,int n2) {
		return n1*n2;
	}
	public int div(int n1,int n2) {
		return n1/n2;
	}
}

class Very_adv_calculator extends adv_calculator{
	/*
	 * this class is inheriting all properties from adv_calculator
	 * adv_calculator is inheriting all properties from main_calculator
	 * so here you see a pattern of multi level inheritance
	 * where a single class can have only one parent
	 * A single class cannot have multiple parents that's why in java does'nt support multiple inheritance.
	 * because it may possible ambiguity situation will arises which can lead a confusion to complier.
	 */ 
	public int power(int n1,int n2) {
		return (int)(Math.pow(n1, n2));
	}
}
