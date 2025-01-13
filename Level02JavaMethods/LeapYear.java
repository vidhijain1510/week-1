/*Write a program that takes a year as input and outputs the Year is a Leap Year or not 
Hint => 
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. 
Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
Write a method to check for Leap Year using the conditions a and b
*/

import java.util.*;

public class LeapYear {

    //Method to check if a given year is a leap year or not
    public static boolean checkLeapYear(int year) {
        if (year < 1582) {
            System.out.println("Year must be 1582 or later as per the Gregorian calendar.");
            return false;
        }

        //Leap year is divisible by 4 and not divisible by 100 or divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
		return false;
    }

    public static void main(String[] args) {
		
		//To take user input
        Scanner input = new Scanner(System.in);

        //Taking user input for the year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        //Checking if the year is a leap year
        if(checkLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else{
            System.out.println(year + " is not a Leap Year.");
        }

        input.close();
    }
}
