
public class Methods_9 {
	public static void main(String[] args) {
		/*
		 * in order to perform certain action we make use of methods in java
		 * methods will execute only if it is called
		 * there are following types of methods :- parameterized methods and non parameterized
		 * paramterized methods accpets parameter and returns values after the execution is done
		 * non parameterized methods do not accept parameter
		 */
		//creating a object for class computer
		computer c=new computer();
		c.playMusic();
		c.getClass();
		int r=c.giveMePen(10);
		System.out.println("The value of r is:"+r);
		
	}

}
class computer{
	public void playMusic() {
		System.out.println("music is playing...");
	}
	public int giveMePen(int cost) {
		if(cost>=10) {
			int n=1;
			return n;
		}
		return -1;
	}
}