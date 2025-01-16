/*Write a program to find the first non-repeating character in a string and show the result
Hint => 
Non-repeating character is a character that occurs only once in the string
Create a Method to find the first non-repeating character in a string using charAt() method and return the character. 
The logic used here is as follows:
Create an array to store the frequency of characters in the text. 
ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Loop through the text to find the first non-repeating character in the text by checking the frequency of each character
In the main function take user inputs, call user-defined methods, and displays result. 
*/

import java.util.*;

public class FirstNonRepeatingCharacter {

    //Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingCharacter(String text) {
        //Creating an array to store the frequency of characters (256 ASCII characters)
        int[] frequency = new int[256]; 
        
        //First loop: Counting the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }
        
        //Second loop: The first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar; 
            }
        }
        
        //If no non-repeating character is found, return a message character 
        return '\0';
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking user input for the string
        System.out.print("Enter a string: ");
        String inputText = input.nextLine();

        //Finding the first non-repeating character
        char result = findFirstNonRepeatingCharacter(inputText);

        //Displaying the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
		
		input.close();
    }
}

