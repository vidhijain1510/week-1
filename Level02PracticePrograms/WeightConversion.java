/*Create a program to convert weight in pounds to kilograms.
Hint => 1 pound = 2.2 kg
I/P => weight
O/P => The weight of the person in pound is ___ and in kg is ___
*/
import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        // Taking weight in pounds as input
		
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = input.nextDouble();
        
        double weightInKilograms = weightInPounds * 2.2; //1 pound = 2.2 kg
        
        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kg is " + weightInKilograms);
        
        input.close();
    }
}
