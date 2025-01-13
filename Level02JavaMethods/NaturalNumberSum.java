/*Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and
 show the result from both computations is correct. 
Hint => 
Take the user input number and check whether it's a Natural number, if not exit
Write a Method to find the sum of n natural numbers using recursion
Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2 
Compare the two results and print the result
*/
import java.util.*;

public class NaturalNumberSum {

    //Recursive method to find the sum of n natural numbers
    public static int sumRecursive(int num) {
        if (num == 1) {
            return 1; //sum of 1 is 1
        } else {
            return num + sumRecursive(num - 1); //Recursive case
        }
    }

    //Method to find the sum using the formula n*(n+1)/2
    public static int sumFormula(int num) {
        return num * (num + 1) / 2; //Formula for sum of first n natural numbers
    }

    public static void main(String[] args) {
		
		//To take user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        //Checking if the number is a valid natural number
        if (number <= 0) {
            System.err.println("Please enter a positive integer greater than 0.");
            System.exit(0); //exit if number is not valid
        }

        //calculating the sum using recursion
        int recursiveSum = sumRecursive(number);

        //Calculating sum using the formula n*(n+1)/2
        int formulaSum = sumFormula(number);

        //Displaying the results 
        System.out.println("Sum of first " + number + " natural numbers (recursive method): " + recursiveSum + "\nSum of first " + number + " natural numbers (formula method): " + formulaSum);

        //Checking if both methods is giving the the same result or not
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods are giving the correct result.");
        } else {
            System.out.println("Both methods are note giving the correct result.");
        }

        input.close();
    }
}
