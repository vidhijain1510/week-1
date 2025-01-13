/*Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it
Hint => 
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Write a Method to find the youngest of the 3 friends
Write a Method to find the tallest of the 3 friends
*/

import java.util.*;

public class YoungestAndTallest {

    //Method to find the youngest friend based on age
    public static String findYoungest(int[] ages, String[] names) {
        int youngestAge = ages[0];
        String youngestFriend = names[0];

        //Comparing ages to find the youngest
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = names[i];
            }
        }
        return youngestFriend;
    }

    //Method to find the tallest friend based on height
    public static String findTallest(int[] heights, String[] names) {
        int tallestHeight = heights[0];
        String tallestFriend = names[0];

        //Comparing heights to find the tallest
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = names[i];
            }
        }
        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Arrays to store the names, ages, and heights of the 3 friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        //User input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter the height of " + names[i] + ": ");
            heights[i] = input.nextInt();
        }

        //The youngest and tallest friends
        String youngestFriend = findYoungest(ages, names);
        String tallestFriend = findTallest(heights, names);

        //Displaying the results
        System.out.println("The youngest friend is: " + youngestFriend + "\nThe tallest friend is: " + tallestFriend);

        input.close();
    }
}
