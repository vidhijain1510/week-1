/* Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd.
 Finally compare the first and last elements of the array and display if they equal, greater or less
Hint => 
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero. 
Finally compare the first and last element of the array and display if they equal, greater or less
*/
import java.util.*;

public class CheckNumbers{
	public static void main(String[] args){
		//To input via Scanner
		Scanner input = new Scanner(System.in);
		
		int[] numbers = new int[5];//Defining an integer array of 5 elements
		
		System.out.println("Enter 5 numbers: ");
		//taking user input to store in the array.
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = input.nextInt();
		}
		
		//checking whether a number is positive,  negative, or zero
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] > 0){
				System.out.println(numbers[i] + " is positive number.");
				if(numbers[i] % 2 == 0){
					//check if the number is even or odd.
					System.out.println(" and is even number.");
				}else{
					System.out.println("and is odd number.");
				}
			}else if(numbers[i] < 0){
				System.out.println(numbers[i] + " is negative number.");
			}else{
				System.out.println(numbers[i] + " is Zero.");
			}
		}
		
		//compare the first and last element of the array
		if(numbers[0] == numbers[4]){
			System.out.println("the first and last element of the array is equal");
		}else if(numbers[0] >= numbers[4]){
			System.out.println("the first number is greater than last element of the array");
		}else{
			System.out.println("the first number is less than last element of the array");
		}
		input.close();
	}
}
		
				
			
			
			
			