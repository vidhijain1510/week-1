/* Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators
*/
import java.util.*;

public class LeapYearUsingMultipleIf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // Asking the user to input a year
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        
        // Ensuring the year is >= 1582
        if (year >= 1582) {
            // Checking if the year is a leap year using multiple if-else statements
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year.");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("The year must be greater than or equal to 1582.");
        }

        input.close();
    }
}

