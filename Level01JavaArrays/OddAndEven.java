/*Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array
Hint => 
Get an integer input from the user, assign it to a variable number, and check for Natural Number. If not a natural number then print an error and exit the program
Create an integer array for even and odd numbers with size = number / 2 + 1
Create index variables for odd and even numbers and initialize them to zero
Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the corresponding array
Finally, print the odd and even numbers array using the odd and even index
*/
import java.util.*;

public class OddAndEven {
	public static void main(String[] args){
		
		//To input via Scanner
		Scanner input = new Scanner(System.in);
		
		//Taking user input for number
		System.out.println("Enter a number: ");
		int number = input.nextInt();

		//Checking for Natural Number
		if(number<=0){
			System.err.println(number + " not a natural number.");
			System.exit(0);
		}
		int sizeOfArray = number / 2 + 1;
		 
		// Create arrays for odd and even numbers
		int[] evenNumbers = new int[sizeOfArray];
		int[] oddNumbers = new int[sizeOfArray];
		
		
		// Initializing index variables
        int evenIndex = 0;
        int oddIndex = 0;

        // The arrays with odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }
		//To print the odd and even numbers array using the odd and even index
		
		// Print the odd numbers array
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Print the even numbers array
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
		
		
		input.close();
	}
}	
			
		
		