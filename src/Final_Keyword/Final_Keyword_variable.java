package Final_Keyword;

public class Final_Keyword_variable {
	public static void main(String[] args) {
		/*
		 * if we want to make any variable as constants then we can make it as final
		 * once the variable is final then we cannot change it's value once it is been declared.
		 */
		final int j=10;
		System.out.println(j);
		/*
		 * trying to update the value of j variable
		 */
		//j=19;//getting compile time error because we cannot change the value of final variable.
		
	}

}
