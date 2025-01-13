/*Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Write the method to find the number of chocolates each child gets and number of remaining chocolates
public static int[] findRemainderAndQuotient(int number, int divisor)
*/
import java.util.*;

public class DistributeChocolate {
	// Method to find how many chocolates each child gets and the remaining chocolates
    public static int[] distributeChocolates(int numberOfChocolates, int numberOfChildren) {
        int chocolatePerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[] {chocolatePerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input for the number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        if (numberOfChildren > 0) {
            // Call the method to find the chocolates distribution
            int[] result = distributeChocolates(numberOfChocolates, numberOfChildren);

            // Display the results
            System.out.println("Each child gets: " + result[0] + " chocolates" + "\nRemaining chocolates: " + result[1]);
        } else {
            System.out.println("Number of children must be greater than zero.");
        }

        input.close();
    }

}