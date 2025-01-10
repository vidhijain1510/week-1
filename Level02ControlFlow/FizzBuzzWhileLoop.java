/*Rewrite the program 5 FizzBuzz using while loop*/
import java.util.*;

public class FizzBuzzWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // Asking the user to input a number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        // Checking if the number is positive
        if (number > 0) {
            int i = 1;
            // Using while loop to iterate from 1 to the entered number
            while (i <= number) {
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
                // Printing the number if it's not a multiple of 3 or 5
                else {
                    System.out.println(i);
                }
                i++; // Increment i to continue the loop
            }
        } else {
            // If the input is not a positive integer
            System.out.println("Please enter a positive integer.");
        }

        input.close();
    }
}
