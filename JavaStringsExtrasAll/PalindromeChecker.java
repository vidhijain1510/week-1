/*Palindrome Checker:
○ Write a program that checks if a given string is a palindrome (a word, phrase, or
sequence that reads the same backward as forward).
○ Break the program into functions for input, checking the palindrome condition,
and displaying the result.*/

import java.util.*;

public class PalindromeChecker {

    //Function to get user input
    public static String getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        return input.nextLine();  //Returns the entered string
    }

    //Function to check if the given string is a palindrome
    public static boolean isPalindrome(String str) {
        StringBuilder cleanedStr = new StringBuilder();

        //Removing non-alphanumeric characters and converting to lowercase
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                cleanedStr.append(Character.toLowerCase(c));
            }
        }

        //Checking if the cleaned string is a palindrome
        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;  //If characters don't match not a palindrome
            }
            left++;
            right--;
        }

        return true;  //If all characters match it is palindrome
    }

    //Function to display the result
    public static void displayResult(boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    // Main method to drive the program
    public static void main(String[] args) {
        String input = getInput();  //Getting the input from the user
        boolean result = isPalindrome(input); 
        displayResult(result); 
    }
}
