/*Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" 
instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the 
format Position 1 = 1, …, Position 3 = Fizz,...
Hint => 
Create a String Array to save the results and 
Finally, loop again to show the results of the array based on the index position
*/
import java.util.*;

public class FizzBuzz {
	public static void main(String[] args){
		
		//To input via Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer number: ");		
		int number = input.nextInt();
		
	
		String[] array = new String[number+1];
		
		//Checking if it is a positive integer
		if(number>0){
			for(int i = 0; i<= number; i++){
				if(i % 3 == 0 && i % 5 ==0){
					array[i] = "FizzBuzz";
				}else if(i % 3 == 0){
					array[i] = "Fizz";
				}else if(i % 5 == 0){
					array[i] = "Buzz";
				}else{
					array[i]= String.valueOf(i);
				}
			}
		}	
		for(int i = 0; i<array.length; i++){
			System.out.print("Position " + i + " = " + array[i] +", ");
		}
		input.close();
	}
}
		
					
					
					
				
		
		