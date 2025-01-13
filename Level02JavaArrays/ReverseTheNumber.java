/* Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
Hint => 
Take user input for a number. 
Find the count of digits in the number. 
Find the digits in the number and save them in an array
Create an array to store the elements of the digits array in reverse order
Finally, display the elements of the array in reverse order 
*/
import java.util.*;

public class ReverseTheNumber{
	public static void main(String [] args){
		
		//To take the input from user
		Scanner input = new Scanner(System.in);
		
		//Take user input for a number.
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		int count = 0;
		int temp = number; //Variable to count digits
		while(temp > 0){
			temp/=10;
			count++;
		}
		
		//Creating an array to store the elements of the digits array in reverse order
		int[] digitsOfNumber = new int[count];
		
        // Reuse the original number to get the digits
        for (int i = 0; i<count; i++) {
            digitsOfNumber[i] = number % 10;  //the last digit
            number /= 10;  // Removing the last digit
        }
		
		//display the elements of the array in reverse order
		System.out.println("The reversed number is: ");
		for(int i = 0; i < count; i++){
			System.out.print(digitsOfNumber[i]);
		}
		
		input.close();
	}
}
			
		