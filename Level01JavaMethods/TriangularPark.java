/*An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run,
 then how many rounds must the athlete complete
Hint => 
Take user input for 3 sides of a triangle 
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run
*/
import java.util.*;

public class TriangularPark{
	double roundsTriangularPark(double firstSide, double secondSide, double thirdSide, double distance ){
		 
		distance*=1000; //1km = 1000m
		
		//The perimeter of a triangle is the addition of all sides
		double perimeter = firstSide + secondSide + thirdSide;
		
		//to calculate rounds is distance/perimeter
		double totalRounds = distance/perimeter;
		return totalRounds;
		
	}
	
	public static void main(String[] args){
		
		//to take user input
		Scanner input = new Scanner(System.in);
		
		//total distance to cover
		System.out.print("Enter the to cover (in km): ");
		double distance = input.nextDouble();
		
		
		// Taking input for the sides of the triangle
        System.out.print("Enter the length of side 1 of the triangle (in meters): ");
        double firstSide = input.nextDouble();
        System.out.print("Enter the length of side 2 of the triangle (in meters): ");
        double secondSide = input.nextDouble();
        System.out.print("Enter the length of side 3 of the triangleext (in meters): ");
        double thirdSide = input.nextDouble() ; 
		
		//creating object 
		TriangularPark calculateRounds = new TriangularPark();
		
		//calling method using object
		double totalRoundsOfPark = calculateRounds.roundsTriangularPark(firstSide, secondSide, thirdSide, distance);
		
		System.out.println("The num of rounds user needs to do to complete " + distance +"km run is " + totalRoundsOfPark);
		
		input.close();
	}
}
		
		