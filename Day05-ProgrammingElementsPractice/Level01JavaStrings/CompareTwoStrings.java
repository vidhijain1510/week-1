/*Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
Hint => 
Take user input using the  Scanner next() method for 2 String variables
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String Built-In method to check if the results are the same and display the result 
*/
import java.util.*;

public class CompareTwoStrings{
	//Method to compare Two String 
	public static boolean compareString(String str1, String str2){
		
		//If the length Two Strings are not same then they are different
		if(str1.length() != str2.length()){
			return false;
		}
		
		for(int i = 0; i < str1.length(); i++){
		if(str1.charAt(i) != str2.charAt(i)){
				return false;
			}
		}
		
		return true;		
	}
	
	public static void main(String [] args){
		
		//To take user input
		Scanner input = new Scanner(System.in);
		
		
		//Taking string 1 as a input
		System.out.println("Enter String 1: ");
		String string1 = input.next();
		
		//Taking string 2 as a input
		System.out.println("Enter String 2: ");
		String string2 = input.next();
		
		//Checking if both strings are equal using built in method
		boolean compareStringUsingBuiltIn = string1.equals(string2);
		
		//checking if both the method are giving same results for the given string or not
		if(compareString(string1,string2) == compareStringUsingBuiltIn){
			System.out.println("Both method and built-in equals() are giving same results.");
		}else{
			System.out.println("Both method and built-in equals() are not giving same results.");
		}
		input.close();
	}
}