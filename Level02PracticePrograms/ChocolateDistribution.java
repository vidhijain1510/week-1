/* Create a program to divide N number of chocolates among M children.
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Find the number of chocolates each child gets and number of remaining chocolates
Display the results
I/P => numberOfchocolates, numberOfChildren
O/P => The number of chocolates each child gets is ___ and the number of remaining chocolates are ___
 */
import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Taking input for the number of chocolates and the number of children
		
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        
        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();
        
        // Check if the number of children is zero to avoid division by zero
        if (numberOfChildren == 0) {
            System.out.println("Error: The number of children cannot be zero.");
        } else {
            // Calculate the number of chocolates each child gets
            int chocolatesPerChild = numberOfChocolates / numberOfChildren;
            
            // Calculate the number of remaining chocolates
            int remainingChocolates = numberOfChocolates % numberOfChildren;
            
            System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + 
                               " and the number of remaining chocolates are " + remainingChocolates);
        }
        
        input.close();
    }
}
