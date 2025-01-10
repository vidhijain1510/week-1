/* Similarly, write the DoubleOpt program by taking double values and doing the same operations.
*/
import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter value of a: ");
        a = input.nextDouble();
        
        System.out.print("Enter value of b: ");
        b = input.nextDouble();
        
        System.out.print("Enter value of c: ");
        c = input.nextDouble();
        
        double result1 = a + b * c;   // Multiplication first, then addition
        double result2 = a * b + c;   // Multiplication first, then addition
        double result3 = c + a / b;   // Division first, then addition
        double result4 = a % b + c;   // Modulus first, then addition
        
        System.out.println("The results of double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
        
        input.close();
    }
}