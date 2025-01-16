/*An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members. 
For this create a program to find the BMI and display the height, weight, BMI, and status of each individual
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding 2D array of 10 rows. 
The First Column stores the weight and the second column stores the height in cm
Create a Method to find the BMI and status of every person given the person height and weight and return the 2D String array. 
Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method that takes the 2D array of height and weight as parameter. Calls the  user defined 
method to compute the BMI and the BMI Status and store in 2D String array of height, weight, BMI, and status.
Create a method to display the 2D string array in a tabular format of Person Height, Weight, BMI and the Status
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/

import java.util.*;

public class BMICalculator {

    //Method to find BMI and status for each person
    public static String[][] calculateBMIAndStatus(double[][] data) {
        String[][] result = new String[data.length][4]; //2D array to store height, weight, BMI, and status
        
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0]; //weight in kg
            double heightInCm = data[i][1]; //height in cm
            double heightInM = heightInCm / 100; //converting height to meters
            double bmi = weight / (heightInM * heightInM); //BMI calculation
            
            //Rounding BMI to 2 decimal places
            bmi = Math.round(bmi * 100.0) / 100.0;
            
            //Determining the BMI status
            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status = "Normal weight";
            } else if (bmi >= 25 && bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            
            //Storing height, weight, BMI, and status in the result array
            result[i][0] = String.valueOf(heightInCm); //Storing height in cm
            result[i][1] = String.valueOf(weight); //Storing weight in kg
            result[i][2] = String.valueOf(bmi); //Storing BMI
            result[i][3] = status; //Storing BMI status
        }
        
        return result;
    }

    //Method to take user input and store it in a 2D array (weight, height)
    public static double[][] getUserInput(int numPersons) {
        Scanner input = new Scanner(System.in);
        double[][] data = new double[numPersons][2]; //2D array to store weight and height
        
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            data[i][0] = input.nextDouble(); //weight input
            System.out.print("Enter height (cm): ");
            data[i][1] = input.nextDouble(); //height input
        }
        
        return data;
    }

    //Method to display the BMI and status for all persons in a tabular format
    public static void displayBMIResults(String[][] results) {
        //Printing the header
        System.out.println("Person\t\tHeight (cm)\t\tWeight (kg)\t\tBMI\t\tStatus");
        System.out.println("-----------------------------------------------------------------------------------------------------");

        //Printing the details of each person
        for (int i = 0; i < results.length; i++) {
            System.out.println("Person " + (i + 1) + "\t\t" + results[i][0] + "\t\t" + results[i][1] + "\t\t" + results[i][2] + "\t\t" + results[i][3]);
        }
    }

    public static void main(String[] args) {
        int numPersons = 10; //Number of persons in the team
        
        //Getting user input for weight and height
        double[][] inputData = getUserInput(numPersons);

        //Calculating BMI and status for each person
        String[][] bmiResults = calculateBMIAndStatus(inputData);

        //Displaying the BMI and status results in a tabular format
        displayBMIResults(bmiResults);
    }
}
