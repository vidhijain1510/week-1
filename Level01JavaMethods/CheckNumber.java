/*Write a program to check whether a number is positive, negative, or zero.
Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero
*/
import java.util.*;

public class CheckNumber{
	int checkNatureOfNumber(int num){
		//check whether a number is positive, negative, or zero.
		if(num > 0){
			return 1;//1 for positive number
		}else if(num < 0){
			return -1;//return -1 for negative number
		}else{
			return 0;//0 for number is zero
		}
	}
		
	public static void main(String[] args){
		
		//To take input from user
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		//creating object numHandshakes
		CheckNumber checkNumber1 = new CheckNumber();
		
		//calling method using object
		int natureNumer = checkNumber1.checkNatureOfNumber(number);
		
		System.out.println("The number " + number + " is " + natureNumer);
		
		input.close();
	}
}