/* An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
I/P => side1, side2, side3
O/P => The total number of rounds the athlete will run is ___ to complete 5 km
*/
import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking the sides of the triangle as input from the user
        System.out.print("Enter side1 of the triangle (in meters): ");
        double side1 = input.nextDouble();
        
        System.out.print("Enter side2 of the triangle (in meters): ");
        double side2 = input.nextDouble();
        
        System.out.print("Enter side3 of the triangle (in meters): ");
        double side3 = input.nextDouble();
        
        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;
        
        // Convert 5 km to meters
        double totalDistance = 5000; // 5 km = 5000 meters
        
        // Calculate the number of rounds needed to complete 5 km
        double rounds = totalDistance / perimeter;
        
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
        
        input.close();
    }
}
