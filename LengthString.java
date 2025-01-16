/*Write a program to find and return the length of a string without using the length() method 
Hint => 
Take user input using the Scanner next() method 
Create a method to find and return a string's length without using the built-in length() method. 
The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
The main function calls the user-defined method as well as the built-in length() method and displays the result
*/
import java.util.*;

public class LengthString{
	public static int lengthOfString(String str){
		//Method to find and return a string's length without using the built-in length() method.
		int count = 0;
		try{
			while(true){
				str.charAt(count);
				count+=1;
			}
		}catch(IndexOutOfBoundsException e){
			System.out.println("Error: " +  e.getMessage());
		}
		return count;		
	}
	
	
	public static void main(String[] args){
		//Scanner object creation to take usser input 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String string = input.next();//Taking user input
		
		int countLength = string.length();//built-in length() method
		
		//Displays the result
		System.out.println("The length of string by built-in method is: " + countLength + "\nThe length of string by custom method is: " + lengthOfString(string));
		
		input.close();
	}
}
