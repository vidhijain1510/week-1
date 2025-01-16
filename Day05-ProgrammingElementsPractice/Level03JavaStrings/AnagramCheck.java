/*Write a program to check if two texts are anagrams and display the result
Hint => 
Anagram is a word or phrase formed by rearranging the same letters to form different words or phrase,
Write a method to check if two texts are anagrams. The logic used here is as follows:
Check if the lengths of the two texts are equal
Create an array to store the frequency of characters in the strings for the two text
Find the frequency of characters in the two texts using the loop
Compare the frequency of characters in the two texts. If the frequencies are not equal, return false
In the main function take user inputs, call user-defined methods, and displays result.  
*/

import java.util.*;

public class AnagramCheck {

    //Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        //Removing any whitespaces and converting to lowercase to ignore case sensitivity
        text1 = text1.replaceAll("\\s+", "").toLowerCase();
        text2 = text2.replaceAll("\\s+", "").toLowerCase();

        //If lengths are not equal they cannot be anagrams
        if (text1.length() != text2.length()) {
            return false;
        }

        //Creating frequency arrays for both texts
        int[] frequency1 = new int[256]; //Array to store frequency of characters for text1
        int[] frequency2 = new int[256]; //Array to store frequency of characters for text2

        //Counting the frequency of each character in both texts
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        //Comparing the frequency arrays for both texts
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false; //If any character frequency is different then return false
            }
        }

        //If all frequencies matched return true
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking user input for two texts
        System.out.print("Enter the first text: ");
        String text1 = input.nextLine();
        System.out.print("Enter the second text: ");
        String text2 = input.nextLine();

        //Checking if the texts are anagrams
        boolean result = areAnagrams(text1, text2);

        //Displaying the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
		
		input.close();
    }
}
