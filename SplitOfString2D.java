/*Write a program to split the text into words and return the words along with their lengths in a 2D array
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function
 String.valueOf() to generate the String value for the number
The main function calls the user-defined method and displays the result in a tabular format. 
During display make sure to convert the length value from String to Integer and then display
*/

import java.util.*;

public class SplitOfString2D {

    //Method to find and return the length of a string without using the built-in length() method
    public static int lengthOfString(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); //Try to access each character
                count += 1; 
            }
        } catch (IndexOutOfBoundsException e) {
            //catchs the exception
        }
        return count;
    }

    //Method to split the text into words using charAt() without using the String split() method
    public static String[] customSplit(String text) {
        int wordCount = 0;
        int[] spaceIndexes = new int[lengthOfString(text)];
        
        //Counting the words and find the indexes of spaces
        for (int i = 0; i < lengthOfString(text); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[wordCount++] = i; //Storing the space index
            }
        }

        //Creating the array of words
        String[] words = new String[wordCount + 1];
        int start = 0;
        int wordIndex = 0;
        
        //Extracting words based on space indexes
        for (int i = 0; i < wordCount; i++) {
            words[wordIndex++] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1; // Move past the space
        }
        
        //The last word after the last space
        words[wordIndex] = text.substring(start);

        return words;
    }
	
	//Method to create a 2D array of words and their lengths
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];  // Storing the word
            result[i][1] = String.valueOf(lengthOfString(words[i]));  // Storing the length of the word
        }
        
        return result;
    }

    public static void main(String[] args) {
        //Scanner object creation to take user input 
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = input.nextLine(); // Taking user input

        //Calling the custom method to split the text
        String[] customWords = customSplit(string);

        //Calling the method to get the words and their lengths
        String[][] wordsWithLengths = getWordsAndLengths(customWords);

        //Displaying the result in a tabular format
        System.out.println("\nWord\t\tLength");
        
        for (int i = 0; i < wordsWithLengths.length; i++) {
            //Displaying each word and its length converting the length to an integer
            System.out.println(wordsWithLengths[i][0]+ "\t\t" +Integer.parseInt(wordsWithLengths[i][1]));
        }
		
		
        input.close();
    }
}