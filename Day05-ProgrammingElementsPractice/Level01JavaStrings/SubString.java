/*Write a program to create a substring from a String using the charAt() method. Also, 
use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
Hint => 
Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result
*/

import java.util.*;

public class SubString{
	//method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
	public static String substringWithoutBuiltIn(String str, int beginIndex, int endIndex){
		String substring = "";
		for(int i = beginIndex;i <= endIndex; i++){
			substring += str.charAt(i);//Storing the substring in string builder
		}
		
		return substring;	
		
	}
	
	public static void main(String[] args){
		
		//To take usser input
		Scanner input = new Scanner(System.in);
		
		//Taking string input
		System.out.println("Enter a string: ");
		String string1 = input.next();
		
		//Taking begin index and end index as input
		System.out.println("Enter begin and end index: ");
		int beginIndex = input.nextInt();
		int endIndex = input.nextInt();
		
		//Exceptional Handling if the user give indexes that are not in string given string 
		try{
			/*Creating substring using built-in method
			built-in substring(beginIndex, endIndex) method excludes the character at endIndex.
			To match the working of the custom method, I added +1 to the endIndex when calling substring().*/
			String substringUsingBuiltIn = string1.substring(beginIndex, endIndex + 1);
		
			//checking if both the method are giving same results for the given string or not
			if(substringUsingBuiltIn.equals(substringWithoutBuiltIn(string1,beginIndex,endIndex))){
				System.out.println("Both method in code and built-in are giving same results.");
			}else{
				System.out.println("Both method in code and built-in are not giving same results.");
			}
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("Error: " + e.getMessage());
		}
		
		input.close();
	}
}
