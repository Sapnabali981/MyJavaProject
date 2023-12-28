package Arrays;

public class JaggedArrays {
	public static void main(String[] args) {
		/*
		 * whenever we are creating multi-dimensional array ,we do specify size of rows and columns
		 * but what if column size is not fixed it is even possible...?
		 * yes it is possible but the size of rows has to be specified compulsary
		 * such arrays are called as JaggedArrays.
		 */
		//creating jagged array 
		int a[][]=new int[3][];
		/*
		 * if we want different set of columns in each row then we can do that as well
		 */
		//for example in row 0 I want coulmns of size 4
		a[0]=new int[4];
		//for example in row 1 I want columns of size 3
		a[1]=new int[3];
		//for example in row 2 I want columns of size 5
		a[2]=new int[5];
		
		/*
		 * If I want to assign random values to my 2d array then I can do that using random function of math.class
		 */
		/*
		 * length function will find the exact length of an array
		 */
		System.out.println("The length of an array is:"+a.length);
		//assigning values to 2d array
		for(int i=0;i<a.length;i++) {
			//inner for loop will iterate on columns means on those arrays which are present at each row
			for(int j=0;j<a[i].length;j++) {
				/*
				 * using random function which returns a decimal point values
				 */
				a[i][j]=(int)(Math.random()*10);
			}
			
		}
		//printing the values of an 2d array
		for(int i=0;i<a.length;i++) {
			//inner for loop will iterate on columns means on those arrays which are present at each row
			for(int j=0;j<a[i].length;j++) {
				/*
				 * using random function which returns a decimal point values
				 */
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		/*
		 * there are basically certain drawbacks of an array
		 * whenever we are specifying any size to array suppose 4
		 * we can only store 4 values in it 
		 * if we want to expand the size of an previous array then in that case we will
		 * create the new array and copy elements from the previous array
		 * it is basically time consuming process
		 * so if size of an array is fixed then we can make use of an arrays.
		 * a part from that we cannot store data of different data type in an array
		 * because array can hold multiple data of same data type.
		 */
	}

}
