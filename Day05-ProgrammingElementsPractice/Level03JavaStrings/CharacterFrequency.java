/*Write a program to find the frequency of characters in a string using charAt() method and display the result
Hint => 
Create a method to find the frequency of characters in a string using charAt() method and
 return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as
 indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Create an array to store the characters and their frequencies
Loop through the characters in the text and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.  
*/

import java.util.*;

public class CharacterFrequency {

    //Method to find the frequency of characters in a string using charAt() method
    public static String[][] findCharacterFrequency(String text) {
        //Array to store the frequency of characters (256 ASCII characters)
        int[] frequency = new int[256];
        
        //Looping through the string to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; 
        }

        //Creating a 2D array to store characters and their frequencies
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2]; //2D array to store characters and their frequencies
        int index = 0;
		
        //The result array with characters and their frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Store the character
                result[index][1] = String.valueOf(frequency[i]); // Store the frequency
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputText = input.nextLine();

        //The frequency of characters
        String[][] result = findCharacterFrequency(inputText);

        //Displaying the results
        System.out.println("\nCharacter Frequency:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + ": " + result[i][1]);
        }
    }
}
