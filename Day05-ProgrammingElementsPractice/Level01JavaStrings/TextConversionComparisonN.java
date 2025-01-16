/*Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to to find and return the length of a string without using the length() method. 
Create a method to take the word array and return 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
The main function calls the user-defined method and display the result in a tabular format. During display make sure to convert the length value from String to Integer and then display


*/
import java.util.*;

public class TextConversionComparisonN {

    // Method to split text into words without using split() method
    public static String[] splitTextIntoWords(String text) {
        StringBuilder word = new StringBuilder();
        String[] words = new String[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word.append(ch);
            } else {
                words[index++] = word.toString();
                word.setLength(0); // Clear the word
            }
        }
        // Add the last word if any
        if (word.length() > 0) {
            words[index++] = word.toString();
        }

        // Resize the array to actual number of words
        String[] result = new String[index];
        System.arraycopy(words, 0, result, 0, index);
        return result;
    }

    // Method to find the length of a string without using length() method
    public static int findLength(String text) {
        int length = 0;
        for (char ch : text.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String inputText = input.nextLine();

        // Split text into words using custom method
        String[] words = splitTextIntoWords(inputText);

        // Get words and their lengths
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Display the results in tabular format
        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (String[] wordInfo : wordsWithLengths) {
            System.out.println(wordInfo[0] + "\t" + Integer.parseInt(wordInfo[1]));
        }

        input.close();
    }
}