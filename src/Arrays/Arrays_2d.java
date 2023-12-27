package Arrays;

public class Arrays_2d {

	public static void main(String[] args) {
		/*
		 * arrays of arrays is called as 2d arrays
		 * where one big array there will be multiple arrays
		 * 2d arrays are basically represented in the form of matrices
		 * which contains set of rows and columns
		 * the indexing starts from 0 and ends at n-1
		 * for internal arrays also the indexing starts from 0 and end at n-1
		 * in order to fetch/access certain array element we can do that with the help of index value.
		 */
		//creating 2d array
		int arr[][]= {{2,3,4},
				{5,6,7},
				{8,9,10}};
		/*
		 * here we are already aware about the values of an array hence creating 2d array in static way
		 */
		//in order to access any the 2d array element at row 1 we can make use of index value
		System.out.println(arr[0][1]);
		/*
		 * we can print all the elements of 2d array using nested for loop
		 * outer for loop will iterate on rows
		 * inner for loop will iterate on those array which are present at every row
		 */
		for(int row=0;row<arr.length;row++) {
			for(int j=0;j<arr[row].length;j++) {
				/*
				 * within each row we will one array so it is very imp to know length of internal array as well
				 * we can find that using length of an row itself.
				 */
				System.out.print(arr[row][j]);
			}
			System.out.println();
			//once every row is printed next row should began from next line.
		}
	}
}
