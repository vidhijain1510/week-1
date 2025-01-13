/*Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors
Hint => 
Take the input for a number
Find the factors of the number and save them in an array. For this create integer variable maxFactor and initialize to 10, factors array of size maxFactor and
 index variable to reflect the index of the array. 
To find factors loop through the numbers from 1 to the number, find the factors, and add them to the array element by incrementing the index.
 If the index is equal to maxIndex, then need factors array to store more elements
To store more elements, reset the maxIndex to twice its size, use the temp array to store the elements from the factors array, 
and eventually assign the factors array to the temp array
Finally, Display the factors of the number
*/
import java.util.*;

public class Factors {
	public static void main(String[] args){
		
		//To input via Scanner
		Scanner input = new Scanner(System.in);
		
		//Take the input for a number
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		int index = 0;
		
		int maxFactor = 10;
		
		int[] factors = new int[maxFactor];
		
		//To find factors loop through the numbers from 1 to the number
		for(int i = 1; i<=number; i++){
			//checking for factors
			if(i % 2 == 0){
				if(index < maxFactor){
					
					factors[index] = i;
					index++;
				}else if (index == maxFactor) {
                    // Double the size of the array
                    maxFactor *= 2;
                    
                    // Create a new array of doubled size
                    int[] temp = new int[maxFactor];
                    
                    // Copy old factors array to the new array
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    
                    // Point factors array to the new array
                    factors = temp;
                }
			}
		}
		
		//To display the factors
		System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < maxFactor; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println(); 
		
		input.close();
	}
}
		
		