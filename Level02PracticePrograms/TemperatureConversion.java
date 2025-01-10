/* Write a TemperaturConversion program, given the temperature in Celsius as input outputs the temperature in Fahrenheit
Hint => 
Create a celsius variable and take the temperature as user input
Use the Formulae Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F and assign to farenheitResult  and print the result
I/P => celcius
O/P =>  The ____ celsius is _____ fahrenheit
*/
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        double celsius, fahrenheitResult;
        Scanner input = new Scanner(System.in);
        
        // Taking Celsius temperature as input from the user
        System.out.print("Enter temperature in Celsius: ");
        celsius = input.nextDouble();
        
        // Formula to convert Celsius to Fahrenheit (°C × 9/5) + 32 = °F 
        fahrenheitResult = (celsius * 9/5) + 32;
        
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");
        
        input.close();
    }
}
