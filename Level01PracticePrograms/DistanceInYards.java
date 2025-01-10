/* Write a program the find the distanceInFeet and miles for the distance provided by user in feets
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___*/
import java.util.*;

public class DistanceInYards{
	public static void main(String[] args){
		double distanceInFeet, distanceInYards, distanceInMiles;
		Scanner input = new Scanner(System.in);
		distanceInFeet = input.nextDouble();
		distanceInYards = distanceInFeet / 3.0;// 1 yard is 3 feet
        distanceInMiles = distanceInYards / 1760.0; //1 mile = 1760 yards
		System.out.println("The distance in yards is "+distanceInYards +"and in miles is distanceInMiles"+ distanceInMiles);
		input.close();
    }
}