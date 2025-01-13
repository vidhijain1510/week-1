/* Create a program to print a multiplication table of a number.
Hint => 
Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 10
Run a loop from 1 to 10 and store the results in the multiplication table array
Finally, display the result from the array in the format number * i = ___
*/
import java.util.*;

public class MultiplicationTable{
	public static void main(String[] args){
		
		//To input via Scanner
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		int[] numbers = new int[10];//Defining an integer array of 5 elements
	    
		//loop from 1 to 10 to store the results in the multiplication table array
		for(int i=0; i<numbers.length; i++){
			numbers[i] = number*(i+1);
		}
		
		//display the result from the array
		for(int i=0; i<numbers.length; i++){
			System.out.println(number + " * " + (i+1) + " = " + numbers[i]);
		}
		
		input.close();
	}
}
		
		
		