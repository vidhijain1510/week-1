/*Extend or Create a NumberChecker utility class and perform following task. 
Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to Find the count of digits in the number
Method to Store the digits of the number in a digits array
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
Method to check if the number is a armstrong number using the digits array. 
​​Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits. Eg: 153 = 1^3 + 5^3 + 3^3
Method to find the largest and second largest elements in the digits array. Use Integer.MIN_VALUE to initialize the variable.
Method to find the the smallest and second smallest elements in the digits array. Use Integer.MAX_VALUE to initialize the variable.
*/

import java.util.*;

public class NumberChecker {

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

    //Method to check if the number is a Duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int i = 0; i < digits.length; i++) {
			//A duck number is a number that has a non-zero digit present in it
            if (digits[i] != 0) {
                return true;
            }
        }
        return false;
    }

    //Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = storeDigits(number);
        int numDigits = digits.length;
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], numDigits);
        }
        return sum == number;
    }

    //Method to find the largest and second largest digits in the array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }
        return new int[] { largest, secondLargest };
    }

    //Method to find the smallest and second smallest digits in the array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] > smallest) {
                secondSmallest = digits[i];
            }
        }
        return new int[] { smallest, secondSmallest };
    }

    public static void main(String[] args) {
		
        int number = 153; 
		
        System.out.println("Number: " + number);

        //To count the digits
        int count = countDigits(number);
        System.out.println("Number of digits: " + count);

        //Array to store the digits
        int[] digits = storeDigits(number);
        System.out.println("Digits in the number: " + Arrays.toString(digits));

        //Checking if the number is a Duck number
        boolean isDuck = isDuckNumber(number);
        System.out.println("Is Duck Number: " + isDuck);

        // Checking if the number is an Armstrong number
        boolean isArmstrong = isArmstrongNumber(number);
        System.out.println("Is Armstrong Number: " + isArmstrong);

        //The largest and second largest digits
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestAndSecondLargest[0] + "\nSecond largest digit: " + largestAndSecondLargest[1]);

        //The smallest and second smallest digits
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestAndSecondSmallest[0] + "\nSecond smallest digit: " + smallestAndSecondSmallest[1]);
    }
}
