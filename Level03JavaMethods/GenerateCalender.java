/*Create a program to display a calendar for a given month and year. The program should take the month and year as input from the user and display the calendar for that month. 
E.g. for 07 2005 user input, the program should display the calendar as shown below

Hint => 
Write a Method to get the name of the month. For this define a month Array to store the names of the months
Write a Method to get the number of days in the month. For this define a days Array to store the number of days in each month. For Feb month, 
check for Leap Year to get the number of days. Also, define a Leap Year Method. 
Write a method to get the first day of the month using the Gregorian calendar algorithm
y0 = y − (14 − m) / 12
x = y0 + y0/4 − y0/100 + y0/400
m0 = m + 12 × ((14 − m) / 12) − 2
d0 = (d + x + 31m0 / 12) mod 7
Displaying the Calendar requires 2 for loops. 
The first for loop up to the first day to get the proper indentation. As in the example above 3 spaces from Sun to Thu as to be set as July 1st starts on Fri
The Second for loop Displays the days of the month starting from 1 to the number of days. Add proper indentation for single-digit days using %3d to display the integer right-justified in a field of width 3. Please note to move to the next line after Sat
*/
import java.util.*;

public class GenerateCalender {

    //Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    //Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);//Conditions for leap year
    }

    //Method to get the number of days in a month
    public static int getNumberOfDays(int month, int year) {
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        // February is 29 days in a leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    //Method to calculate the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
		/*The Gregorian Calendar Formula:
        The  Gregorian Calendar Formula is used to calculate the day of the week for a given date is based on the
		assumption that the months are numbered from March as 1 to February as 12 as the calendar year in this formula runs from
		March to February, not from January to December. 
		
		This is how the formula works:

        Month: January and February are treated as months 13 and 14 of the previous year.
        Year: When calculating the day of the week for January or February, the year is adjusted
		(decreased by 1) because these months are part of the previous year calendar according to this formula.
		 
		For January 2025 (month 1), the formula would adjust the month and year as:
		month = 1, which is less than or equal to 2, so:
        month += 12 that is month = 13
        year-- that is year = 2024
        Now the formula calculate the first day of January 2025 as the first day of the 13th month of 2024.
		*/
		
        if (month <= 2) {
            month += 12;
            year--;
        }
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        return d0;  //Gives the first day of the month (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
    }

    //Method to display the calendar
    public static void displayCalendar(int month, int year) {
		
        //We need to get the number of days in the month
        int daysInMonth = getNumberOfDays(month, year);
        //We need to get the name of the month
        String monthName = getMonthName(month);

        //This will print the header of the calendar
        System.out.println("        " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        //Getting the first day of the month
        int firstDay = getFirstDayOfMonth(month, year);

        //Printing the spaces for the days before the 1st
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        //Printing the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            //This will Move to the next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    //Main method 
    public static void main(String[] args) {
		
		//To take user input
        Scanner input = new Scanner(System.in);

        //Taking the month and year as input from the user
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        //To display the calendar for the given month and year
        displayCalendar(month, year);
		
		input.close();
    }
}
