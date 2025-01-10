/*Create a program to find the BMI of a person
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding variable.
Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Use the table to determine the weight status of the person
*/
import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // Asking the user to input their weight (in kg)
        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble();
        
        // Asking the user to input their height (in cm)
        System.out.print("Enter your height in cm: ");
        double heightCm = input.nextDouble();
        
        // Converting height from cm to meters
        double heightM = heightCm / 100;
        
        // Calculating BMI
        double bmi = weight / (heightM * heightM); // using the formula BMI = weight / (height * height)
        
        // Printing the BMI result
        System.out.println("Your BMI is: " + bmi);
        
        // Determining the weight status based on BMI
        if (bmi <= 18.4) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi <= 39.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }

        input.close();
    }
}
