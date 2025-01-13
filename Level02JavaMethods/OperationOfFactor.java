/*Create a program to find the factors of a number taken as user input, store the factors in an array and display the factors. Also find the sum, 
sum of square of factors and product of the factors and display the results
Hint => 
Take the input for a number
Write a static Method to find the factors of the number and save them in an array and return the array. 
To find factors and save to array will have two loops. The first loop to find the count and initialize the array with the count. 
And the second loop save the factors into the array
Write a method to find the sum of the factors using factors array
Write a method to find the product of the factors using factors array
Write a method to find the sum of square of the factors using Math.pow() method
*/

import java.util.Scanner;

public class OperationOfFactor {

    //A static Method to find the factors of the number 
    public static int[] findFactors(int number) {
        // To count the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        //Saving them in an array and return the array
        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
				index++;
            }
        }

        return factors;
    }

    //A method to find the sum of the factors using factors array
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    //A method to find the product of the factors using factors array
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    //A method to find the sum of square of the factors using Math.pow() method
    public static double sumOfSquaresOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2); //Using Math.pow for square the factor
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
		
		//To take the user input
        Scanner input = new Scanner(System.in);

        //User input for the number
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        // To get the factors of the number
        int[] factors = findFactors(number);
		
		
        System.out.print("The factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        //Calculating the sum, product, and sum of squares of the factors
		//We can access these methods directly as they are static
        int sum = sumOfFactors(factors);
        int product = productOfFactors(factors);
        double sumOfSquares = sumOfSquaresOfFactors(factors);

        //Displaying the final output
        System.out.println("Sum of the factors: " + sum + "\nProduct of the factors: " + product + "\nSum of the squares of the factors: " + sumOfSquares);

        input.close();
    }
}
