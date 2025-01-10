/* Create a program to find the factors of a number taken as user input.
Hint => 
Get the input value for a variable named number.
Run a for loop from i = 1 to i < number.
In each iteration of the loop, check if number is perfectly divisible by i.
If true, print the value of i.
*/
import java.util.*;

public class Factors {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Printing the factors of the number
        System.out.println("Factors of " + number + " are:");

        for (int i = 1; i <= number; i++) {
            // Checking if i is a factor of the number
            if (number % i == 0) {
                System.out.println(i);  // Printing the factor
            }
        }

        input.close();
    }
}