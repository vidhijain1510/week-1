/*Write a program to find the sum of n natural numbers using loop
Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop */

import java.util.*;
public class NaturalNumbers{
	
	// Method to find the sum of n natural numbers using loop
	int sumNaturalNumber(int num){
		int sum = 0;
		
		for(int i = 0; i <= num; i++){
			sum+=i;
		}
		return sum;
		
	}
		
	public static void main(String[] args){
		
		//To take input from user
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		//creating object
		NaturalNumbers numbers1 = new NaturalNumbers();
		
		//calling method using object
		int sumNumber = numbers1.sumNaturalNumber(number);
		
		System.out.println("The sum of all " + number + " is " + sumNumber);
		
		input.close();
	}
}