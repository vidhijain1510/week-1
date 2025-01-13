/*Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following. 
 Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertKmToMiles(double km) => 
Method To convert kilometers to miles and return the value. Use the following code  double km2miles = 0.621371;
Method to convert miles to kilometers and return the value. Use the following code  double miles2km = 1.60934;
Method to convert meters to feet and return the value. Use the following code to convert  double meters2feet = 3.28084;
Method to convert feet to meters and return the value. Use the following code to convert  double feet2meters = 0.3048;*/

public class UnitConverter {

    //Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    //Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    //Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    //Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        //Just checking the methods by giving few examples we can take input values also by passing input code

        double km = 10;
        double convertedMiles = convertKmToMiles(km);
        System.out.println(km + " kilometers is " + convertedMiles + " miles.");

        double miles = 5;
        double convertedKm = convertMilesToKm(miles);
        System.out.println(miles + " miles is " + convertedKm + " kilometers.");

        double meters = 100;
        double convertedFeet = convertMetersToFeet(meters);
        System.out.println(meters + " meters is " + convertedFeet + " feet.");

        double feet = 50;
        double convertedMeters = convertFeetToMeters(feet);
        System.out.println(feet + " feet is " + convertedMeters + " meters.");
    }
}



