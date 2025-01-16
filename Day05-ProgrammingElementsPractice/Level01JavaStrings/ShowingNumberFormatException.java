/*Write a program to demonstrate NumberFormatException
Hint => 
Define a variable to take user input as a String 
Use Integer.parseInt() to generate this exception. Integer.parseInt() is a built-in function in java.lang.Integer class to extract the number from text. 
In case the text does not contain numbers the method will throw NumberFormatException which is a runtime exception
Write a Method to generate the Exception. Use Integer.parseInt(text) to extract number from the text. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate NumberFormatException. Use Integer.parseInt(text) to extract number from the text. This will generate a runtime exception. 
Use the try-catch block to handle the NumberFormatException as well as the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/
import java.util.*;

public class ShowingNumberFormatException{
	
	// Method to generate the NumberFormatException
	public static void generateExceptions(String text){
		
		//here it will create an exception
		System.out.println("Parsed value " + Integer.parseInt(text));// if the string does contain anything other than integer it will generate exception
	}
	
	// Method to handle the NumberFormatException
	public static void handleExceptions(String text){
		try{
			generateExceptions(text);
		}catch(NumberFormatException e){
			System.out.println("Error: " + e.getMessage());
		}catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());  //Handles any generic runtime exception
        }
	}
		
	public static void main(String[] args){
		//To take user input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String text = input.next();//taking string as an input
		
		
		System.out.println("Generating Exceptions...");
		try{
			//Main Firstly call the method to generate the Exception
			generateExceptions(text);
		}catch(NumberFormatException e){
			//Calling the method to handle the Exception
			System.out.println("Exception caught in main..." + e.getMessage());			
		}
		
		//this method calls the generateExceptions() within a try-catch block, which handles the exception
		System.out.println("Handling exception...");	
		handleExceptions(text);
		
		input.close();
	}
}