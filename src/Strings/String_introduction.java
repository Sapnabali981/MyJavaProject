package Strings;

public class String_introduction {
	public static void main(String[] args) {
		/*
		 * String is basically a class in java
		 * array of characters is also called as strings
		 * string is a collection of characters
		 * since string is a predefined class we can create certain objects for it.
		 */
		String str=new String("Sapna");
		System.out.println(str);
		/*
		 * since string is a class once the object get created inside the JVM
		 * reference variable will get stored inside stack memory
		 * objects get allocated in to heap memory
		 * if I'm passing any value to my object's constructor then automatically it get
		 * stored my object only.
		 * if we are not passing any value to my string object
		 * then by default value of string object is null
		 */
		/*
		 * since String is a class so it contains many methods which can be accessed with the help of
		 * object's reference variable
		 */
		//charAt method will return a character value of a specific index
		System.out.println(str.charAt(2));
		//similarly we have concat method which is used for concatenation purpose
		System.out.println(str.concat("bali"));
		/*
		 * string object can be created in 2 different ways 
		 * using new keyword
		 * or without new keyword as well
		 */
	}

}
