/*Rework the program 2, especially the Hint f where if index equals maxDigit, we break from the loop. Here we want to modify to Increase the size of the array i,e maxDigit by 10 if the index is equal to maxDigit. This is done to consider all digits to find the largest and second-largest number 
Hint => 
In Hint f inside the loop if the index is equal to maxDigit, increase maxDigit and make digits array to store more elements. 
To do this, we need to create a new temp array of size maxDigit, copy from the current digits array the digits into the temp array, and assign the current digits array to the temp array
Now the digits array will be able to store all digits of the number in the array and then find the largest and second largest number
*/
import java.util.*;

public class LargestAndSecondLargestRework {
    public static void main(String[] args) {
		
		//To take input from user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;

        while (number != 0) {
            if (index == maxDigits) {
                maxDigits += 10;
                int[] temp = new int[maxDigits];//a new temp array of size maxDigit
                System.arraycopy(digits, 0, temp, 0, index);//copy from the current digits array the digits into the temp array
                digits = temp;
            }
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

		//Displaying the results
        System.out.println("Largest digit: " + largest + "\nSecond largest digit: " + secondLargest);

        input.close();
    }
}