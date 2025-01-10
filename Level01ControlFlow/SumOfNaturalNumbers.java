/* Write a program to check for the natural number and write the sum of n natural numbers 
Hint => 
A Natural Number is a positive integer (1,2,3, etc) sometimes with the inclusion of 0
A sum of n natural numbers is n * (n+1) / 2 
I/P => number
O/P => If the number is a positive integer then the output is
The sum of ___ natural numbers is ___
Otherwise 
The number ___ is not a natural number
*/
import java.util.*;

public class SumOfNaturalNumbers{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Taking input a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Checking if the number is a natural number
        if (number >= 0) {
            int sumOfNaturalNumbers = number * (number + 1) / 2; //A sum of n natural numbers is n * (n+1) / 2 
            System.out.println("The sum of " + number + " natural numbers is " + sumOfNaturalNumbers);
        } else {
            // If the number not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }
        
        input.close();
    }
}
