/*Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
Hint => 
Create variables a, b, c of int data type.
Take user input for a, b, and c.
Compute 3 integer operations and assign result to a variable
Finally print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are —-, -—, and —-
*/
import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        
        // Taking input values for a, b, and c
        System.out.print("Enter value of a: ");
        a = input.nextInt();
        
        System.out.print("Enter value of b: ");
        b = input.nextInt();
        
        System.out.print("Enter value of c: ");
        c = input.nextInt();
        
        int result1 = a + b * c;   // Multiplication first, then addition
        int result2 = a * b + c;   // Multiplication first, then addition
        int result3 = c + a / b;   // Division first, then addition
        int result4 = a % b + c;   // Modulus first, then addition
        
        // Printing the results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", and " + result3 + ", and " + result4);
        
        // Close the scanner
        input.close();
    }
}
