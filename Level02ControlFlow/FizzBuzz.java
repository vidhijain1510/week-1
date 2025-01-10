/*Write a program FizzBuzz, take a number as user input, and if it is a positive integer loop from 0 to the number and print the number, but for multiples of 3 print "Fizz" instead of the number, 
for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".
Hint => 
Write the program and use for loop*/
import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // Asking the user to input a number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        // Checking  if the number is positive
        if (number > 0) {
            // Loop from 1 to the given number (inclusive)
            for (int i = 1; i <= number; i++) {
                // Checking if the number is a multiple of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Checking if the number is a multiple of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Checking if the number is a multiple of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Print the number if it's not a multiple of 3 or 5
                else {
                    System.out.println(i);
                }
            }
        } else {
            // If the input is not a positive integer
            System.out.println("Please enter a positive integer.");
        }
        
        input.close();
    }
}
