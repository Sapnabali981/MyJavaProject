package Strings;

public class mutableStrings {
	
	public static void main(String[] args) {
		/*
		 * strings are basically immutable in nature so once we are creating string object we cannot change them
		 * so in order to create mutable strings in java we will make use of stringbuffer nad string builder class
		 */
		//creating a object for Stringbuffer
		StringBuffer str=new StringBuffer("Sapna bali");
		System.out.println(str);
		//passing value to my string buffer object in the constructor
		System.out.println(str.capacity());
		
		/*
		 * string buffer by default provide buffer size of 16 bytes
		 * if we want to change the value of string buffer then we can do that using append function
		 */
		System.out.println(str.append("Thangavelu"));
		/*
		 * if we want to delete specific character value from string buffer object then we can make use of deletechatAt function
		 */
		System.out.println(str.deleteCharAt(3));
		/*
		 * if we want to insert certain character from string buffer object then we can do that using certain insert function
		 */
		System.out.println(str.insert(3,"Java"));
		
		/*
		 * can we convert stringbuffer object into string object or vice versa
		 * usually we don't follow such operations but if we really want to do then we can make use to String method
		 * 
		 */
		
		
		String s=str.toString();
		System.out.println(s);
		/*
		 * if we want to set length of an string buffer object then we can do that using setLength function
		 */
		str.setLength(50);
		System.out.println(str.capacity());
		
		
	}

}
