/*Reverse a String
Problem:
Write a Java program to reverse a given string without using any built-in reverse
functions.*/
import java.util.*;
public class ReverseString{
	public static String reverseString(String str){
		String str1 = "";
		for(int i = str.length()-1 ; i>=0; i--){
			str1+=str.charAt(i);
		}
		
		return str1;
	}
	
	public static void main(String[] args){
		//To take user input
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String string = input.next();
		
		System.out.println("Reverse string: " + reverseString(string));

		input.close();
	}
}