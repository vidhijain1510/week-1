/*Problem 4: Date Comparison Write a program that:
➢ Takes two date inputs and compares them to check if the first date is before, after,
or the same as the second date.
Hint: Use isBefore(), isAfter(), and isEqual() methods from the LocalDate
class.*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {
        //To take user input
        Scanner input = new Scanner(System.in);

        //Defining a DateTimeFormatter to parse the input date in the format "yyyy-MM-dd"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        //Telling user to enter the first date
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstDateInput = input.nextLine();
        
        //Telling the user to enter the second date
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondDateInput = input.nextLine();

        //Parsing the input dates into LocalDate objects
        LocalDate firstDate = LocalDate.parse(firstDateInput, formatter);
        LocalDate secondDate = LocalDate.parse(secondDateInput, formatter);

        //Comparing the dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("Both dates are the same.");
        }
    }
}
