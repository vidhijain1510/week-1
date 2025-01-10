/*Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
Hint => 
Create a variable named fee and take user input for fee.
Create another variable discountPercent and take user input.
Compute the discount and assign it to the discount variable.
Compute and print the fee you have to pay by subtracting the discount from the fee.
I/P => fee, discountPrecent
*/
import java.util.*;

public class DiscountAmount{
	public static void main(String[] args){
		int fee, discountPercent, discount, amountAfterDiscount;
		Scanner input = new Scanner(System.in);
		fee = input.nextInt();
		discountPercent = input.nextInt();
		//taking input for fee and discountPercent
		discount = fee * discountPercent /100; //using formula of percentages
		amountAfterDiscount = fee - discount;
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + amountAfterDiscount);
	}
}	
