/*Write a program to demonstrate IllegalArgumentException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Here use the subString() and set the start index to be greater than the end index. 
This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate IllegalArgumentException. Here use the subString() and set the start index to be greater than the end index. 
This will generate a runtime exception. Use the try-catch block to handle the IllegalArgumentException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/
import java.util.*;

public class ShowingIllegalArgumentException {
    
    //Method to generate an IllegalArgumentException
    public static void generateExceptions(String text) {
        //start index is greater than end index
        int startIndex = 5;
        int endIndex = 4;

        if (startIndex > endIndex) {
            throw new IllegalArgumentException("Start index cannot be greater than end index.");
        }
        
        //this will not be reached if the exception is thrown
        System.out.println(text.substring(startIndex, endIndex));
    }

    //Method to handle the IllegalArgumentException
    public static void handleExceptions(String text) {
        try {
            generateExceptions(text);  //Calling the method that generates the exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
        
    }

    public static void main(String[] args) {
        // To take user input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String text = input.next();  // Taking string as input

        //This will generate the exception and handle it in the main method
        System.out.println("Generating Exceptions...");
        try {
            //Calling the method to generate the exception
            generateExceptions(text);  // This will generate the IllegalArgumentException
        } catch (IllegalArgumentException e) {
            //Handling the exception 
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        //call to the method to handle the exception inside a try-catch block
        System.out.println("Handling exception...");
        handleExceptions(text);  //This will handle the exception 

        input.close();
    }
}
