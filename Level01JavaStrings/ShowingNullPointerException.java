/*Write a program to demonstrate NullPointerException. 
Hint => 
Write a Method to generate the Exception. Here define the variable text and initialize it to null. 
Then call one of the String Method to generate the exception
Write the Method to demonstrate NullPointerException. Here define the variable text and initialize it to null. 7
Then write try catch block for handling the Exception while accessing one of the String method
From the main Firstly call the method to generate the Exception then refactor the code to call the method to handle the RuntimeException
*/

import java.util.*;

public class ShowingNullPointerException{
	
	// Method to generate the NullPointerException
	public static void generateExceptions(){
		String text = null;
		//here if we ask for length of the string then it will create an exception
		System.out.println("length: " + text.length());
	}
	
	// Method to handle the NullPointerException
	public static void handleExceptions(){
		try{
			generateExceptions();
		}catch(NullPointerException e){
			System.out.println("Error: " + e.getMessage());
		}
	}
		
	public static void main(String[] args){
		System.out.println("Generating Exceptions...");
		try{
			//Main Firstly call the method to generate the Exception
			generateExceptions();
		}catch(NullPointerException e){
			//Calling the method to handle the RuntimeException
			System.out.println("Exception caught in main..." + e.getMessage());			
		}
		
		//this method calls the generateExceptions() within a try-catch block, which handles the exception
		System.out.println("Handling exception...");	
		handleExceptions();
	}
}