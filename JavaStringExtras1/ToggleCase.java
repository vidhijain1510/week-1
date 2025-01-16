/*Toggle Case of Characters
Problem:
Write a Java program to toggle the case of each character in a given string. Convert
uppercase letters to lowercase and vice versa.*/

import java.util.*;

public class ToggleCase {
    public static void main(String[] args) {
        // Creating a scanner object for user input
        Scanner input = new Scanner(System.in);

        //String input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        //Calling the method to toggle case and store the result
        String toggledString = toggleCase(text);

        //result
        System.out.println("Toggled case string: " + toggledString);

        input.close();
    }

    //Method to toggle the case of each character in the string
    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();

        //Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //Checking if the character is uppercase
            if (Character.isUpperCase(ch)) {
                // Converting to lowercase
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                // Converting to uppercase
                result.append(Character.toUpperCase(ch));
            } else {
                //Non-alphabet characters remain unchanged
                result.append(ch);
            }
        }

        // Returns the toggled string
        return result.toString();
    }
}
