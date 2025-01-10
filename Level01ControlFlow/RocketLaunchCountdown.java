/* 8.  Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch Hint => Create a variable counter to take user inputted value for the countdown. Use the while loop to check if the counter is 1 Inside a while loop, print the value of the counter and decrement the counter.*/

import java.util.*;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        //Input the starting value for the countdown
        System.out.print("Enter the countdown start value: ");
        int counter = input.nextInt();
        
        //countdown from the input value to 1
        while (counter >= 1) {
            System.out.println(counter);
            counter--;  // Decrement the counter by 1 after each print
        }
        
        // After countdown, print launch message
        System.out.println("Rocket Launch!");

        input.close();
    }
}
