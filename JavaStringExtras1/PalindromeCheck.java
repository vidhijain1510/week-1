
import java.util.*;

public class PalindromeCheck {
    public static void main(String[] args) {
        //Creating a scanner object for user input
        Scanner input = new Scanner(System.in);

        //String input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        //Checking if the string is a palindrome
        if (isPalindrome(text)) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }

        input.close();
    }

    //Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        //Convert the string to lowercase and remove spaces for a more generalized check
        str = str.toLowerCase().replaceAll("[\\W_]+", "");

        //Initializing left and right pointers
        int left = 0;
        int right = str.length() - 1;

        //Comparing characters from both ends towards the center
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters do not match, it's not a palindrome
            }
            left++;
            right--;
        }

        return true; //If all characters match, it's a palindrome
    }
}
