/* Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 

Hint => 
Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks*/
import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // Taking input marks for the three subjects
        System.out.print("Enter marks for Physics: ");
        double physics = input.nextDouble();
        
        System.out.print("Enter marks for Chemistry: ");
        double chemistry = input.nextDouble();
        
        System.out.print("Enter marks for Maths: ");
        double maths = input.nextDouble();
        
        // Calculating total and percentage
        double total = physics + chemistry + maths;
        double percentage = (total / 300) * 100;
        
        // Output the average marks and percentage
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        
        // Determining grade and remarks based on the percentage
        String grade = "";
        String remarks = "";
        
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70 && percentage <= 79) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60 && percentage <=69) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50 && percentage <=59) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40 && percentage <=49) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }
        
        // Output the grade and remarks
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}