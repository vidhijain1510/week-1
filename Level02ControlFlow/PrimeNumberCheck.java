/* Write a Program to check if the given number is a prime number or not
Hint => 
A number that can be divided exactly only by itself and 1 are Prime Numbers,
Prime Numbers checks are done for numbers greater than 1
Loop through all the numbers from 2 to the user input number and check if the reminder is zero. 
If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number. 
Use isPrime boolean variable to store the result
*/
import java.util.*;

public class PrimeNumberCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // Asking the user to input a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // A prime number is greater than 1 and is divisible only by 1 and itself
        boolean isPrime = true;
        
        // Checking for numbers less than or equal to 1
        if (number <= 1) {
            isPrime = false;  // Numbers less than or equal to 1 are not prime
        } else {
            // Loop through numbers from 2 to sqrt(number) to check for factors
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;  // If divisible by any number, it's not prime
                    break;  // Exit the loop if the number is divisible by any number
                }
            }
        }
        

        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        input.close();
    }
}
