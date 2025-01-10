/*Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___*/
import java.util.*;

public class AreaOfTriangle{
	public static void main(String[] args){
		double base, height;
		Scanner input = new Scanner(System.in);
		base = input.nextFloat();
		height = input.nextFloat();
		double areaOfTriangle = 0.5 * base * height; //Area of a Triangle is ½ * base * height
		System.out.println("The area of triangle of base " + base + " and height " + height + " is " + areaOfTriangle);
		input.close();
	}
}