/*Find unique characters in a string using charAt() method and display the result
Hint => 
Create a Method to find the length of the text without using the String method length()
Create a method to Find unique characters in a string using charAt() method and return them as 1D array. The logic used here is as follows:
Create an array to store the unique characters in the text. The size is the length of the text
Loops to Find the unique characters in the text. Find the unique characters in the text using a nested loop. 
An outer loop iterates through each character and an inner loop checks if the character is unique by comparing it with the previous characters. 
If the character is unique, it is stored in the result array
Create a new array to store the unique characters 
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
*/

import java.util.*;

public class UniqueCharacters {

    //Method to find the length of a string without using the String length() method
    public static int lengthOfString(String text) {
        int length = 0;
        //Loop through the string using charAt() method until end of string
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            //End of string reached
        }
        return length;
    }

    //Method to find unique characters in a string using charAt() and return them as 1D array
    public static char[] findUniqueCharacters(String text) {
        int length = lengthOfString(text); //Getting length of the string
        char[] uniqueChars = new char[length]; //Array to store unique characters
        int uniqueCount = 0; //Counter to track the number of unique characters

        //Outer loop: iterate each character in the string
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);

            //Inner loop: Checks if the character is unique
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false; //Character already exists
                    break;
                }
            }

            //Store it in the result array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        //Creating a new array with exact size for unique characters
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking user input for the string
        System.out.print("Enter a string: ");
        String inputText = input.nextLine();

        //Finding unique characters
        char[] uniqueChars = findUniqueCharacters(inputText);

        //Displaying the unique characters
        System.out.print("Unique characters in the string: ");
        for (int i = 0; i  < uniqueChars.length; i++) {
            System.out.print(uniqueChars[i] + " ");
        }
		input.close();
    }
}

