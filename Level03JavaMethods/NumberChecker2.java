/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to reverse the digits array 
Method to compare two arrays and check if they are equal
Method to check if a number is a palindrome using the Digits. A palindrome number is a number that remains the same when its digits are reversed. 
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
*/

import java.util.*;

public class NumberChecker2 {

    //Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
		int temp = number;
		while(temp > 0){
			temp /=10;
			count+=1;
		}
		return count;
    }

    //Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        int numDigits = countDigits(number);
        int[] digits = new int[numDigits];
        for (int i = numDigits - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    //Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    //Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    //Method to check if a number is a palindrome using the digits
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseDigits(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    //Method to check if a number is a Duck number using the digits array
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int i = 0; i<digits.length; i++) {
            if (digits[i] != 0) {
                return true; //A Duck number has at least one non-zero digit
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 120; // Test number (change this value to test with other numbers)

        System.out.println("Number: " + number);

        //Storing the digits of the number
        int[] digits = storeDigits(number);
        System.out.println("Digits in the number: " + Arrays.toString(digits));

        //Reversing the digits array
        int[] reversedDigits = reverseDigits(digits);
        System.out.println("Reversed digits: " + Arrays.toString(reversedDigits));

        //Checking if the number is a palindrome
        boolean isPalindrome = isPalindrome(number);
        System.out.println("Is Palindrome: " + isPalindrome);

        //Checking if the number is a Duck number
        boolean isDuck = isDuckNumber(number);
        System.out.println("Is Duck Number: " + isDuck);
    }
}
