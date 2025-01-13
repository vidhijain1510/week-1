/*
Write a program to find the 3 points that are collinear using the slope formulae and area of triangle formulae. check  A (2, 4), B (4, 6) and C (6, 8) are Collinear for sampling. 
Hint => 
Take inputs for 3 points x1, y1, x2, y2, and x3, y3
Write a Method to find the 3 points that are collinear using the slope formula. The 3 points A(x1,y1), b(x2,y2), and c(x3,y3) are collinear if the slopes formed by 3 points ab, bc, and cd are equal. 
slope AB = (y2 - y1)/(x2 - x1), slope BC = (y3 - y2)/(x3 - x3)
slope AC = (y3 - y1)/(x3 - x1) Points are collinear if
slope AB = slope BC = slope Ac
The method to find the three points is collinear using the area of the triangle formula. The Three points are collinear if the area of the triangle formed by three points is 0. The area of a triangle is 
       

area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2))

*/
import java.util.*;

public class CollinearityChecker {

    // Method to check collinearity using slope formula
    public static boolean arePointsCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Checking if slopes are equal
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using the area of a triangle formula
    public static boolean arePointsCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0; // If the area is 0, points are collinear
    }

    public static void main(String[] args) {
        //To take input
        Scanner input = new Scanner(System.in);

        // Taking input for the three points
        System.out.print("Enter x1 and y1 for Point A: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 and y2 for Point B: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("Enter x3 and y3 for Point C: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Checking collinearity using slope formula
        boolean collinearBySlope = arePointsCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using slope formula: " + collinearBySlope);

        // Checking collinearity using area formula
        boolean collinearByArea = arePointsCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using area formula: " + collinearByArea);

        input.close();
    }
}