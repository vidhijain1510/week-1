/*Write a program to split the text into words, compare the result with the split() method and display the result 
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to find the length of the String without using the built-in length() method. 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
Then Create an array to store the words and use the indexes to extract the words
Create a method to compare the two String arrays and return a boolean
The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result
*/

import java.util.*;

public class SplitOfString {

    // Method to find and return the length of a string without using the built-in length() method
    public static int lengthOfString(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // Try to access each character
                count += 1; // Increment count
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string reached, catch the exception
        }
        return count;
    }

    // Method to split the text into words using charAt() without using the String split() method
    public static String[] customSplit(String text) {
        int wordCount = 0;
        int[] spaceIndexes = new int[lengthOfString(text)];
        
        // Count the words and find the indexes of spaces
        for (int i = 0; i < lengthOfString(text); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[wordCount++] = i; // Store the space index
            }
        }

        // Create the array of words
        String[] words = new String[wordCount + 1];
        int start = 0;
        int wordIndex = 0;
        
        // Extract words based on space indexes
        for (int i = 0; i < wordCount; i++) {
            words[wordIndex++] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1; // Move past the space
        }
        
        // The last word after the last space
        words[wordIndex] = text.substring(start);

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Scanner object creation to take user input 
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = input.nextLine(); // Taking user input

        // Calling the custom method to split the text
        String[] customWords = customSplit(string);

        // Calling the built-in split() method
        String[] builtInWords = string.split("\\s+");

        // Displaying the results
        System.out.println("Result using custom split method:");
        for (int i = 0; i < customWords.length; i++) {
            System.out.println(customWords[i]); // Corrected to print customWords[i]
        }

        System.out.println("\nResult using built-in split method:");
        for (int i = 0; i < builtInWords.length; i++) {
            System.out.println(builtInWords[i]); // Corrected to print builtInWords[i]
        }

        // Comparing both arrays and displaying if they are the same
        boolean areEqual = compareStringArrays(customWords, builtInWords);
        System.out.println("\nboth split results equal: " + areEqual);

        input.close();
    }
}
