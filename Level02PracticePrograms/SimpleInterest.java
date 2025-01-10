/* Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => Simple Interest = Principal * Rate * Time / 100
I/P => principal, rate, time
O/P => The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___
*/
import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args) {
  
        Scanner input = new Scanner(System.in);
        // Taking input values for Principal, Rate, and Time
		
        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();
        
        System.out.print("Enter the Rate of Interest: ");
        double rate = input.nextDouble();
        
        System.out.print("Enter the Time period in years: ");
        double time = input.nextDouble();
        
        // Calculate Simple Interest using the formula: SI = (Principal * Rate * Time) / 100
        double simpleInterest = (principal * rate * time) / 100;
        
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal +
                           ", Rate of Interest " + rate + " and Time " + time);
        
        input.close();
    }
}
