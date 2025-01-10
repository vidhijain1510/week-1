/* 10. Write a program to find the sum of numbers until the user enters 0
Hint => 
Create a variable total of type double initialize to 0.0. Also, create a variable to store the double value the user enters
Use the while loop to check if the user entered is 0
If the user entered value is not 0 then inside the while block add user entered value to the total and ask the user to input again
The loop will continue till the user enters zero and outside the loop display the total value
*/
import java.util.*;

public class SumUntilZero {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double total = 0.0, userInput;
        
        //while loop to keep adding numbers until the user enters 0
        do {
            //Taking input from user 
            System.out.print("Enter a number (0 to stop): ");
            userInput = input.nextDouble();
            
            // If the user enters a number other than 0, adding it to the total
            if (userInput != 0) {
                total += userInput;
            }
            
        } while (userInput != 0);  // Continuing looping until the user enters 0
        
        // Printing the total sum after the loop exits
        System.out.println("The total sum is: " + total);

        input.close();
    }
}
