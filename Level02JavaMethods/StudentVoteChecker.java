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