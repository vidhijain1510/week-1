/*Write a program to find the frequency of characters in a string using unique characters and display the result
Hint => 
Create a method to Find unique characters in a string using charAt() method and return them as 1D array. 
 Use Nested Loops to find the unique characters in the text
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 2D array. 
The logic used here is as follows:
Create an array to store the frequency of characters in the text. 
ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Call the uniqueCharacters() method to find the unique characters in the text
Create a 2D String array to store the unique characters and their frequencies. 
Loop through the unique characters and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.  
*/
import java.util.*;

public class CharacterFrequencyUsingUnique {

    //Method to find unique characters in a string using charAt() and return them as a 1D array
    public static char[] uniqueCharacters(String text) {
        int length = text.length();
        char[] uniqueChars = new char[length]; // To store unique characters
        int uniqueCount = 0;

        //Looping through the string to find unique characters
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            
            //Nested loop to check if the character already appeared
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            //If the character is unique storing it in the array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        //Creating a new array of exact size for unique characters
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    //Method to find the frequency of characters in the string and return a 2D array
    public static String[][] findCharacterFrequency(String text) {
        //Unique characters first
        char[] uniqueChars = uniqueCharacters(text);
        
        //Creating a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];
        
        //Looping through unique characters and find their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            char currentChar = uniqueChars[i];
            int frequency = 0;
            
            //The frequency of the current unique character
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    frequency++;
                }
            }

            //Storing the character and its frequency in the 2D array
            result[i][0] = String.valueOf(currentChar);  //The character
            result[i][1] = String.valueOf(frequency);    //The frequency
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking user input for the string
        System.out.print("Enter a string: ");
        String inputText = input.nextLine();

        //The frequency of characters
        String[][] result = findCharacterFrequency(inputText);

        //Displaying the result
        System.out.println("\nCharacter Frequency:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + ": " + result[i][1]);
        }
		
		input.close();
    }
}
