/*Write a program to trim the leading and trailing spaces from a string using the charAt() method 
Hint => 
Create a method to trim the leading and trailing spaces from a string using the charAt() method. 
Inside the method run a couple of loops to trim leading and trailing spaces and determine the starting and ending points with no spaces. 
Return the start point and end point in an array
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
The main function calls the user-defined trim and substring methods to get the text after trimming the leading and trailing spaces. Post that use the String built-in 
*/
public class StringManipulation {

    //Method to trim leading and trailing spaces using charAt()
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

        //The first non-space character from the start
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        //The first non-space character from the end
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    //Method to create a substring using charAt() from start to end index
    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    //Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        //Example string
        String inputString = "   Hello World!   ";

        //Triming leading and trailing spaces
        int[] trimmedIndices = trimSpaces(inputString);
        int start = trimmedIndices[0];
        int end = trimmedIndices[1];

        //Creating the substring using the trimmed indices
        String trimmedString = substringUsingCharAt(inputString, start, end);

        //Displaying the trimmed string
        System.out.println("Trimmed String: \"" + trimmedString + "\"");

        //Using built-in method 
        String builtInTrimmedString = inputString.trim();
        System.out.println("Built-in Trimmed String: \"" + builtInTrimmedString + "\"");

        //Comparing the results
        boolean isEqual = compareStrings(trimmedString, builtInTrimmedString);
        System.out.println("The manually trimmed and built-in trimmed strings equal: " + isEqual);
    }
}
