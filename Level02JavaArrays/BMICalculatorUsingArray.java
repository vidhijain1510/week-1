import java.util.*;

public class BMICalculatorUsingArray {
    public static void main(String[] args) {
	
		//To take the input from user
        Scanner input = new Scanner(System.in);

		//taking user input
        System.out.print("Enter the number of persons: ");
        int numberPersons = input.nextInt();

        //arrays to store weight, height, BMI, and weight status
        double[] weights = new double[numberPersons];
        double[] heights = new double[numberPersons];
        double[] bmic = new double[numberPersons];
        String[] statuses = new String[numberPersons];

        //input for weight and height of persons
        for (int i = 0; i < numberPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (in kg): ");
            weights[i] = input.nextDouble();
            System.out.print("Height (in meters): ");
            heights[i] = input.nextDouble();
        }

        //calculating BMI and determining the weight status
        for (int i = 0; i < numberPersons; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            bmic[i] = bmi;

            if (bmi <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
		System.out.println();
        //Displaying height, weight, BMI, and weight status of each person
        for (int i = 0; i < numberPersons; i++) {
            System.out.println("Person " + (i + 1) + ":" + "\nWeight: " + weights[i] + " kg" + "\nHeight: " + heights[i] + " meters" + "\nBMI: " + bmic[i]+ "\nWeight Status: " + statuses[i]);
            
        }
		
		input.close();
		
    }
}