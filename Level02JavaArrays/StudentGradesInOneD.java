/*Rewrite the above program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade
Hint => 
All the steps are the same as the problem 8 except the marks are stored in a 2D array
Use the 2D array to calculate the percentages, and grades of the students
*/
import java.util.*;

public class StudentGradesInOneD {
    public static void main(String[] args) {
		
		//to take input from user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Create 1D arrays to store marks, percentages, and grades
        double[] physicsMarks = new double[numStudents];
        double[] chemistryMarks = new double[numStudents];
        double[] mathsMarks = new double[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Take input for marks of students
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            System.out.print("Physics: ");
            physicsMarks[i] = input.nextDouble();
            if (physicsMarks[i] < 0) {
                System.err.print("Invalid input. Please Re-enter The marks: ");
                i--;
            }

            System.out.print("Chemistry: ");
            chemistryMarks[i] = input.nextDouble();
            if (chemistryMarks[i] < 0) {
                System.err.print("Invalid input. Please Re-enter The marks: ");
                i--;
            }

            System.out.print("Maths: ");
            mathsMarks[i] = input.nextDouble();
            if (mathsMarks[i] < 0) {
                System.err.print("Invalid input. Please Re-enter The marks: ");
                i--;
            }
        }

        // Calculate percentage and grade for each student
        for (int i = 0; i < numStudents; i++) {
            double totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (totalMarks / 300) * 100;

            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        // Display marks, percentages, and grades for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + physicsMarks[i]);
            System.out.println("Chemistry: " + chemistryMarks[i]);
            System.out.println("Maths: " + mathsMarks[i]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);
            System.out.println();
        }
		input.close();
		
    }
}