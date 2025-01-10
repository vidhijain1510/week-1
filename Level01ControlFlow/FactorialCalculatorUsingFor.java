/*
15. Rewrite program 14 using for loop
Hint => 
Take the integer input, check for natural number and determine the factorial using for loop and finally print the result. 
*/
import java.util.*;

public class FactorialCalculatorUsingFor{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // Asking the user to input an integer
        System.out.print("Enter a positive integer to compute its factorial: ");
        int num = input.nextInt();
        
        // Checking if the entered number is positive
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {

            int factorial = 1;
            
            // Using a for loop to calculate the factorial
            for (int i = 1; i <= num; i++) {
                factorial *= i;  // Multipling the current number to the factorial
            }
            
            // Printing the result
            System.out.println("The factorial of " + num + " is: " + factorial);
        }

        input.close();
    }
}
