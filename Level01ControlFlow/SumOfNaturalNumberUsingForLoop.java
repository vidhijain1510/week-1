/*  Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using for loop
Compare the two results and print the result
*/
import java.util.*;

public class SumOfNaturalNumberUsingForLoop {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Asking the user to enter a natural number
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        
        // Checking if the input is a natural number
        if (n <= 0) {
            System.out.println("The number entered is not a natural number.");
        } else {
            // Calculating the sum using the formula n * (n + 1) / 2
            int sumFormula = n * (n + 1) / 2;
            
            // Calculating the sum using a for loop
            int sumForLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumForLoop += i;
            }
            
            // Displaying both results
            System.out.println("Sum using the formula (n*(n+1)/2): " + sumFormula);
            System.out.println("Sum using the for loop: " + sumForLoop);
            
            // Comparing the results
            if (sumFormula == sumForLoop) {
                System.out.println("Both results are correct!");
            } else {
                System.out.println("There is an issue with the calculations.");
            }
        }

        input.close();
    }
}
