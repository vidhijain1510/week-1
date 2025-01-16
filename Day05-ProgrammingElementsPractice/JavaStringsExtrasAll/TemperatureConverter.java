/*Temperature Converter:
Write a program that converts temperatures between Fahrenheit and Celsius. 
The program should have separate functions for converting from Fahrenheit to
Celsius and from Celsius to Fahrenheit.*/

import java.util.*;

public class TemperatureConverter {

    //Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;  //Formula for Fahrenheit to Celsius
    }

    //Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;  //Formula for Celsius to Fahrenheit
    }

    //Function to get the temperature and unit from the user
    public static void getInputAndConvert() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temperature = input.nextDouble();
        
        System.out.print("Enter the unit (C for Celsius or F for Fahrenheit): ");
        char unit = input.next().toUpperCase().charAt(0); 

        // Performing the conversion based on the unit
        if (unit == 'C') {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println(temperature + "°C is equal to " + fahrenheit + "°F");
        } else if (unit == 'F') {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.println(temperature + "°F is equal to " + celsius + "°C");
        } else {
            System.out.println("Invalid unit entered! Please enter 'C' for Celsius or 'F' for Fahrenheit.");
        }
    }

    // Main method
    public static void main(String[] args) {
        getInputAndConvert();
    }
}
