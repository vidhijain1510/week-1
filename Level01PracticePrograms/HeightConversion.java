/*Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___*/
import java.util.*;

public class HeightConversion{
	public static void main(String[] args){
		double heightInCm, heightInFeet, heightInInches;
		Scanner input = new Scanner(System.in);
		heightInCm = input.nextDouble();//taking input for height in centimeters
		heightInInches  = heightInCm / 2.54;// 1 inch = 2.54 cm
		heightInFeet = (int)heightInInches / 12; //1 foot = 12 inches
		int remainingInches = heightInInches % 12;
		System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and inches is " + remainingInches);
	}
}	