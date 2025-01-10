/*Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
Hint => 
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop using break;
*/
import java.util.*;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double total = 0.0;
        
        // Infinite while loop
        while (true) {
            // Asking the user to enter a number
            System.out.print("Enter a number (0 or negative to stop): ");
            double userInput = input.nextDouble();
            
            // Checking if the entered number is 0 or negative
            if (userInput <= 0) {
                break;  // Exit the loop if the user enters 0 or a negative number
            }
            
            // Adding the user input to the total if it's positive
            total += userInput;
        }
        
        // Print the total sum after the loop exits
        System.out.println("The total sum is: " + total);

        input.close();
    }
}
