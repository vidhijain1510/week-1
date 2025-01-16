/*Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter
Hint => 
Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to find vowels and consonants in a string using charAt() method and return the character and vowel or consonant in a 2D array
Create a Method to display the 2D Array of Strings in a Tabular Format
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
*/

import java.util.Scanner;

public class TypeChecker {

    //Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacter(char c) {

        //Converting to lowercase manually if it is an uppercase letter
        int currentCharacter = (int) c; //The ASCII value of the character
        if (currentCharacter >= 65 && currentCharacter <= 90) { //Uppercase letter check
            currentCharacter += 32; //Converting to lowercase
        }
        char lowerCaseChar = (char) currentCharacter; // Convertin back to character

        //Checking if it is a vowel
        if (lowerCaseChar == 'a' || lowerCaseChar == 'e' || lowerCaseChar == 'i' || lowerCaseChar == 'o' || lowerCaseChar == 'u') {
            return "Vowel";
        }
        //Checking if it is a consonant
        else if (lowerCaseChar >= 'a' && lowerCaseChar <= 'z') {
            return "Consonant";
        }
        //If it is not a letter
        else {
            return "Not a Letter";
        }
    }

    //Method to find character types in a string and return the character and its type in a 2D array
    public static String[][] characterTypes(String text) {
        //Creating a 2D array to store character and its type
        String[][] result = new String[text.length()][2];

        //Loop through each character in the string using charAt() method
        for (int i = 0; i < text.length(); i++) {
            char currentCh = text.charAt(i);

            //Checking the type of the current character
            String characterType = checkCharacter(currentCh);

            //Storing the character and its type in the result array
            result[i][0] = String.valueOf(currentCh);
            result[i][1] = characterType;
        }

        return result;
    }

    //Method to display the 2D array in a tabular format
    public static void displayCharacterTypes(String[][] result) {
        System.out.println("Character \t\t Type");
        System.out.println("-----------------------------");

        //Loop through the 2D array and display each character and its type
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {
        //Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        //Taking user input for the string
        System.out.println("Enter a string:");
        String text = input.nextLine();

        //Calling the characterTypes method to get the results
        String[][] result = characterTypes(text);

        //Displaying the results in a tabular format
        displayCharacterTypes(result);

        input.close();
    }
}
