/*Create a program to store the digits of the number in an array and find the largest and second largest element of the array.
Hint => 
Create a number variable and Take user input. 
Define an array to store the digits. Set the size of the array to maxDigit variable initially set to 10
Create an integer variable index with the value 0 to reflect the array index.
Use a loop to iterate until the number is not equal to 0.
Remove the last digit from the number in each iteration and add it to the array.
Increment the index by 1 in each iteration and if the index count equals maxDigit then break out of the loop and the remaining digits are not added to the array
Define variable to store largest and second largest digit and initialize it to zero
Loop through the array and use conditional statements to find the largest and second largest number in the array
Finally display the largest  and second-largest number
*/
import java.util.*;

public class LargestAndSecondLargest{
	public static void main(String [] args){
		
		//To take the input from user
		Scanner input = new Scanner(System.in);
		
		//Take user input for a number.
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		int maxDigit = 10;//maxDigit variable initially set to 10
		int index = 0;//integer variable index with the value 0 to reflect the array index.
		
		int[] digitsOfNumber = new int[maxDigit];//array to store the digits
		
		while(number>0){
            int digit = number % 10;  //the last digit
            number /= 10;  // Removing the last digit
			digitsOfNumber[index] = digit;  // the digit in the array
            index++;  // Incrementing the index
        }
		
		//the largest and second-largest digits in the array
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digitsOfNumber[i] > largest) {
                secondLargest = largest;
                largest = digitsOfNumber[i];
				
            } else if (digitsOfNumber[i] > secondLargest && digitsOfNumber[i]!= largest) {
                secondLargest = digitsOfNumber[i];
            }
        }


        // Output the largest and second-largest digits
        System.out.println("The largest digit is: " + largest);
        System.out.println("The second largest digit is: " + secondLargest);
		
		input.close();
	}
}
		