/*An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and and store it in the corresponding 2D array of 10 rows and 3 columns.
 The First Column storing the weight, the second column storing the height in cm and the third column is the BMI
Create a Method to find the BMI of every person and populate the array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method to determine the BMI status using the logic shown in the figure below. and return the array of all the persons BMI Status.
*/
import java.util.*;

public class BMI {

    //Method to calculate BMI for each person
    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0]; // weight in kg
            double heightCm = personData[i][1]; // height in cm
            double heightM = heightCm / 100; //converting height to meters
            double bmi = weight / (heightM * heightM); //calculating BMI by formula BMI = weight / (height * height)
            personData[i][2] = bmi; //BMI in third column
        }
    }

    //Method to determine the BMI status
    public static String[] bMIStatus(double[][] personData) {
        String[] status = new String[personData.length];
        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2]; //getting BMI from the array
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //2D array to store the weight, height, and BMI for 10 people
        double[][] personData = new double[10][3];
        
        //Taking input weight and height for each person by user
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1));
            
            System.out.print("Enter weight (kg): ");
            personData[i][0] = input.nextDouble();

            System.out.print("Enter height (cm): ");
            personData[i][1] = input.nextDouble();
        }

        //Calculating the BMI for each person
        calculateBMI(personData);

        //Getting the BMI status for each person
        String[] bmiStatus = bMIStatus(personData);

        //Displaying the results
        System.out.println("\nResults:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + " Weight: " + personData[i][0] + " kg, Height: " + personData[i][1] + " cm, BMI: " + personData[i][2] + ", Status: " + bmiStatus[i]);
        }

        input.close();
    }
}
