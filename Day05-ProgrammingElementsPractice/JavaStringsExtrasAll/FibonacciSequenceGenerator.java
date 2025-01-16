/*4. Fibonacci Sequence Generator:
 Write a program that generates the Fibonacci sequence up to a specified number
of terms entered by the user.
 Organize the code by creating a function that calculates and prints the Fibonacci
sequence.*/

import java.util.*;

public class FibonacciSequenceGenerator {

    //Function to generate and print the Fibonacci sequence up to the specified number of terms
    public static void generateFibonacci(int terms) {
        long first = 0, second = 1;
        
        System.out.println("Fibonacci Sequence up to " + terms + " terms:");

        //Generating the Fibonacci sequence
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            
            //Calculating the next number in the sequence
            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();  //To move to the next line after the sequence
    }

    //Function to get user input for the number of terms
    public static int getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        return input.nextInt();  // Return the number of terms
    }

    //Main method
    public static void main(String[] args) {
        int terms = getInput();  //Getting the number of terms from the user
        generateFibonacci(terms);  //Generating the Fibonacci sequence
    }
}
