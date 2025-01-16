/*Write a program to find the frequency of characters in a string using nested loops and display the result
Hint => 
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 1D array. 
The logic used here is as follows:
Create an array to store the frequency of each character in the text and an array to store the characters in the text using the toCharArray() method
Loops to Find the frequency of each character in the text and store the result in an frequency array. 
For this use Nested Loop with Outer loop to iterate through each character in the text and initialize the frequency of each character to 1.
 And an Inner loop to check for duplicate characters. In case of duplicate increment the frequency value and set the duplicate characters to '0' to 
 avoid counting them again.
Create an 1D String array to store the characters and their frequencies. For this Iterate through the 
characters in the text and store the characters and their frequencies 
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
*/

import java.util.*;

public class CharacterFrequency1D {

    //Method to find the frequency of characters in a string using nested loops
    public static String[] findCharacterFrequency(String text) {
        //Converting the string to a character array
        char[] chars = text.toCharArray();
        
        //Creating an array to store frequencies of characters
        int[] frequency = new int[chars.length];
        
        //Creating an array to store the result the character and its frequency
        String[] result = new String[chars.length];
        
        //The string characters (Outer loop)
        for (int i = 0; i < chars.length; i++) {
            //If the character is already counted, skip it
            if (chars[i] == '0') {
                continue;
            }

            //Initialize frequency for the current character to 1
            frequency[i] = 1;
            
            //Loop through the rest of the string to find duplicates
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequency[i]++;  //Increment the frequency if a duplicate is found
                    chars[j] = '0';  //Marking the duplicate character to avoid counting again
                }
            }
        }

        //Creating the result array to store the character and its frequency
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {  // Only include characters that have not been marked as '0'
                result[index] = chars[i] + ": " + frequency[i];
                index++;
            }
        }

        //Trimming the result array to remove any empty spaces
        String[] trimmedResult = new String[index];
        System.arraycopy(result, 0, trimmedResult, 0, index);

        return trimmedResult;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking user input for the string
        System.out.print("Enter a string: ");
        String inputText = input.nextLine();

        // The frequency of characters
        String[] result = findCharacterFrequency(inputText);

        // Displaying the result
        System.out.println("\nCharacter Frequency:");
        for (String entry : result) {
            System.out.println(entry);
        }
		
		input.close();
    }
}

