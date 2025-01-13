/*Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Define an array of 10 integer elements and take user input for the student's age. 
Loop through the array using the length property and for the element of the array check If the age is a negative number print an invalid age and i
f 18 or above, print The student with the age ___ can vote. Otherwise, print The student with the age ___ cannot vote. 
*/
import java.util.*;
public class CanVote{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		
		int [] age = new int[10]; // Making an array of size 10 to input the age of students
		
		System.out.println("Enter the age of 10 Students: ");
		for(int i=0 ; i < age.length; i++){
			age[i] = input.nextInt(); //Taking age as an input
		}
		
		//checking whether the student can vote depending on his/her age is greater or equal to 18.
		for(int i = 0; i < age.length; i++){
			if(age[i] >= 18){
				System.out.println(" The student with the age " + age[i] + " can Vote.");
			}else if(age[i]<0){
				System.out.println("Invalid age");
			}else{
				System.out.println("The student with the age " + age[i] + " cannot vote.");
			}
		}
		
		input.close();
	}
}
		
			