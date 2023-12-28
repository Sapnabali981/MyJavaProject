package Arrays;

public class Arrays_of_Objects {
	public static void main(String[] args) {
		/*
		 * like we usually create an array of type integer,float etc.
		 * can we create an array which can hold values of type books,student
		 * yes off course we can do
		 * creating an array which can hold several book object in it
		 * each book will have some properties like author,name and price.
		 */
		//creating an array which is of type book
		book b[]=new book[3];//basically here 3 books object can be stored at specific index of an array
		//as I have to store object of book in an mentioned array so for that I'll be creating an objects
		book b1=new book();
		b1.author="Sapna";
		b1.price=1233;
		b1.name="radhe radhe";
		
		//creating object 2
		book b2=new book();
		b2.author="Bali";
		b2.price=190;
		b2.name="krishna";
		
		//creating an object 3
		book b3=new book();
		b3.author="pushpa";
		b3.name="bali";
		b3.price=1455;
		
		//passing all these 3 objects into an array
		//objects can be passed using their reference variables
		b[0]=b1;
		b[1]=b2;
		b[2]=b3;
		/*
		 * print the values of an array using enhanced for loop
		 * 
		 */
		for(book n:b)
		{
			/*
			 * here if I'm asking b to give one value at a time it is going to give me one object
			 */
			System.out.print(n.author + " " + n.name + " " + n.price);
			System.out.println();
		}
		
		
		
	}

}
class book{
	/*
	 * properties of an java can be represented using instance variables
	 */
	String name;
	String author;
	int price;
}