/*Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
Hint => 
Create a variable number1 and number 2 and take user inputs.
Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
I/P => number1, number2
O/P => The addition, subtraction, multiplication and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___*/
import java.util.*;

public class Calculator{
	public static void main(String[] args){
		float number1, number2, addition, subtraction, multiplication, division;
		Scanner input = new Scanner(System.in);
		number1 = input.nextFloat();
		number2 = input.nextFloat();
		addition = number1 + number2;
		subtraction = number1 - number2;
		multiplication  = number1 * number2;
		division = number1 / number2;
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + "," + subtraction + "," + multiplication + ", and " +division);
	}
}
		
