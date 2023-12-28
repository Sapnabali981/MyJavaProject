package Strings;

public class ImmutableStrings {
	/*can we update the value of String objects in java
	 * no since string is a class in java objects which we create are basically constant
	 * we cannot change them once they are created inside the string constant pool
	 * string constant pool is the area present inside the heap memory.
	 * main method is the starting point from the execution of programs begans
	 */
	public static void main(String[] args) {
		
	
	String str=new String("Sapna");
	//let say know I want to update the value of str
	str=str+"bali";
	System.out.println(str);
	/*
	 * while updating value of string object here we are making changes in the existing object
	 * instead we are creating new object with value sapnabali and the reference variable will refer to that
	 * new object.
	 * then what happens to old object since no reference variable is pointing to object so it is of no use
	 * it get garbage collected by java in order to take memory back.
	 */
	String s1="bali";
	String s2="bali";
	/*
	 * in this above case basically how many objects are getting created inside heap.
	 * one object only
	 * because initially jvm checks do we have any object with value bali in string pool if yes then s1 will start pointing to existing object
	 * if not then new string object with value bali will get created inside the heap.
	 * similarly for second string object again jvm checks do we have any string object with value bali if yes then s2 will start pointing to same object which s1 is refering to.
	 * so basically no separate objects are created both the reference varaible is poninting to the same object only.
	 * by this concept somewhere we are making the memory efficent because otherwise there might be chances where multiple string object with same data values will get created inside the heap uneccessarly.
	 * in order to verify whether both the reference variable are poninting to same object or not make use ==operator
	 */
	System.out.println(s1==s2);//== operator checks whether both the reference variable are poniting to same object or not
	/*
	 * so we cannot change the string objects once it is created heap memory since they are constant in nature and immutable in nature
	 * but What if I want to create a string object which can be changed unlike primitive data types is it even possible
	 * yes we can do that using mutable string like string builder and string buffer.
	 */
}

}