/*Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => 
Simple Interest = Principal * Rate * Time / 100
Take user input for principal, rate, time
Write a method to calculate the simple interest given principle, rate and time as parameters
Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”
*/
import java.util.*;

public class CalculateSimpleInterest{
	//method to calculate the simple interest given principle, rate and time as parameters
	double simpleInterest(double p,double r,double t){
		//Simple Interest = Principal * Rate * Time / 100
		double simpleInterest = p * r * t / 100;
		return simpleInterest;
	}
	
	
	
	public static void main(String[] args){
		
		//To take input input from user
		Scanner input = new Scanner(System.in);
		
		//Took user input for principal, rate, time
		System.out.print("Enter the principal: ");
		double principal = input.nextDouble();
		System.out.print("Enter the rate: ");
		double rate = input.nextDouble();
		System.out.print("Enter the time: ");
		double time = input.nextDouble();
		
		//creating object
        CalculateSimpleInterest calculateSI = new CalculateSimpleInterest();
		//calling method using object
		double simpleInterests = calculateSI.simpleInterest(principal,rate,time);
		System.out.println("The Simple Interest is " + simpleInterests + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
		
		input.close();
	}
}