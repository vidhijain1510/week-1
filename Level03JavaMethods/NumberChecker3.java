/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to Check if a number is prime number. A prime number is a number greater than 1 that has no positive divisors other than 1 and itself. 
Method to Check if a number is a neon number. A neon number is a number where the sum of digits of the square of the number is equal to the number itself 
Method to Check if a number is a spy number. A number is called a spy number if the sum of its digits is equal to the product of its digits
Method to Check if a number is an automorphic number. An automorphic number is a number whose square ends with the number itself. E.g. 5 is an automorphic number
Method to Check if a number is a buzz number. A buzz number is a number that is either divisible by 7 or ends with 7
*/
import java.util.*;

public class NumberChecker3{
	//Method to Check if a number is prime number.
	public static boolean isPrimeNumbers(int num){
		//A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.
		if(num <= 1){
			return false;
		}
		for(int i = 2; i < num; i++){
			if(num % i ==0){
				return false;
			}
		}
		return true;
	}
	
	//Method to Check if a number is a neon number
	public static boolean isNeonNumbers(int num){
		//A neon number is a number where the sum of digits of the square of the number is equal to the number itself 
		int squareOfNum = num * num;
		int sumOfDigitsOfSquare = 0;
		while(squareOfNum > 0){
			sumOfDigitsOfSquare += squareOfNum % 10;
			squareOfNum /= 10;
		}
		return sumOfDigitsOfSquare == num;
	}
	
	//Method to Check if a number is a spy number.
	public static boolean isSpyNumbers(int num){
		//A number is called a spy number if the sum of its digits is equal to the product of its digits
		int sumOfDigits = 0;
		int productOfDigits = 1;
		int temp1 = num;
		while(temp1 > 0){//Loop to find sum of digits of number
			sumOfDigits += temp1%10;
			temp1 /=10;
		}
		int temp2 = num;
		while(temp2 > 0){
			productOfDigits *= temp2 %10;
			temp2/=10;
		}
		return sumOfDigits == productOfDigits;
	}
		
	//Method to Check if a number is an automorphic number.
	public static boolean isAutomorphicNumbers(int num){
		//An automorphic number is a number whose square ends with the number itself. E.g. 5 is an automorphic number
		int squareOfNum = num * num;
		int temp = squareOfNum % 10;//Temp variable stores last digit od square of num
		return temp == num;
	}
	
	//Method to Check if a number is a buzz number
	public static boolean isBuzzNumbers(int num){
		// A buzz number is a number that is either divisible by 7 or ends with 7
		int temp = num;
		temp %= 10;
		if(num % 7==0 || temp==7){
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args){
		//To take user input
		Scanner input = new Scanner(System.in);
		
		//Taking input for number
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		
		//we can call methods directly as they are static method and do not need an object to be created
		
		//Calling isPrimeNumbers method
		boolean isPrime = isPrimeNumbers(number);
		System.out.println(number + " is prime number: " + isPrime);
		
		//Calling isNeonNumbers method
		boolean isNeon = isNeonNumbers(number);
		System.out.println(number + " is neon number: " + isNeon); 
		
		//Calling isSpyNumbers method
		boolean isSpy = isSpyNumbers(number);
		System.out.println(number + " is spy number: " + isSpy);
		
		//Calling isAutomorphicNumbers method
		boolean isAutomorphic = isAutomorphicNumbers(number);
		System.out.println(number + " is automorphic number: " + isAutomorphic);
		
		//Calling isBuzzNumbers method
		boolean isBuzz = isBuzzNumbers(number);
		System.out.println(number + " is automorphic number: " + isBuzz);
		
		input.close();
	}
}