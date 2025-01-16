/*Count Vowels and Consonants
Problem:
Write a Java program to count the number of vowels and consonants in a given string.*/
import java.util.*;
public class CountVowels{
	//method to count
	public static int[] count(String str){
		int countVowels = 0;
		int countConsonants = 0;
		
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
				countVowels+=1;
			}else if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U'){
				countVowels+=1;
			}else{
				countConsonants+=1;
			}
		}
		
		return new int[] {countVowels, countConsonants};
	}
	public static void main(String[] args){
		//To take user input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String string = input.next();
		int[] counting = count(string);
		
		System.out.println("the no. of vowels in : " + counting[0] );
		System.out.println("the no. of consonants in : " + counting[1] );

		input.close();
	}
}	
