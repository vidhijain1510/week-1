/*Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for number of students
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes
*/
import java.util.*;

public class NumberHandshakes{
	
	//method to find the maximum number of handshakes
	int numberOfHandshakes(int num){
		int maxHandshakes = (num * (num - 1)) / 2;//to calculate the maximum number of possible handshakes
		return maxHandshakes;
	}
	public static void main(String[] args){
		
		//to take user input
		Scanner input = new Scanner(System.in);
		
		//integer input for number of students
		System.out.println("Enter number of students: ");
		int numberOfStudents = input.nextInt();
		
		//creating object numHandshakes
		NumberHandshakes numHandshakes = new NumberHandshakes();
		
		//calling method using object
		int totalHandshakes = numHandshakes.numberOfHandshakes(numberOfStudents);
		
		System.out.println("The num of handshakes among " + numberOfStudents + " number of students: " + totalHandshakes);
		
		input.close();
	}
}
		
		