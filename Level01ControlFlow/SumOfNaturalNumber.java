 /*Write a program to find the sum of n natural numbers using while loop compare the result  with the formulae n*(n+1)/2 and show the result from both computations was correct. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using while loop
Compare the two results and print the result
*/
import java.util.*;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // Asking the user to enter a natural number (n)
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        
        // Checking if the input is a natural number
        if (n <= 0) {
            System.out.println("The number entered is not a natural number.");
        } else {
            //sum using the formula n * (n + 1) / 2
            int sumFormula = n * (n + 1) / 2;
            
            //sum using a while loop
            int sumWhileLoop = 0;
            int i = 1;
            while (i <= n) {
                sumWhileLoop += i;
                i++;
            }
            
            // Display both results
            System.out.println("Sum using the formula (n*(n+1)/2): " + sumFormula);
            System.out.println("Sum using the while loop: " + sumWhileLoop);
            
            // Compare the results
            if (sumFormula == sumWhileLoop) {
                System.out.println("Both results are correct!");
            } else {
                System.out.println("There is an issue with the calculations.");
            }
        }

        input.close();
    }
}
