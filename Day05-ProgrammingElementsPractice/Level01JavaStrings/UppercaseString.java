/*Write a program to convert the complete text to uppercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Upper Case. 
Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toUpperCase() to get the Uppercase Text and compare the two strings using the user-defined method. 
And finally display the result
*/
import java.util.*;

public class UppercaseString{
	//method to convert each character if it is lowercase to the Upper Case. 
	public static String uppercaseManually(String text){
		String result = "";
		
		for(int i = 0; i < text.length(); i++){
			int currentCharacter = text.charAt(i);
			if(currentCharacter >= 97 &&  currentCharacter<= 122){
				result+= (char)(currentCharacter-32);
			}else{
				result+=currentCharacter;
			}
		}
		return result;
	}
	
	//method to compare two strings 
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
		
	public static void main(String []  args){
		//To take user input
		Scanner input = new Scanner(System.in);
		
		//Taking string as a input
		System.out.println("Enter a string: ");
		String text = input.nextLine();
		
		String uppercaseUsingBuiltIn = text.toUpperCase();
		
		if(compareString(uppercaseUsingBuiltIn, uppercaseManually(text))){
			System.out.println("Both methods are giving same results.");
		}else{
			System.out.println("Both methods are not giving same results.");
		}
		
		input.close();
	}
}