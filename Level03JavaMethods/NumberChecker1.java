/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to find the sum of the digits of a number using the digits array
Method to find the sum of the squares of the digits of a number using the digits array. Use Math.pow() method
Method to Check if a number is a harshad number using a digits array. A number is called a Harshad number if it is divisible by the sum of its digits. For e.g. 21
Method to find the frequency of each digit in the number. 
Create a 2D array to store the frequency with digit in the first column and frequency in the second column.
*/

import java.util.*;

public class NumberChecker1 {

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

    //Method to find the sum of digits of the number using the digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of the number using the digits array
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if the number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // 10 rows for digits 0-9, columns: [digit, frequency]
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; //Digit in the first column
        }
        for (int digit = 0; digit< digits.length; digit++) {
            frequency[digit][1]++; 
        }
        return frequency;
    }

    // Method to display the frequency of each digit
    public static void displayDigitFrequency(int[][] frequency) {
        System.out.println("Digit | Frequency");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + "     | " + frequency[i][1]);
            }
        }
    }

    public static void main(String[] args) {
        int number = 153; // Test number (change this value to test with other numbers)

        System.out.println("Number: " + number);

        // Store the digits of the number
        int[] digits = storeDigits(number);
        System.out.println("Digits in the number: " + Arrays.toString(digits));

        // Count the number of digits
        int count = countDigits(number);
        System.out.println("Number of digits: " + count);

        // Find the sum of the digits
        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        // Find the sum of the squares of the digits
        double sumOfSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        // Check if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(number);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Find the frequency of each digit
        int[][] frequency = digitFrequency(digits);
        displayDigitFrequency(frequency);
    }
}

