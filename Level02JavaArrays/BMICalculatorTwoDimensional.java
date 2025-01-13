/*Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
Hint => 
Take input for a number of persons
Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status of the persons
       double[][] personData = new double[number][3];
       String[] weightStatus = new String[number];
Take input for weight and height of the persons and for negative values, ask the user to enter positive values
Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
Display the height, weight, BMI and status of each person
*/
import java.util.*;

public class BMICalculatorTwoDimensional {
    public static void main(String[] args) {
		
		//To take user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int number = input.nextInt();

        // multi-dimensional array to store weight, height, and BMI
        double[][] personData = new double[number][3]; // weight, height, BMI
        String[] weightStatus = new String[number];

        // input for weight and height of persons
        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (in kg): ");
            personData[i][0] = input.nextDouble();
            System.out.print("Height (in meters): ");
            personData[i][1] = input.nextDouble();
        }

        // Calculating BMI and determining weight status
        for (int i = 0; i < number; i++) {
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

		System.out.println();
        // Displaying height, weight, BMI, and status of each person
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Weight: " + personData[i][0] + " kg" + "\nHeight: " + personData[i][1] + " meters" + "\nBMI: " + personData[i][2] + "\nWeight Status: " + weightStatus[i]);
            System.out.println();
        }
		input.close();
    }
}