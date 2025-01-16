/*Remove a Specific Character from a String
Problem:
Write a Java program to remove all occurrences of a specific character from a string.
Example Input:
String: "Hello World"
Character to Remove: 'l'

Expected Output:
Modified String: "Heo Word"*/

import java.util.*;

public class RemoveCharacter {
    public static void main(String[] args) {
        //Creating a scanner object for user input
        Scanner input = new Scanner(System.in);

        //String input
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        //Character to remove
        System.out.print("Enter the character to remove: ");
        char charToRemove = input.next().charAt(0);

        //Calling the method to remove the character and store the result
        String modifiedString = removeCharacter(inputString, charToRemove);

        //Result
        System.out.println("Modified String: " + modifiedString);

        input.close();
    }

    //Method to remove all occurrences of a specific character from the string
    public static String removeCharacter(String str, char charToRemove) {
        //Using StringBuilder to construct the result string
        StringBuilder result = new StringBuilder();

        //Iterate through each character in the original string
        for (int i = 0; i < str.length(); i++) {
            // If the character is not the one to remove, add it to the result
            if (str.charAt(i) != charToRemove) {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}
