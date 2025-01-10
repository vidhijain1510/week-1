/* Create a program to find the bonus of employees based on their years of service.
Hint => 
Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
Take salary and year of service in the year as input.
Print the bonus amount.
*/
import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // Asking the user to input the salary and years of service
        System.out.print("Enter the employee's salary: ");
        double salary = input.nextDouble();
        
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = input.nextInt();
        
        // Checking if the years of service is greater than 5
        if (yearsOfService > 5) {
            // Calculatint the bonus as 5% of the salary
            double bonus = salary * 0.05;
            System.out.println("The employee's bonus is: " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }

        input.close();
    }
}
