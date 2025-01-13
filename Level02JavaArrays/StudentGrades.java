/*Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade  as per the following guidelines 

Hint => 
Take input for the number of students
Create arrays to store marks, percentages, and grades of the students
Take input for marks of students in physics, chemistry, and maths. If the marks are negative, ask the user to enter positive values and decrement the index
Calculate the percentage and grade of the students based on the percentage
Display the marks, percentages, and grades of each student
*/

import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
		//To take input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        //arrays to store marks, percentages, and grades
        double[][] marks = new double[numStudents][3]; // physics, chemistry, maths
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        //input for marks of students
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.print("Physics: ");
                } else if (j == 1) {
                    System.out.print("Chemistry: ");
                } else {
                    System.out.print("Maths: ");
                }
                marks[i][j] = input.nextDouble();
				if(marks[i][j] < 0){
					System.err.println("marks are negative, enter positive values");
					j-=1;
					
				}
            }
        }

        // percentage and grade for each student
        for (int i = 0; i < numStudents; i++) {
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
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
		
		System.out.println();
        // Displaying marks, percentages, and grades for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":" + "\nPhysics: " + marks[i][0] + "\nChemistry: " + marks[i][1] + "\nMaths: " + marks[i][2] + "\nPercentage: " + percentages[i] + "%" + "\nGrade: " + grades[i]);
            System.out.println();
        }
		input.close();
		
    }
}