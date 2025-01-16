/*1. Number Guessing Game:
Write a Java program where the user thinks of a number between 1 and 100, and
the computer tries to guess the number by generating random guesses.
The user provides feedback by indicating whether the guess is high, low, or
correct. The program should be modular, with different functions for generating
guesses, receiving user feedback, and determining the next guess.*/


import java.util.*;

public class NumberGuessingGame {
    
    //Function to generate a random guess within the range of 1 to 100
    public static int generateGuess(int low, int high) {
        Random randomGuess = new Random();
        return randomGuess.nextInt(high - low + 1) + low;  //Generates a number between low and high
    }

    //Function to receive user feedback on the guess
    public static String getFeedback() {
        Scanner input = new Scanner(System.in);
        System.out.print("Is my guess correct? (yes, too high, too low): ");
        String feedback = input.nextLine().toLowerCase();
        while (!feedback.equals("yes") && !feedback.equals("too high") && !feedback.equals("too low")) {
            System.out.println("Invalid feedback. Please enter 'yes', 'too high', or 'too low'.");
            System.out.print("Is my guess correct? (yes, too high, too low): ");
            feedback = input.nextLine().toLowerCase();
        }
        return feedback;
    }

    //Function to play the guessing game
    public static void playGame() {
        int low = 1;
        int high = 100;
        int guess;
        String feedback;
        
        System.out.println("Think of a number between 1 and 100, and I will try to guess it.");
        
        //Loop until the correct number is guessed
        while (true) {
            guess = generateGuess(low, high);  // Generate a new guess
            System.out.println("My guess is: " + guess);
            feedback = getFeedback();  // Get user feedback
            
            if (feedback.equals("yes")) {
                System.out.println("Hooray! I guessed the number correctly!");
                break;
            } else if (feedback.equals("too high")) {
                high = guess - 1;  // Adjust the range to be lower
            } else if (feedback.equals("too low")) {
                low = guess + 1;  // Adjust the range to be higher
            }
        }
    }

    public static void main(String[] args) {
        playGame();  //Starting the game
    }
}
