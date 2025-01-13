/*Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
Hint => 
Take user input for rows and columns, create a 2D array (Matrix), and take the user input 
Copy the elements of the matrix to a 1D array. For this create a 1D array of size rows*columns as in int[] array = new int[rows * columns];
Define the index variable and Loop through the 2D array. Copy every element of the 2D array into the 1D array and increment the index
Note: For looping through the 2D array, you will need Nested for loop, Outer for loop for rows, and the inner for loops to access each element
*/
import java.util.*;

public class MultiDimensionalArrays {
	public static void main(String[] args){
		
		//To input via Scanner
		Scanner input = new Scanner(System.in);
		
		//Take user input for rows and columns
		System.out.println("Enter the size of rows: ");
		int rows = input.nextInt();
		
		System.out.println("Enter the size of columns: ");
		int columns = input.nextInt();
		
		int[][] twoDimensionalArray = new int[rows][columns];
		
		// Take user input to fill the twoDimensionalArray
        System.out.println("Enter the elements of the twoDimensionalArray:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                twoDimensionalArray[i][j] = input.nextInt();  // Store the input value in the twoDimensionalArray
            }
        }
		
		//For 2D Array into a single dimension array
		int[] singleDimensionArray = new int[rows*columns]; // 1D array of size rows*columns to store elements of 2D array
		
		int index = 0;
		
		// Copy elements from the 2D array into the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                singleDimensionArray[index] = twoDimensionalArray[i][j];  // Copy the element into the 1D array
                index++;  // Increment the index for the 1D array
            }
        }
		
		// Display the 1D array with the copied elements
        System.out.println("\nThe 1D array with copied elements is:");
        for (int i = 0; i < singleDimensionArray.length; i++) {
            System.out.print(singleDimensionArray[i] + " ");  // Print each element of the 1D array
        }
		
		input.close();
	}
}
		
		