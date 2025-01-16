/*Write a program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string
Hint => 
Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to Method to find vowels and consonants in a string using charAt() method and finally return the count of vowels and consonants in an array
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
*/

import java.util.Scanner;

public class VowelsConsonantsCount {

    //Method to check if a character is a vowel or consonant
    public static String checkCharacter(char c) {
        //converting to lowercase manually if it is an uppercase letter
        int currentCharacter = (int) c; // the ASCII value of the character
        if (currentCharacter >= 65 && currentCharacter <= 90) { // Uppercase letter check 
            currentCharacter += 32; // Convert to lowercase 
        }
        char lowerCaseChar = (char) currentCharacter; //Convert back to character

        //Checking if it's a vowel
        if (lowerCaseChar == 'a' || lowerCaseChar == 'e' || lowerCaseChar == 'i' || lowerCaseChar == 'o' || lowerCaseChar == 'u') {
            return "Vowel";
        }
        //Checking if it's a consonant (alphabet letter)
        else if (lowerCaseChar >= 'a' && lowerCaseChar <= 'z') {
            return "Consonant";
        }
        //If it's not a letter
        else {
            return "Not a Letter";
        }
    }

    //Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) {
        int vowelsCount = 0;
        int consonantsCount = 0;

        //Loop through each character in the string using charAt() method
        for (int i = 0; i < text.length(); i++) {
            char currentCh = text.charAt(i);

            //Checking if the current character is a vowel or consonant
            String result = checkCharacter(currentCh);
            if (result.equals("Vowel")) {
                vowelsCount++;
            } else if (result.equals("Consonant")) {
                consonantsCount++;
            }
        }

        // Return the counts as an array where index 0 is vowels and index 1 is consonants
        return new int[]{vowelsCount, consonantsCount};
    }

    public static void main(String[] args) {
        // Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter a string:");
        String text = input.nextLine();

        //Calling the countVowelsAndConsonants method to get the counts
        int[] counts = countVowelsAndConsonants(text);

        //Displaying the results
        System.out.println("Vowels count: " + counts[0]);
        System.out.println("Consonants count: " + counts[1]);

        input.close();
    }
}
