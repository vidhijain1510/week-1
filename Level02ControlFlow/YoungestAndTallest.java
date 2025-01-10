/* Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for the age and height of the 3 friends and store it in a variable
Find the smallest of the 3 ages to find the youngest friend and display it
Find the largest of the 3 heights to find the tallest friend and display it
*/
import java.util.*;

public class YoungestAndTallest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Getting input for ages and heights of the 3 friends
        System.out.print("Enter the age of Amar: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter the height of Amar (in cm): ");
        double heightAmar = input.nextInt();

        System.out.print("Enter the age of Akbar: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter the height of Akbar (in cm): ");
        double heightAkbar = input.nextInt();

        System.out.print("Enter the age of Anthony: ");
        int ageAnthony = input.nextInt();
        System.out.print("Enter the height of Anthony (in cm): ");
        double heightAnthony = input.nextInt();

        // Finding the youngest friend (smallest age)
        String youngestFriend = "";

        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            youngestFriend = "Amar";
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Finding the tallest friend (largest height)
        String tallestFriend = "";

        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            tallestFriend = "Amar";
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Displaying the results
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);

        input.close();
    }
}