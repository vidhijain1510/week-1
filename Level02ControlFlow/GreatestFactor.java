/* Create a program to print the greatest factor of a number beside itself using a loop.
Hint => 
Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1
Create a for loop that runs from last but one till 1 as in i = number - 1 to i = 1.
Inside the loop, check if the number is perfectly divisible by i then assign i to greatestFactor variable and break the loop.
Display the greatestFactor variable outside the loop
*/
import java.util.*;

public class GreatestFactor {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialized the greatestFactor to 1
        int greatestFactor = 1;

        // Loop from the second last number down to 1
        for (int i = number - 1; i >= 1; i--) {
            // Checking if i is a factor of the number
            if (number % i == 0) {
                greatestFactor = i;  // Assign i as the greatest factor
                break;  // Exit the loop as we've found the greatest factor
            }
        }

        // Printing the greatest factor
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);

        input.close();
    }
}