/*Write a program to find the smallest and the largest of the 3 numbers.
Hint => 
Take user input for 3 numbers
Write a single method to find the smallest and largest of the three numbers
public static int[] findSmallestAndLargest(int number1, int number2, int number3)
*/
import java.util.*;
public class Numbers{
	
	// method to find the smallest and largest of the three numbers
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		//initializing smallest and largest
		int smallest = number1;
		int largest = number1;
		
		// to find the smallest
		if(number2 < smallest && number2 < number3 ){
			smallest = number2;
		}else if(number3 < smallest && number3 < number2){
			smallest = number3;
		}
		//to find the largest
		if(number2 > largest && number2 > number3 ){
			largest = number2;
		}else if(number3 > largest && number3 > number2){
			largest = number3;
		}
		
		return new int[] {smallest, largest};
	}
		
	public static void main(String[] args){
		
		//To take input from user
		Scanner input = new Scanner(System.in);
		
		int[] threeNumber = new int[3];
		
		//Take user input for 3 numbers
		System.out.println("Enter 3 numbers: ");
		for(int i = 0; i < 3; i++){
			threeNumber[i] = input.nextInt();
		}
		int[] results = findSmallestAndLargest(threeNumber[0], threeNumber[1], threeNumber[2]);
		//calling method using object
		
		System.out.println("The smallest of all is " + results[0] + " The largest of all is " + results[1]);
		
		input.close();
	
		
	}
}