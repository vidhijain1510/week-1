/*Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Create a class public class StudentVoteChecker and define a method public boolean canStudentVote(int age) which takes in age as a parameter and returns true or false
Inside the method firstly validate the age for a negative number, if a negative return is false cannot vote. For valid age check for age is 18 or above return true; 
else return false;
In the main function define an array of 10 integer elements, loop through the array by take user input for the student's age, call canStudentVote() and display the result
*/

import java.util.*;

public class StudentVoteChecker {

    // Method to check if a student can vote based on their age
    public boolean canStudentVote(int age) {
        
        if (age < 0) {
            return false;// Cannot vote for invalid age
        }
        //check if the age is 18 or greater
        return age >= 18;
    }

    public static void main(String[] args) {
		
		//To take user input
        Scanner input = new Scanner(System.in);

        //Creating an array to store the ages of 10 students
        int[] studentAges = new int[10];
		
		//creating object to call method
        StudentVoteChecker checker = new StudentVoteChecker();

        //Taking input for ages of 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();

            //Checking if the student can vote
            boolean canVote = checker.canStudentVote(studentAges[i]); //Calling method
            
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        input.close();
    }
}