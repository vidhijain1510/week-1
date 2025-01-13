/*Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the total, average, and the percentage score 

Hint => 
Take input for the number of students
Write a method to generate random 2-digit scores for Physics, Chemistry, and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using the Math.round() method. 
Finally, write a Method to display the scorecard of all students with their scores, total, average, and percentage in a tabular format using "\t". */



import java.util.*;

public class StudentScoreCard {

    //Method to generate random 2-digit scores for Physics, Chemistry, and Math for each student
    public static int[][] generateRandomScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; //2D array to store scores for each student of 3 subjects


        //Generating random scores for each subject
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(100) + 1; // Physics 
            scores[i][1] = rand.nextInt(100) + 1; // Chemistry
            scores[i][2] = rand.nextInt(100) + 1; // Math 
        }

        return scores;
    }
	
	

    //Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores, int numStudents) {
        double[][] results = new double[numStudents][4]; // Array to store  total, average, and percentage

        //Calculating total, average, and percentage
        for (int i = 0; i < numStudents; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100;

            //Rounding off values to 2 decimal places
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    //Method to display the scorecard in a tabular format
    public static void displayScoreCard(int[][] scores, double[][] results, int numStudents) {
        System.out.println("Student No.\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < numStudents; i++) {
            // Printing the student's scores and calculated results
            System.out.print((i + 1) + "\t\t");
            System.out.print(scores[i][0] + "\t\t");
            System.out.print(scores[i][1] + "\t\t");
            System.out.print(scores[i][2] + "\t\t");
            System.out.print(results[i][0] + "\t\t");
            System.out.print(results[i][1] + "\t\t");
            System.out.println(results[i][2] + "\t\t");
        }
    }

    public static void main(String[] args) {
	
		//To take input from user
        Scanner input = new Scanner(System.in);

        //the number of students as input
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        //Generating random scores for the students
        int[][] scores = generateRandomScores(numStudents);

        //Calculating total, average, and percentage for each student
        double[][] results = calculateResults(scores, numStudents);

        //Displaying the scorecard for all students
        displayScoreCard(scores, results, numStudents);

        input.close();
    }
}
