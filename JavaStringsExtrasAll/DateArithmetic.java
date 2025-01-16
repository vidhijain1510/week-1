/*Problem 2: Date Arithmetic Create a program that:
➢ Takes a date input and adds 7 days, 1 month, and 2 years to it.
➢ Then subtracts 3 weeks from the result.
Hint: Use LocalDate.plusDays(), plusMonths(), plusYears(), and
minusWeeks() methods.*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
        //To take user input
        Scanner input = new Scanner(System.in);
        
        //Defining a DateTimeFormatter to parse the input date in the format "yyyy-MM-dd"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        //Telling user to enter a date
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = input.nextLine();

        //Parsing the input date into a LocalDate object
        LocalDate date = LocalDate.parse(inputDate, formatter);

        //Adding 7 days, 1 month, and 2 years to the entered date
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);

        //Subtracting 3 weeks from the result
        newDate = newDate.minusWeeks(3);

        System.out.println("New date after additions and subtractions: " + newDate);
    }
}
