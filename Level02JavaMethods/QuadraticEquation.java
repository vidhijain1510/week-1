/*Write a program Quadratic to find the roots of the equation ax2+ bx + c. Use Math functions Math.pow() and Math.sqrt()
Hint => 
Take a, b, and c as input values to find the roots of x.
The roots are computed using the following formulae
delta = b2+ 4*a*c
If delta is positive the find the two roots using formulae 
root1 of x = (-b + delta)/(2*a) 
root1 of x = (-b - delta)/(2*a)
If delta is zero then there is only one root of x  
root of x = -b/(2*a)
If delta is negative return empty array or nothing 
Write a Method to find find the roots of a quadratic equation and return the roots
*/

import java.util.Scanner;

public class QuadraticEquation{

    //Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        //Calculating delta
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        //If delta is positive, there are two real roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] { root1, root2 };
        }
        //If delta is zero, there is exactly one real root
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] { root };
        } 
        //If delta is negative, there are no real roots
        else {
            return new double[] {};
        }
    }

    public static void main(String[] args) {
        //To take input from user
        Scanner input = new Scanner(System.in);

        //Taking user input for coefficients a, b, and c
        System.out.print("Enter value of a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter value of b: ");
        double b = input.nextDouble();
        
        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        //Getting the roots using the method
        double[] roots = findRoots(a, b, c);

        //Displaying the results
        if (roots.length == 2) {
            System.out.println("The roots of the quadratic equation are:" + "\nRoot 1: " + roots[0] + "\nRoot 2: " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("The root of the quadratic equation is:");
            System.out.println("Root: " + roots[0]);
        } else {
            System.out.println("There are no real roots.");
        }

        input.close();
    }
}
