/*Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false 
*/

import java.util.*;

public class SpringSeason{
	boolean checkSpringSeason(int month, int day){
		// Method to check for Spring season and return a boolean true or false 
		
		if((month == 4) || (month == 5) || (month == 3 && day >=20)  ||  (month == 6 && day <=20)){
			return true;
		}else{
			return false;
		}
	}
		
	public static void main(String[] args){
		
		//To take input from user
		Scanner input = new Scanner(System.in);
		
		//taking two input values month and day
		System.out.print("Enter a month(in 1-12): ");
		int month = input.nextInt();
		
		System.out.print("Enter a day: ");
		int day = input.nextInt();
		
		//creating object
		SpringSeason checkSpringSeason1 = new SpringSeason();
		
		//calling method using object
		boolean springCheck = checkSpringSeason1.checkSpringSeason(month, day);
		
		if(springCheck){
			System.out.println("The day " + day + " and month " + month + " is spring season.");
		}else{
			System.out.println("The day " + day + " and month " + month + " is not spring season.");
		}
		
		input.close();
	}
}