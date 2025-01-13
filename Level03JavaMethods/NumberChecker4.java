/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find factors of a number and return them as an array. Note there are 2 for loops one for the count and another for finding the factor and storing in the array
Method to find the greates factor of a Number using the factors array
Method to find the sum of the factors using factors array and return the sum
Method to find the product of the factors using factors array and return the product
Method to find product of cube of the factors using the factors array. Use Math.pow() 
Method to Check if a number is a perfect number. Perfect numbers are positive integers that are equal to the sum of their proper divisors
Method to find the number is a abundant number. A number is called an abundant number if the sum of its proper divisors is greater than the number itself
Method to find the number is a deficient number. A number is called a deficient number if the sum of its proper divisors is less than the number itself
Method to Check if a number is a strong number. A number is called a strong number if the sum of the factorial of its digits is equal to the number itself
*/

import java.util.*;

public class NumberChecker4{
	//Method to find factors of a number and return them as an array
	public static int[] findFactors(int num){
		
		//there are 2 for loops one for the count and another for finding the factor and storing in the array
		
		int count = 0;
		for(int i = 1; i<=num; i++){//loop 1
			if(num % i == 0){
				count+=1;
			}
		}
		//Creating an array to store the factors
        int[] factors = new int[count];
		int index = 0;
		for(int i = 1; i<=num; i++){// loop 2
			if(num % i == 0){
				factors[index] = i;//To get the factors of num
				index+=1;
			}
		}
		return factors;
		
	}
	
	// Method to find the greatest factor (other than the number itself)
    public static int greatestFactor(int num) {
        // Starting from num-1 and check for the first divisor
        for (int i = num - 1; i > 0; i--) {
            if (num % i == 0) {
                return i; 
            }
        }
        return 1;
    }
	
	//Method to find the sum of the factors using factors array and return the sum
	public static int sumAll(int[] factors){
		int sum = 0;
		for (int i = 0; i<factors.length ; i++){
			sum+=factors[i];
		}
		return sum;
	}
	
	//Method to find the product of the factors using factors array and return the product
	public static int productAll(int[] factors){
		int product = 1;
		for (int i = 0; i<factors.length ; i++){
			product *= factors[i];
		}
		return product;
	}
	//Method to find product of cube of the factors using the factors array. Use Math.pow() 
	public static int productOfCube(int[] factors){
		int productCube = 1;
		for (int i = 0; i<factors.length ; i++){
			productCube *= Math.pow(factors[i], 3);
		}
		return productCube;
	}
	
	//Method to Check if a number is a perfect number
	public static boolean isPerfectNumber(int num){
		//Perfect numbers are positive integers that are equal to the sum of their proper divisors
		if(num < 0){
			return false;
		}
		int sumOfDivisors = 0;
		for (int i = 1; i <= num/2; i++){
			if(num % i == 0){
				sumOfDivisors += i;
			}
		}
		return sumOfDivisors == num;
	}
	
	//Method to find the number is a abundant number
	public static boolean isAbundantNumber(int num){
		//A number is called an abundant number if the sum of its proper divisors is greater than the number itself
		int sumOfDivisors = 0;
		for (int i = 1; i <= num/2; i++){
			if(num % i == 0){
				sumOfDivisors += i;
			}
		}
		
		return sumOfDivisors > num;
	}
		
	//Method to find the number is a deficient number
	public static boolean isDeficientNumber(int num){
		// A number is called a deficient number if the sum of its proper divisors is less than the number itself
		int sumOfDivisors = 0;
		for (int i = 1; i <= num/2; i++){
			if(num % i == 0){
				sumOfDivisors += i;
			}
		}
		
		return sumOfDivisors < num;
	}
	
	// Method to calculate the factorial of a number
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

	
	//Method to Check if a number is a strong number. A number is called a strong number if the sum of the factorial of its digits is equal to the number itself
	public static boolean isStrongNumber(int num){
		//A number is called a strong number if the sum of the factorial of its digits is equal to the number itself
		int originalNum = num;
        int sum = 0;

        //Loop to calculate the sum of the factorials of the digits
        while (originalNum > 0) {
            int digit = originalNum % 10;  //To Get the last digit
            sum += factorial(digit);
            originalNum /= 10;
        }

        // Check if the sum of factorials equals the original number
        return sum == num;
    }
			
	
	public static void main(String[] args){
		//To take input
		Scanner input = new Scanner(System.in);
		
		//Taking input for number
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		
		//We can call methods directly as they are static method and do not need an object to be created
		
		int[] factors = findFactors(number); //Calling findFactors method
		System.out.println("The factors for " + number + " are: " + Arrays.toString(factors));
		
		int greatest = greatestFactor(number); //Calling greatestFactor method
        System.out.println("The greatest factor of " + number + " (other than the number itself) is: " + greatest);
		
		int sum = sumAll(factors); //Calling sumAll method
        System.out.println("The sum factor of " + number + " is: " + sum);
        
		int product = productAll(factors); //Calling productAll method
        System.out.println("The product factor of " + number + " is: " + product);
		
		int productCube = productOfCube(factors); //Calling productOfCube method
        System.out.println("The product of cube factor of " + number + " is: " + productCube);
		
		//Checking if the number is a perfect number
        boolean isPerfect = isPerfectNumber(number);
        System.out.println("Is Perfect Number: " + isPerfect);
		
		//Checking if the number is a abundant number
        boolean isAbundant = isAbundantNumber(number);
        System.out.println("Is abundant Number: " + isAbundant);
		
		//Checking if the number is a deficient number
        boolean isDeficient = isDeficientNumber(number);
        System.out.println("Is deficient Number: " + isDeficient);
		
		//Checking if the number is a strongt number
        boolean isStrong = isStrongNumber(number);
        System.out.println("Is deficient Number: " + isStrong);
				
		input.close();
	}
}
