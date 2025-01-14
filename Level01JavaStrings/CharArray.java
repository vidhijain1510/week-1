/*Write a program to return all the characters in a string using the user-defined method,  
compare the result with the String built-in toCharArray() method, and display the result
Hint => 
Take user input using the  Scanner next() method to take the text into a String variable
Write a method to return the characters in a string without using the toCharArray() 
Write a method to compare two string arrays and return a boolean result
In the main() call the user-defined method and the String built-in ​​toCharArray() method, compare the 2 arrays, and finally display the result
*/
import java.util.*;

public class CharArray{
	//Method to return the characters in a string without using the toCharArray() 
	public static char[] stringToArray(String str){
		//creating an array to store string value
		char[] stringArray = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++){
            stringArray[i] = str.charAt(i);			
		}
		return stringArray;
	}
	
	//Method to compare two string arrays and return a boolean result
	public static boolean comparingArrays(char[] str1, char[] str2){
		//If the length Two Strings are not same then they are different
		if(str1.length != str2.length){
			return false;
		}
		
		for(int i = 0; i < str1.length; i++){
		if(str1[i] != str2[i]){
				return false;
			}
		}
		
		return true;		
	}
	
	
	public static void main(String[] args){
		
		//To take user
		Scanner input = new Scanner(System.in);
		
		//Taking user input for string
		System.out.println("Enter a string: ");
		String string1 = input.next();
		
		//converting string to character array
		char[] stringArray1 = string1.toCharArray();
		
		if(comparingArrays(stringArray1, stringToArray(string1))){
			System.out.println("Both method in code and built-in are giving same results.");
		}else{
			System.out.println("Both method in code and built-in are not giving same results.");
		}
		
		input.close();
	}
}
		