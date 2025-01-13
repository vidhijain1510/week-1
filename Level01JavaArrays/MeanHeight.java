/*Create a program to find the mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements / number of elements
Create a double array named heights of size 11 and get input values from the user.
Find the sum of all the elements present in the array.
Divide the sum by 11 to find the mean height and print the mean height of the football team
*/
import java.util.*;

public class MeanHeight{
	public static void main(String[] args){
		
		//To input via Scanner
		Scanner input = new Scanner(System.in);
		
		double[] heights =new double[11];
		
		System.out.println("Enter the heights of 11 Students: ");
		for(int i=0 ; i < heights.length; i++){
			heights[i] = input.nextDouble(); //Taking heights as an input
		}
		
		//To find sum of elements present in the array
		double sum = 0;
		
		for(int i=0 ; i < heights.length; i++){
			sum += heights[i];
		}
		
		//To find the mean height
		sum/=11; // Sum divided by 11 as The formula to calculate the mean is: mean = sum of all elements / number of elements and total number of players in football team is 11.
		
		System.out.println("The mean height of players present in a football team is " + sum);
	}
}