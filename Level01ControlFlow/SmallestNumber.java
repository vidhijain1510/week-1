/*Write a program to check if the first is the smallest of the 3 numbers.
I/P => number1, number2, number3
O/P => Is the first number the smallest? ____
*/
import java.util.*;
public class SmallestNumber{
	public static void main(String[] args){
		
		 Scanner input = new Scanner(System.in);
        
        // taking input of three numbers
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();
        
        // Check if the first number is the smallest
        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }

        input.close();
    }
}