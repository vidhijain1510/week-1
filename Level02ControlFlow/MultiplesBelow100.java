/* Create a program to find all the multiple of a number taken as user input below 100.
Hint => 
Get input value for a variable named number.
Run a for loop backward: from i = 100 to i = 1.
Inside the loop, check if i perfectly divide the number.
If true, print the number and continue the loop.*/
import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is positive (multiples are meaningful for positive numbers)
        if (number > 0) {
            System.out.println("Multiples of " + number + " below 100:");

            // Run a for loop backward from 100 to 1
            for (int i = 100; i >= 1; i--) {
                // Check if i is a multiple of the entered number
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive number.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
