/*Write a program to split the text into words and find the shortest and longest strings in a given text
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. 
Use String built-in function String.valueOf() to generate the String value for the number
Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array. 
The main function calls the user-defined methods and displays the result. 
*/
import java.util.*;

public class ShortestLongestString {

    //Method to return the length of a string without using the built-in length() method
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
            result[i][1] = String.valueOf(lengthOfString(words[i]));  //Storing the length of the word
        }
        
        return result;
    }
	
	//Method to find the shortest and longest word lengths from a 2D array
    public static int[] findShortestAndLongest(String[][] result) {
        int shortestLength = Integer.MAX_VALUE;
        int longestLength = Integer.MIN_VALUE;
        String shortestWord = "";
        String longestWord = "";

        for (int i = 0; i < result.length; i++) {
            int currentLength = Integer.parseInt(result[i][1]); //Converts length from String to int
            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestWord = result[i][0];
            }
            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestWord = result[i][0];
            }
        }

        //This will return an array with the shortest and longest lengths
        return new int[] {shortestLength, longestLength };
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

        //Finding the shortest and longest word lengths
        int[] result = findShortestAndLongest(wordsWithLengths);

        //Displaying the results
        System.out.println("Shortest word length: " + result[0]);
        System.out.println("Longest word length: " + result[1]);
		
        input.close();
    }
}