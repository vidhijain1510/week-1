/*Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade as shown in figure below

Hint => 
Write a method to generate random 2-digit scores for Physics, Chemistry and Math (PCM) for the students and return the scores. 
This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. 
Please ensure to round off the values to 2 Digits using Math.round() method
Write a Method to calculate the grade based on the percentage as shown in the ref table and return a 2D array of students' grade
Finally write a Method to display the scorecard of all students with their scores, total, average, percentage, and grade in a tabular format. 
*/

import java.util.*;

public class StudentScorecard {

    //Method to input scores for Physics, Chemistry, and Maths for each student
    public static int[][] inputScores(int numStudents) {
        Scanner input = new Scanner(System.in);
        int[][] scores = new int[numStudents][3]; //2D array to store PCM scores for all students

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1));
            System.out.print("Physics: ");
            scores[i][0] = input.nextInt();  //Physics score
            System.out.print("Chemistry: ");
            scores[i][1] = input.nextInt();  //Chemistry score
            System.out.print("Maths: ");
            scores[i][2] = input.nextInt();  //Maths score
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4]; //2D array to store total, average, and percentage for each student

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];  //Total marks
            double average = total / 3.0;  //Average marks
            double percentage = (total / 300.0) * 100;  //Percentage calculation

            //Round off to 2 decimal places
            results[i][0] = total;  //Store total
            results[i][1] = Math.round(average * 100.0) / 100.0; 
            results[i][2] = Math.round(percentage * 100.0) / 100.0;  
        }

        return results;
    }

    //Method to calculate grade based on percentage
    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];

        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];

            //Assigning grade based on percentage
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
			}else {
                grades[i] = "R";
            }
        }

        return grades;
    }

    //Method to display the scorecard of all students
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("Student\t\tPhysics\t\tChemistry\t\tMaths\t\tTotal\t\tGrade");
        System.out.println("--------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t\t" + scores[i][0] + "\t\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t\t" + results[i][0] + "\t\t" + grades[i]);
        }

        //Displaying average and percentage at the bottom (optional)
        System.out.println("---------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int numStudents = 5;  //Number of students

        //The scores for the students
        int[][] scores = inputScores(numStudents);

        //Calculating total, average, and percentage for each student
        double[][] results = calculateResults(scores);

        //Calculating grade for each student
        String[] grades = calculateGrades(results);

        //Displaying the scorecard
        displayScorecard(scores, results, grades);
    }
}
