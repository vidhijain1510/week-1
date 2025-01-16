/*Write a replace method in Java that replaces a given word with another word in a
sentence:*/

import java.util.*;

public class ReplaceWord {
    public static void main(String[] args) {
        //Creating a scanner object for user input
        Scanner input = new Scanner(System.in);

        //Sentence input
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        //Input for word to replace
        System.out.print("Enter the word to replace: ");
        String wordToReplace = input.nextLine();

        //Input for the word to replace with
        System.out.print("Enter the word to replace with: ");
        String replacementWord = input.nextLine();

        //Calling the replace method to replace the word and store the result
        String modifiedSentence = replaceWord(sentence, wordToReplace, replacementWord);

        //Final sentence
        System.out.println("Modified sentence: " + modifiedSentence);

        input.close();
    }

    //Method to replace a word in the sentence with another word without built-in methods
    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        //Initialized a result StringBuilder to build the modified sentence
        StringBuilder result = new StringBuilder();

        //Starting searching through the sentence
        int i = 0;
        while (i < sentence.length()) {
            //Checking if the substring starting from i matches the wordToReplace
            if (i + wordToReplace.length() <= sentence.length() && 
                sentence.substring(i, i + wordToReplace.length()).equalsIgnoreCase(wordToReplace)) {
                //Append the replacementWord to the result
                result.append(replacementWord);
                //Skips over the replaced word
                i += wordToReplace.length();
            } else {
                //If not matching, append the current character to the result
                result.append(sentence.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
}
