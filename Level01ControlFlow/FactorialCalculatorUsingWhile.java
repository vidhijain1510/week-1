/* Write a Program to find the factorial of an integer entered by the user.
Hint => 
For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
Using a while loop, compute the factorial.
Print the factorial at the end.
*/
import java.util.*;

public class FactorialCalculatorUsingWhile {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Asking the user to input an integer
        System.out.print("Enter a positive integer to compute its factorial: ");
        int num = input.nextInt();
        
        // Checking if the entered number is positive
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Initialized the variable to store the factorial result
            int factorial = 1;
            
            // Using a while loop to calculate the factorial
            int i = 1;
            while (i <= num) {
                factorial *= i;  // Multipling the current number to the factorial
                i++;  // Incrementing the counter
            }
            
         
            System.out.println("The factorial of " + num + " is: " + factorial);
        }

        input.close();
    }
}
