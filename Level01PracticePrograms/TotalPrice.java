/*Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___*/
import java.util.*;

public class TotalPrice{
	public static void main(String[] args){
		double unitPrice, quantity, totalPrice;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the unitPrice: ");
		unitPrice = input.nextDouble();
		System.out.println("Enter the quantity: ");
		quantity = input.nextDouble();
		totalPrice = unitPrice * quantity;
		System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
		input.close();
	}
}
		