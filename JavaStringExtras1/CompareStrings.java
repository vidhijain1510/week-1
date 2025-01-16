/*Compare Two Strings

Problem:
Write a Java program to compare two strings lexicographically (dictionary order) without
using built-in compare methods.
Example Input:
String 1: "apple"
String 2: "banana"

Expected Output:
"apple" comes before "banana" in lexicographical order*/

import java.util.*;

public class CompareStrings {
    public static void main(String[] args) {
        //Creating a scanner object for user input
        Scanner input = new Scanner(System.in);

        //Input two strings
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        //Calling the method to compare the two strings and store the result
        compareStrings(str1, str2);

        input.close();
    }

    //Method to compare two strings lexicographically
    public static void compareStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length()); //Finding the minimum length of the two strings

        //Comparing characters one by one
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
                return;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order");
                return;
            }
        }

        //If the strings are identical up to the length of the shorter one, compare lengths
        if (str1.length() < str2.length()) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        } else if (str1.length() > str2.length()) {
            System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order");
        } else {
            System.out.println("The strings \"" + str1 + "\" and \"" + str2 + "\" are equal.");
        }
    }
}
