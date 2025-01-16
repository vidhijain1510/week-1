/*Find the Most Frequent Character
Problem:
Write a Java program to find the most frequent character in a string.
Example Input:
String: "success"

Expected Output:
Most Frequent Character: 's'*/

import java.util.*;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        //Creating a scanner object for user input
        Scanner input = new Scanner(System.in);

        //String input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        //Calling the method to get the most frequent character and store the result
        char mostFrequentChar = findMostFrequentCharacter(text);

        //result
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");

        input.close();
    }

    //Method to find the most frequent character in the string
    public static char findMostFrequentCharacter(String str) {
        int[] frequency = new int[256]; //Array to store frequency of each character (assuming ASCII characters)
        
        //Counting the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        //Finding the character with the highest frequency
        int maxFrequency = 0;
        char mostFrequentChar = '\0'; // Default character
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (frequency[currentChar] > maxFrequency) {
                maxFrequency = frequency[currentChar];
                mostFrequentChar = currentChar;
            }
        }

        return mostFrequentChar;
    }
}
