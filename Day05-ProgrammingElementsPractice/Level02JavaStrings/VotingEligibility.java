/*Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Create a method to define the random 2 digit age of number of students provided as method parameters and return 1D array of age of n students
Create a method which takes in array of age as a parameter and returns 2D String array of age and boolean true or false to indicate can vote and cannot vote. 
Inside the method firstly validate the age for a negative number, if a negative cannot vote. For valid age check for age is 18 or above to settrue to indicate can vote.
Create a method to display the 2D array in a tabular format.
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/

import java.util.*;

public class VotingEligibility {

    //Method to check if a student can vote based on age
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibility = new String[ages.length][2];  //2D array to hold age and eligibility result
        
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            eligibility[i][0] = String.valueOf(age);  //Storing age as a string
            
            //Checking age and check voting eligibility
            if (age < 0) {
                eligibility[i][1] = "Invalid Age";
            } else if (age >= 18) {
                eligibility[i][1] = "Can Vote";
            } else {
                eligibility[i][1] = "Cannot Vote";
            }
        }
        return eligibility;
    }

    //Method to display the 2D array in a tabular format
    public static void displayEligibility(String[][] eligibility) {
        //Printing the header row
        System.out.println("Age \t\t Voting Eligibility");
        System.out.println("------------------------------");
        
        //Printing each student's age and voting eligibility
        for (int i = 0; i < eligibility.length; i++) {
            System.out.println(eligibility[i][0] + " \t\t " + eligibility[i][1]);
        }
    }

    public static void main(String[] args) {
        //Creating a scanner object for user input
        Scanner input = new Scanner(System.in);

        //Array to store the ages of 10 students
        int[] ages = new int[10];

        //Getting the ages of the students from the user
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        //Calling the method to check voting eligibility
        String[][] eligibility = checkVotingEligibility(ages);

        //Displaying the results in a tabular format
        displayEligibility(eligibility);

        input.close();
    }
}
