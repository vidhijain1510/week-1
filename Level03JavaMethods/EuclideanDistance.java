/*Write a program Euclidean distance between two points as well as the equation of the line using those two points. Use Math functions Math.pow() and Math.sqrt()
Hint => 
Take inputs for 2 points x1, y1, and x2, y2 
Method to find the Euclidean distance between two points and return the distance
distance = (x2-x1)2 +(y2-y1)2 
Write a Method to find the equation of a line given two points and return the equation which includes the slope and the y-intercept
The equation of a line is given by the equation y = m*x + b Where m is the slope and b is the y-intercept. So firstly compute the slope using the formulae 
m = (y2 - y1)/(x2 - x1)
Post that compute the y-intercept b using the formulae 
b = y1 - m*x1  
Finally, return an array having slope m and y-intercept b 
*/
import java.util.*;

public class EuclideanDistance{
	
	//Method to find the Euclidean distance between two points and return the distance
	public static double euclideanDistance(double x1, double y1, double x2, double y2){
		double distance = Math.sqrt(Math.pow((x2-x1),2)) + Math.sqrt(Math.pow((y2-y1),2));
		return distance;
	}
	
	//A method to find the equation of a line given two points
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double[] equation = new double[2]; //Array to store the slope (m) and y-intercept (b)

        //slope: m = (y2 - y1) / (x2 - x1)
        double slope = (y2 - y1) / (x2 - x1);

        //y-intercept: b = y1 - m * x1
        double yIntercept = y1 - slope * x1;

        //slope and y-intercept in the array
        equation[0] = slope;
        equation[1] = yIntercept;

        return equation;
    }
	
	
		
	
	public static void main(String[] args){
		
		//To take input from user
		Scanner input = new Scanner(System.in);
		
		//Taking inputs for 2 points x1, y1, and x2, y2 
		System.out.println("Enter the value of x1: ");
		double x1 = input.nextDouble();
		
		System.out.println("Enter the value of y1: ");
		double y1 = input.nextDouble();
		
		System.out.println("Enter the value of x2: ");
		double x2 = input.nextDouble();
		
		System.out.println("Enter the value of y2: ");
		double y2 = input.nextDouble();
		
		//Calculating and printing the Euclidean distance
        double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.println("The Euclidean distance between the points is: " + distance);

        //Finding and printing the equation of the line
        double[] lineEquation = lineEquation(x1, y1, x2, y2);
        System.out.println("The equation of the line is: y = " + lineEquation[0] + "x + " + lineEquation[1]);
	
		input.close();
	}
}