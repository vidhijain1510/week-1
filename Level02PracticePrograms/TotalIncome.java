/* Create a program to find the total income of a person by taking salary and bonus from user
Hint => 
Create a variable named salary and take user input.
Create another variable bonus and take user input.
Compute income by adding salary and bonus and print the result
I/P => salary, bonus
O/P => The salary is INR ___ and bonus is INR ___. Hence Total Income is INR ___
*/
import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter salary in INR: ");
        double salary = input.nextDouble();
        
        System.out.print("Enter bonus in INR: ");
        double bonus = input.nextDouble();
        
        // Calculate total income by adding salary and bonus
        double totalIncome = salary + bonus;
        
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
        input.close();
    }
}
