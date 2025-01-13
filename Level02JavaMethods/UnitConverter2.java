/*Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertYardsToFeet(double yards) => 
Method to convert yards to feet and return the value. Use following code to convert  double yards2feet = 3;
Method to convert feet to yards and return the value. Use following code to convert  double feet2yards = 0.333333;
Method to convert meters to inches and return the value. Use following code to convert  double meters2inches = 39.3701;
Method to convert inches to meters and return the value. Use following code to convert  double inches2meters = 0.0254;
Method to convert inches to centimeters and return the value. Use the following code  double inches2cm = 2.54;
*/
public class UnitConverter2 {

    //Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;  //1 yard = 3 feet
        return yards * yards2feet;
    }

    //Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;  //1 foot = 0.333333 yards
        return feet * feet2yards;
    }

    //Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;  //1 meter = 39.3701 inches
        return meters * meters2inches;
    }

    //Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;  //1 inch = 0.0254 meters
        return inches * inches2meters;
    }

    //Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;  //1 inch = 2.54 cm
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        //Just checking the methods by giving few examples we can take input values also by passing input code

        //Convert yards to feet
        double yards = 10;
        double convertedFeet = convertYardsToFeet(yards);
        System.out.println(yards + " yards is " + convertedFeet + " feet.");

        //Convert feet to yards
        double feetInput = 30;
        double convertedYards = convertFeetToYards(feetInput);
        System.out.println(feetInput + " feet is " + convertedYards + " yards.");

        // Convert meters to inches
        double metersInput = 5;
        double convertedInches = convertMetersToInches(metersInput);
        System.out.println(metersInput + " meters is " + convertedInches + " inches.");

        //Convert inches to meters
        double inchesToMeters = 100;
        double convertedMeters = convertInchesToMeters(inchesToMeters);
        System.out.println(inchesToMeters + " inches is " + convertedMeters + " meters.");

        //Convert inches to centimeters
        double inchesToCm = 50;
        double convertedCm = convertInchesToCm(inchesToCm);
        System.out.println(inchesToCm + " inches is " + convertedCm + " centimeters.");
    }
}
