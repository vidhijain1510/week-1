/*Write a program to check whether a number is positive, negative, or zero.
Hint => 
Get integer input from the user and store it in the number variable.
If the number is positive, print positive.
If the number is negative, print negative.
If the number is zero, print zero.
*/
import java.util.*;

public class NumberCheck {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Taking input a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Checking if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("positive");//If the number is positive, print positive.
        } else if (number < 0) {
            System.out.println("negative");//If the number is negative, print negative.
        } else {
            System.out.println("zero");//If the number is zero, print zero.
        }

        input.close();
    }
}
