/*Basic Calculator:
Write a program that performs basic mathematical operations (addition,
subtraction, multiplication, division) based on user input.
Each operation should be performed in its own function, and the program should
prompt the user to choose which operation to perform.*/

import java.util.*;

public class BasicCalculator {

    //Function to add two numbers
    public static double add(double a, double b) {
        return a + b;
    }

    //Function to subtract two numbers
    public static double subtract(double a, double b) {
        return a - b;
    }

    //Function to multiply two numbers
    public static double multiply(double a, double b) {
        return a * b;
    }

    //Function to divide two numbers
    public static double divide(double a, double b) {
        //Handle division by zero
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return Double.NaN;  //Return NaN (Not a Number) if division by zero occurs
        }
        return a / b;
    }

    //Function to get input from the user
    public static double getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    //Function to display the result
    public static void displayResult(double result) {
        System.out.println("The result is: " + result);
    }

    //Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Displaying the menu of operations
        System.out.println("Basic Calculator");
        System.out.println("Select an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        // Getting the user's choice
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = input.nextInt();

        // Getting the numbers for the operation
        double num1 = getInput("Enter the first number: ");
        double num2 = getInput("Enter the second number: ");

        //Performing the operation using if-else
        double result = 0;
        if (choice == 1) {
            result = add(num1, num2);
        } else if (choice == 2) {
            result = subtract(num1, num2);
        } else if (choice == 3) {
            result = multiply(num1, num2);
        } else if (choice == 4) {
            result = divide(num1, num2);
        } else {
            System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            return;
        }

        displayResult(result);
    }
}
