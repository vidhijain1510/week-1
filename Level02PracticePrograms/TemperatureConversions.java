/* Write a TemperaturConversion program, given the temperature in Fahrenheit as input outputs the temperature in Celsius
Hint => 
Create a fahrenheit variable and take the user's input
User the formulae to convert Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C and assign the result to celsiusResult  and print the result
I/P => fahrenheit
O/P => The ____ fahrenheit is _____ celsius
*/
import java.util.Scanner;

public class TemperatureConversions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking Fahrenheit temperature as input from the user
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        // Formula to convert Fahrenheit to Celsius (°F − 32) x 5/9 = °C
        double celsiusResult = (fahrenheit - 32) * 5 / 9;
        
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");
        
        input.close();
    }
}
