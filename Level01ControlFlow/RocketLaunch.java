import java.util.*;

public class RocketLaunch {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Taking input the starting value for the countdown
        System.out.print("Enter the countdown start value: ");
        int counter = input.nextInt();
        
        // Used a for loop to countdown from the input value to 1
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        
        // After countdown, print launch message
        System.out.println("Rocket Launch!");
        
        input.close();
    }
}
