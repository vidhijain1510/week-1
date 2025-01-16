/*Maximum of Three Numbers:
Write a program that takes three integer inputs from the user and finds the
maximum of the three numbers.
Ensure your program follows best practices for organizing code into modular
functions, such as separate*/

import java.util.*;

public class MaximumOfThreeNumbers {
    
    //Function to get user input for three integers
    public static int[] getInput() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];
        
        //Getting user input for three integers
        System.out.println("Enter three integers:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        
        return numbers;  //Returning the array of three integers
    }
    
    //Function to find the maximum of three numbers
    public static int findMaximum(int num1, int num2, int num3) {
        int max = num1;  //Assume num1 is the maximum initially
        
        //Comparing num1 with num2 and num3
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        
        return max;  //Returns the maximum value
    }
    
    //Function to display the result
    public static void displayResult(int max) {
        System.out.println("The maximum of the three numbers is: " + max);
    }

    // Main method 
    public static void main(String[] args) {
        //Step 1: User input for three integers
        int[] numbers = getInput();
        
        //Step 2: The maximum of the three numbers
        int max = findMaximum(numbers[0], numbers[1], numbers[2]);
        
        //Step 3: Displaying the result
        displayResult(max);
    }
}
