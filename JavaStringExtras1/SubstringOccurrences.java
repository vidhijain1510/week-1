/*Find Substring Occurrences
Problem:
Write a Java program to count how many times a given substring occurs in a string.*/
import java.util.*;

public class SubstringOccurrences {
    public static void main(String[] args) {
        //Creating a scanner object for user input
        Scanner input = new Scanner(System.in);

        //String input
        System.out.print("Enter the main string: ");
        String mainString = input.nextLine();

        //Substring input
        System.out.print("Enter the substring: ");
        String substring = input.nextLine();

        // Calling the method to count the occurrences and store the result
        int count = countOccurrences(mainString, substring);

        //Result
        System.out.println("The substring occurs " + count + " times.");

        input.close();
    }

    //Method to count occurrences of the substring
    public static int countOccurrences(String mainString, String substring) {
        int count = 0;
        int index = 0;

        //Loop through the main string to find the substring occurrences
        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;  
            index += substring.length();  // Move past the last found substring
        }

        // Returns the total count of occurrences
        return count;
    }
}
