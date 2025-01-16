/*Write a program to demonstrate ArrayIndexOutOfBoundsException
Hint => 
Define a variable of array of names and take input from the user
Write a Method to generate the Exception. Here access index larger then the length of the array. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array. This will generate a runtime exception. 
Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/

import java.util.*;

public class ShowingArrayIndexOutOfBoundsException{
	
	// Method to generate the ArrayIndexOutOfBoundsException
	public static void generateExceptions(String[] arr){
		
		//here it will create an exception
		System.out.println("Accessing character " + arr[arr.length]);//access an invalid index
	}
	
	// Method to handle the ArrayIndexOutOfBoundsException
	public static void handleExceptions(String[] arr){
		try{
			generateExceptions(arr);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error: " + e.getMessage());
		}catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());  //Handles any generic runtime exception
        }
	}
		
	public static void main(String[] args){
		//To take user input
		Scanner input = new Scanner(System.in);
		
		String[] arrayOfNames =  new String[5];//variable of array of names
		
		System.out.println("Enter 5 names: ");
		//take input from the user
		for(int i = 0; i < 5; i++){
			arrayOfNames[i]=input.nextLine();
		}
		
		
		System.out.println("Generating Exceptions...");
		try{
			//Main Firstly calls the method to generate the Exception
			generateExceptions(arrayOfNames);
		}catch(ArrayIndexOutOfBoundsException e){
			//Calling the method to handle the Exception
			System.out.println("Exception caught in main..." + e.getMessage());			
		}
		
		//this method calls the generateExceptions() within a try-catch block, which handles the exception
		System.out.println("Handling exception...");	
		handleExceptions(arrayOfNames);
		
		input.close();
	}
}