/*Write a program to take user input for 5 numbers and check whether a number is positive or negative. 
Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less
Hint => 
Write a Method to Check whether the number is positive or negative
Write a Method to check whether the number is even or odd
Write a Method to compare two numbers and return 1 if number1 > number2 or 0 if both are equal or -1 if number1 < number2 
In the main program, Loop through the array using the length call the method isPositive() and if positive call method isEven() and print accordingly 
If the number is negative, print negative. 
Finally compare the first and last element of the array by calling the method compare() and display if they are equal, greater, or less*/
import java.util.*;

public class NumberCheck{

    //Method to check if the number is positive or negative or zero
    public static String isPositive(int number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }

    //Method to check if the number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    //Method to compare two numbers and return 1 if number1 > number2, 0 if equal, or -1 if number1 < number2
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;  //number1 is greater
        } else if (number1 == number2) {
            return 0;  //both numbers are equal
        } else {
            return -1; //number1 is smaller
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];  //Array to store 5 numbers

        //Getting 5 numbers input from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }

        //Looping the array and checking each number
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            String positiveNegative = isPositive(number);

            if (positiveNegative=="positive") {
                String evenOdd = isEven(number);
                System.out.println(number + " is positive and " + evenOdd + ".");
            } else if (positiveNegative == "negative") {
                System.out.println(number + " is negative.");
            } else {
                System.out.println(number + " is zero.");
            }
        }

        //Comparing the first and last numbers in the array
        if (numbers[0] > numbers[4]) {
            System.out.println("The first number is greater than the last number.");
        } else if (numbers[0] == numbers[4]) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        input.close();
    }
}
