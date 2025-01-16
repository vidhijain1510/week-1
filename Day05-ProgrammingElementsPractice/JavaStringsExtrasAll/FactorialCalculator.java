/*Factorial Using Recursion:
 Write a program that calculates the factorial of a number using a recursive
function.
 Include modular code to separate input, calculation, and output processes.*/
 
import java.util.*;

public class FactorialCalculator {

    //Recursive function to calculate the factorial of a number
    public static long calculateFactorial(int number) {
        //Base case: If the number is 0 or 1, the factorial is 1
        if (number == 0 || number == 1) {
            return 1;
        } else {
            //Recursive case: number * factorial of (number - 1)
            return number * calculateFactorial(number - 1);
        }
    }

    //Function to get the input from the user
    public static int getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        return input.nextInt();  // Return the input number
    }

    //Function to display the result
    public static void displayResult(int number, long result) {
        System.out.println("The factorial of " + number + " is: " + result);
    }

    //Main method
    public static void main(String[] args) {
        int number = getInput();  
        long factorial = calculateFactorial(number);  
        displayResult(number, factorial); 
    }
}
