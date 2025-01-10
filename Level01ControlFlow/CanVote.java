/*Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.
Hint => 
Get integer input from the user and store it in the age variable.
If the person is 18 or older, print "The person can vote." Otherwise, print "The person cannot vote." 
I/P => age
O/P => If the person's age is greater or equal to 18 then the output is 
The person's age is ___ and can vote.
Otherwise 
The person's age is ___ and cannot vote.
*/
import java.util.*;
public class CanVote{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//Taking age as a input
		System.out.print("Enter the age of a person: ");
		int age = input.nextInt();
		
		//Checking if person can vote or note
		if(age>=18){
			System.out.println("The person's age is " + age + " and can vote.");//If the person is 18 or older he/she can vote
		}else{
			System.out.println("The person's age is " + age + " and cannot vote.");//If the person is younger than 18 he/she can't vote
		}
		input.close();
	}
}			
		