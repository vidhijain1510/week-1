/*Write a program to find the side of the square whose parameter you read from user 
Hint => Perimeter of Square is 4 times side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____
*/
import java.util.*;

public class SideOfSquare{
	public static void main(String[] args){
		double perimeter, sideOfSquare;
		Scanner input = new Scanner(System.in);
		perimeter = input.nextDouble();
		sideOfSquare = perimeter/4; //perimeter of square is 4 times side
		System.out.println("The length of the side is " + sideOfSquare + " whose perimeter is " + perimeter);
		input.close();
	}
}