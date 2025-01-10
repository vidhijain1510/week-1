/*Create a program to check if a number is an Abundant Number.
Hint => 
An abundant number is an integer in which the sum of all the divisors of the number is greater than the number itself. For example,
Divisor of 12: 1, 2, 3, 4, 6
Sum of divisor: 1 + 2 + 3 + 4 + 6 = 16 > 12
Get an integer input for the number variable.
Create an integer variable sum with initial value 0.
Run a for loop from i = 1 to i < number.
Inside the loop, check if number is divisible by i.
If true, add i to sum.
Outside the loop Check if sum is greater than number.
If the sum is greater than the number, print Abundant Number. Otherwise, print Not an Abundant Number.
*/
import java.util.*;

public class AbundantNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Variable to store the sum of divisors
        int sum = 0;

        // Using a for loop to find divisors and add them to sum
        for (int i = 1; i < number; i++) {
            // Checking if i is a divisor of the number
            if (number % i == 0) {
                // Adding i to sum if it's a divisor
                sum += i;
            }
        }

        // Checking if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }
 
        input.close();
    }
}