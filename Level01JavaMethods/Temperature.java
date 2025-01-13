/*Write a program calculate the wind chill temperature given the temperature and wind speed
Hint => 
Write a method to calculate the wind chill temperature using the formula 
windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed^0.16 
public double calculateWindChill(double temperature, double windSpeed)
*/
import java.util.*;

public class Temperature {
	
	//A method to calculate the wind chill temperature using the formula
    
    public double calculateWindChill(double temperature, double windSpeed){
		double windChill = 35.74 + 0.6215 * temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16);
		return windChill;
		
	}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input 
        System.out.print("Enter the temperature: ");
        double temperature = input.nextDouble();
		
		System.out.print("Enter the windSpeed: ");
        double windSpeed = input.nextDouble();

        //creating object
		Temperature object1 = new Temperature();
		
		//calling method using object
		double windChillResult = object1.calculateWindChill(temperature, windSpeed);
		
		System.out.println("The wind chill temperature is: " + windChillResult);
		

        input.close();
    }

}