/*Create a program to find the shortest, tallest, and mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements/number of elements
Create an int array named heights of size 11 and get 3 digits random height in cms for each player in the range 150 cms to 250 cms
Write the method to Find the sum of all the elements present in the array.
Write the method to find the mean height of the players on the football team
Write the method to find the shortest height of the players on the football team 
Write the method to find the tallest height of the players on the football team
Finally display the results
*/

import java.util.Random;

public class FootballTeam {
	//The method to Find the sum of all the elements present in the array.
    public static int sumAll(int[] heights) {
        int sum = 0;
        for (int i=0; i<heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }
	
	//The method to find the mean height of the players on the football team
    public static double meanAll(int sum, int numberOfPlayers) {
        return (double) sum / numberOfPlayers;
    }
	
	//The method to find the shortest height of the players on the football team 
    public static int shortestOfAll(int[] heights) {
        int shortest = heights[0];
        for (int i=0; i<heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }
        return shortest;
    }
	
	//The method to find the tallest height of the players on the football team
    public static int tallestOfAll(int[] heights) {
        int tallest = heights[0];
        for (int i=0; i<heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
		
        //Creating an array of size 11 to store heights of the players
        int[] heights = new int[11];

        //Randomly generating height of players
        Random randomHeight = new Random();

        //loop to fill up the array with random heights in the range of 150-250 cms
        for (int i = 0; i < heights.length; i++) {
            heights[i] = randomHeight.nextInt(101) + 150; // Random value between 150 and 250 (inclusive)
        }

        //Displaying the heights of players
        System.out.println("Heights of players (in cms):");
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cms");
        }

        //Calling the methods to find the sum, mean, shortest and tallest heights
		//we can call them directly as they are static method and do not need an object to be created
        int sum = sumAll(heights);
        double mean = meanAll(sum, heights.length);
        int shortest = shortestOfAll(heights);
        int tallest = tallestOfAll(heights);

        // Displaying the results
        System.out.println("\nResults:" + "\nSum of heights: " + sum + " cms" + "\nMean height: " + mean + " cms" + "\nShortest height: " + shortest + " cms" + "\nTallest height: " + tallest + " cms");

    }
}

	