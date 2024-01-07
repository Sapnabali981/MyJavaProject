import java.util.ArrayList;

import Packages_example.copy.adv_cal;
import Packages_example.copy.cal;

public class Package_ex {

	public static void main(String[] args) {
		/*
		 * in order to make use of cal and adv_cal class 
		 * we need to import it's packages as well
		 */
		cal c=new cal();
		int r=c.add(2, 3);
		adv_cal c1=new adv_cal();
		int res=c1.sub(3, 1);
		System.out.println(r +  " " +res);
		/*
		 * well all inbuilt java predefined classes are belonging to some package
		 * so if we want to use them need we need to import the package as well
		 * arraylist and list
		 */
		ArrayList a=new ArrayList();
	}
}
