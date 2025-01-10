/*Create a program to check if a number taken from the user is a Harshad Number.
Hint => 
A Harshad number is an integer which is divisible by the sum of its digits. 
For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).
Get an integer input for the number variable.
Create an integer variable sum with initial value 0.
Create a while loop to access each digit of the number.
Inside the loop, add each digit of the number to sum.
Check if the number is perfectly divisible by the sum.
If the number is divisible by the sum, print Harshad Number. Otherwise, print Not a Harshad Number.
*/
import java.util.*;

public class HarshadNumber {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Storing the original number for later comparison
        int originalNumber = number;

        // Variable to store the sum of digits
        int sum = 0;

        // Using a while loop to access each digit of the number
        while (number != 0) {
            
            int digit = number % 10;

            // Add the digit to the sum
            sum += digit;

            // Remove the last digit from the number
            number /= 10;
        }

        // Checking if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        input.close();
    }
}