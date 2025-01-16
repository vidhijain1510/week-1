/*Write a program to demonstrate StringIndexOutOfBoundsException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. 
Access the index using charAt() beyond the length of the String. This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. 
Then write try catch block for Exception while accessing the String method
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/

import java.util.*;

public class ShowingStringIndexOutOfBoundsException{
	
	// Method to generate the StringIndexOutOfBoundsException
	public static void generateExceptions(String text){
		
		//here it will create an exception
		System.out.println("Accessing character " + text.charAt(text.length()));//access an invalid index
	}
	
	// Method to handle the StringIndexOutOfBoundsException
	public static void handleExceptions(String text){
		try{
			generateExceptions(text);
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("Error: " + e.getMessage());
		}
	}
		
	public static void main(String[] args){
		//To take user input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String text = input.next();//taking string as an input
		
		
		System.out.println("Generating Exceptions...");
		try{
			//Main Firstly calls the method to generate the Exception
			generateExceptions(text);
		}catch(StringIndexOutOfBoundsException e){
			//Calling the method to handle the Exception
			System.out.println("Exception caught in main..." + e.getMessage());			
		}
		
		//this method calls the generateExceptions() within a try-catch block, which handles the exception
		System.out.println("Handling exception...");	
		handleExceptions(text);
		
		input.close();
	}
}