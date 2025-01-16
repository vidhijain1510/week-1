/*Prime Number Checker:
Create a program that checks whether a given number is a prime number.
The program should use a separate function to perform the prime check and
return the result.  */

import java.util.*;

public class PrimeNumberChecker {

    //Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;  // 0 and 1 are not prime numbers
        }

        //Checking divisibility from 2 
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;  //If divisible by any number it is not prime
            }
        }
        return true;  //If no divisors are found it is a prime number
    }

    //Function to get user input
    public static int getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        return input.nextInt();  //Returns the input number
    }

    //Function to display the result
    public static void displayResult(boolean isPrime) {
        if (isPrime) {
            System.out.println("The number is a prime number.");
        } else {
            System.out.println("The number is not a prime number.");
        }
    }

    //Main method
    public static void main(String[] args) {
        int number = getInput();  //Getting the input from the user
        boolean primeCheck = isPrime(number);  //Checking if the number is prime
        displayResult(primeCheck);  //Displaying the result
    }
}
