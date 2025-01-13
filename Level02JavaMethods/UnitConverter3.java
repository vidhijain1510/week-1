/*Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertFarhenheitToCelsius(double farhenheit) => 
Method to convert Fahrenheit to Celsius and return the value. Use the following code  double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
Method to convert Celsius to Fahrenheit and return the value. Use the following code  double celsius2farhenheit = (celsius * 9 / 5) + 32;
Method to convert pounds to kilograms and return the value. Use the following code  double pounds2kilograms = 0.453592;
Method to convert kilograms to pounds and return the value. Use the following code  double kilograms2pounds = 2.20462; 
Method to convert gallons to liters and return the value. Use following code to convert   double gallons2liters = 3.78541; 
Method to convert liters to gallons and return the value. Use following code to convert  double liters2gallons = 0.264172;*/
public class UnitConverter3 {

    //Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }

    //Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }

    //Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;  
        return pounds * pounds2kilograms;
    }

    //Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    //Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    //Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        //Just checking the methods by giving few examples we can take input values also by passing input code

        // Convert Fahrenheit to Celsius
        double fahrenheitInput = 100;
        double celsiusConverted = convertFahrenheitToCelsius(fahrenheitInput);
        System.out.println(fahrenheitInput + " Fahrenheit is " + celsiusConverted + " Celsius.");

        // Convert Celsius to Fahrenheit
        double celsiusInput = 37;
        double fahrenheitConverted = convertCelsiusToFahrenheit(celsiusInput);
        System.out.println(celsiusInput + " Celsius is " + fahrenheitConverted + " Fahrenheit.");

        // Convert Pounds to Kilograms
        double poundsInput = 150;
        double kilogramsConverted = convertPoundsToKilograms(poundsInput);
        System.out.println(poundsInput + " pounds is " + kilogramsConverted + " kilograms.");

        // Convert Kilograms to Pounds
        double kilogramsInput = 68;
        double poundsConverted = convertKilogramsToPounds(kilogramsInput);
        System.out.println(kilogramsInput + " kilograms is " + poundsConverted + " pounds.");

        // Convert Gallons to Liters
        double gallonsInput = 10;
        double litersConverted = convertGallonsToLiters(gallonsInput);
        System.out.println(gallonsInput + " gallons is " + litersConverted + " liters.");

        // Convert Liters to Gallons
        double litersInput = 25;
        double gallonsConverted = convertLitersToGallons(litersInput);
        System.out.println(litersInput + " liters is " + gallonsConverted + " gallons.");
    }
}
