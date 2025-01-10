/* Create a program to print odd and even numbers between 1 to the number entered by the user.
Hint => 
Get an integer input from the user, assign to a variable number and check for Natural Number
Using a for loop, iterate from 1 to the number
*/
import java.util.*;

public class OddEvenNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // Asking the user to input a natural number
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();
        
        // Checking if the input is a natural number
        if (number <= 0) {
            System.out.println("The number entered is not a natural number.");
        } else {
            // Printing even numbers between 1 and the entered number
            System.out.print("Even numbers between 1 and " + number + ": ");
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            
            // Printing odd numbers between 1 and the entered number
            System.out.print("\nOdd numbers between 1 and " + number + ": ");
            for (int i = 1; i <= number; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }

        input.close();
    }
}
