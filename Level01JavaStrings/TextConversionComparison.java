/*Write a program to convert the complete text to lowercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Upper Case. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toUpperCase() to get the Uppercase Text and compare the two strings using the user-defined method. And finally display the result
Write a program to split the text into words and return the words along with their lengths in a 2D array
*/


import java.util.*;

public class TextConversionComparison {

    // Method to convert text to uppercase without using built-in toUpperCase()
    public static String convertToUpperCase(String text) {
        StringBuilder uppercaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // Convert to uppercase
            }
            uppercaseText.append(ch);
        }
        return uppercaseText.toString();
    }

    // Method to convert text to lowercase without using built-in toLowerCase()
    public static String convertToLowerCase(String text) {
        StringBuilder lowercaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // Convert to lowercase
            }
            lowercaseText.append(ch);
        }
        return lowercaseText.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Method to split text into words and return a 2D array with words and their lengths
    public static String[][] splitTextIntoWords(String text) {
        String[] words = text.split(" ");
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String inputText = input.nextLine();

        // Convert text to uppercase using built-in method
        String builtInUpperCase = inputText.toUpperCase();

        // Convert text to uppercase using custom method
        String customUpperCase = convertToUpperCase(inputText);

        // Compare the results for uppercase conversion
        boolean areUppercaseEqual = compareStrings(builtInUpperCase, customUpperCase);

        // Convert text to lowercase using custom method
        String customLowerCase = convertToLowerCase(inputText);

        // Convert text to lowercase using built-in method
        String builtInLowerCase = inputText.toLowerCase();

        // Compare the results for lowercase conversion
        boolean areLowercaseEqual = compareStrings(builtInLowerCase, customLowerCase);

        // Split text into words and their lengths
        String[][] wordsWithLengths = splitTextIntoWords(inputText);

        // Display the results
        System.out.println("\nOriginal Text: " + inputText + "\nUppercase (built-in method): " + builtInUpperCase + "\nUppercase (custom method): " + customUpperCase + "\nAre both uppercase conversions identical? " + areUppercaseEqual+ "\nLowercase (built-in method): " + builtInLowerCase + "\nLowercase (custom method): " + customLowerCase + "\nAre both lowercase conversions identical? " + areLowercaseEqual);

        System.out.println("\nWords and their lengths:");
        for (String[] wordInfo : wordsWithLengths) {
            System.out.println("Word: " + wordInfo[0] + ", Length: " + wordInfo[1]);
        }

        input.close();
    }
}