import java.util.*;

public class LongestWord {
    public static void main(String[] args) {
        //Creating a scanner object for user input
        Scanner input = new Scanner(System.in);

        //Sentence input
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        //Calling the method to find the longest word and store the result
        String longestWord = findLongestWord(sentence);

        //Longest word
        System.out.println("The longest word is: " + longestWord);

        input.close();
    }

    //Method to find the longest word in the sentence
    public static String findLongestWord(String sentence) {
        //Splitting the sentence into words using space 
        String[] words = sentence.split("\\s+");

        //Initialized the longest word as an empty string
        String longestWord = "";

        //Iterating through the words and find the longest one
        for (int i = 0; i < words.length; i++) {
            //If the current word is longer than the longestWord
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        //Returns the longest word
        return longestWord;
    }
}
