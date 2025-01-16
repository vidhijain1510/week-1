import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
        //Creating a scanner object for user input
        Scanner input = new Scanner(System.in);

        //Input of two strings
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        //Calling the method to check if the strings are anagrams and output the result
        if (areAnagrams(str1, str2)) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }

        input.close();
    }

    //Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        //Removing any spaces and convert both strings to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        //If the lengths are different then they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        //Converting the strings to character arrays and sort them
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        //Sorting both arrays
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        //Comparing the sorted arrays
        return java.util.Arrays.equals(arr1, arr2);
    }
}
