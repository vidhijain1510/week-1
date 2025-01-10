/* Rewrite the Sample Program 2 with user inputs
Hint => 
Create variables and take user inputs for name, fromCity, viaCity, toCity
Create variables and take user inputs for distances fromToVia and viaToFinalCity in Miles
Create Variables and take time taken 
Finally, print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are ___, ___, and ___
*/
import java.util.Scanner;

class TravelComputation {
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        
        // Input for name of the person traveling
        System.out.print("Enter the name of the traveler: ");
        String name = input.nextLine();
        
        // Input for cities involved in the travel
        System.out.print("Enter the name of the city you are traveling from: ");
        String fromCity = input.nextLine();
        
        System.out.print("Enter the name of the via city: ");
        String viaCity = input.nextLine();
        
        System.out.print("Enter the name of the final destination city: ");
        String toCity = input.nextLine();
        
        // Input for distances (in miles)
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double distanceFromToVia = input.nextDouble();
        
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double distanceViaToFinalCity = input.nextDouble();
        
        // Input for travel times (in minutes)
        System.out.print("Enter the time taken to travel from " + fromCity + " to " + viaCity + " in minutes: ");
        int timeFromToVia = input.nextInt();
        
        System.out.print("Enter the time taken to travel from " + viaCity + " to " + toCity + " in minutes: ");
        int timeViaToFinalCity = input.nextInt();
        
        // Calculate total distance and total time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Print the travel details
        System.out.println("The Total Distance travelled by " + name + " from " + 
                           fromCity + " to " + toCity + " via " + viaCity +
                           " is " + totalDistance + " miles and the Total Time taken is " + 
                           totalTime + " minutes");

        input.close();
    }
}

