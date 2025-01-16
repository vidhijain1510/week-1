import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        //Creating a scanner object for user input
        Scanner input = new Scanner(System.in);

        //String input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        //Calling the method to remove duplicates and print the result
        System.out.println("Modified string (without duplicates): " + removeDuplicates(text));

        input.close();
    }

    //Method to remove duplicate characters
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();

        //Iterate over the characters of the string
        for (int i = 0; i < str.length(); i++) {
            //If the character is not already in the result then add it
            if (result.indexOf(String.valueOf(str.charAt(i))) == -1) {
                result.append(str.charAt(i));
            }
        }

        //Returns the modified string without duplicates
        return result.toString();
    }
}
