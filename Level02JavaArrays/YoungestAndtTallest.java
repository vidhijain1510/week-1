/*Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
Finally display the youngest and tallest of the 3 friends
*/
import java.util.*;

public class YoungestAndtTallest {
	public static void main(String[] args){
		
		//To input via Scanner
		Scanner input = new Scanner(System.in);
		
		//Two arrays each to store the values for age and height of the 3 friends
		int[] age = new int[3];
		double[] height = new double[3];
		
		for(int i = 0; i < age.length; i++){
			System.out.println("Enter the age of friend " + (i+1) + ": ");
			age[i] = input.nextInt();
			//Stores the age of 3 friends
		}
		
		for(int i = 0; i < height.length; i++){
			System.out.println("Enter the height of friend " + (i+1) + "(in centimeters): ");
			height[i] = input.nextDouble();
			//Stores the height of 3 friends
		}
		
		// Variables to store the index of the youngest and tallest friends
        int youngestIndex = 0;
        int tallestIndex = 0;

		
		for(int i = 0; i < age.length; i++){
			if(age[i] < age[youngestIndex]){
				youngestIndex = i;
				//loop to find the youngest friend
			}
		}
		
		for(int i = 0; i < height.length; i++){
			if(height[i] > height[tallestIndex]){
				tallestIndex = i;
				//loop to find the tallest friend
			}
		}
		
		// Displaying the youngest and tallest friend
        System.out.println("\nThe youngest friend is: Friend " + (youngestIndex + 1) + " with age " + age[youngestIndex]);
        System.out.println("The tallest friend is: Friend " + (tallestIndex + 1) + " with height " + height[tallestIndex] + " cm.");
        
		input.close();
	}
}
			
		