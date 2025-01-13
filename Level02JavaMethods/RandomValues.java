/*Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value.
 Use Math.random(), Math.min(), and Math.max().
Hint => 
Write a method that generates array of 4 digit random numbers given the size as a parameter as shown in the method signature 
public int[] generate4DigitRandomArray(int size)
Write a method to find average, min and max value of an array 
public double[] findAverageMinMax(int[] numbers) 

*/
import java.util.Random;

public class RandomValues {

    //Method to generate an array random 4-digit numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        
        //Generating random 4-digit numbers and store them in the array
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + (int)(Math.random() * 9000);
        }
        
        return randomNumbers;
    }

    //Method to find the average, min, and max of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        
        //Going through the array by using for loop to find the min, max, and sum
        for (int number : numbers) {
            min = Math.min(min, number);
            max = Math.max(max, number);
            sum += number;
        }
        
        //Calculating the average
        double average = (double) sum / numbers.length;
        
        //This return the results as an array
        return new double[] { average, min, max };
    }

    public static void main(String[] args) {
        //Generating 5 random 4-digit numbers
        int size = 5;
        int[] randomNumbers = generate4DigitRandomArray(size);
        
        //To get the average, min, and max values of the array
        double[] result = findAverageMinMax(randomNumbers);
        
        //Displaying the results
        System.out.println("Random 4-digit numbers: ");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }
        
        System.out.println("\nAverage: " + result[0] + "\nMinimum Value: " + result[1] + "\nMaximum Value: " + result[2]);
    }
}
