/*GCD and LCM Calculator:
 Create a program that calculates the Greatest Common Divisor (GCD) and Least
Common Multiple (LCM) of two numbers using functions.
 Use separate functions for GCD and LCM calculations, showcasing how modular
code works.*/

import java.util.*;

public class GcdLcmCalculator {

    //Function to calculate the Greatest Common Divisor (GCD) of two numbers
    public static int calculateGCD(int a, int b) {
        // Base case: if b is 0, GCD is a
        if (b == 0) {
            return a;
        }
        //Recursive case: GCD of b and a % b
        return calculateGCD(b, a % b);
    }

    //Function to calculate the Least Common Multiple (LCM) of two numbers
    public static int calculateLCM(int a, int b) {
        //LCM can be calculated using the formula: LCM(a, b) = (a * b) / GCD(a, b)
        int gcd = calculateGCD(a, b);
        return (a * b) / gcd;
    }

    //Function to get the input from the user
    public static int getInput(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        return input.nextInt();
    }

    //Function to display the result
    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("For the numbers " + a + " and " + b + ":");
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }

    // Main method
    public static void main(String[] args) {
        
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");

        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);

        displayResult(num1, num2, gcd, lcm);
    }
}
